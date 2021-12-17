package com.grupo3.Caso1.Service.Posgrest.ServiceImp;

import com.grupo3.Caso1.Commons.Utils;
import com.grupo3.Caso1.Dao.Posgrest.DetalleOrdenRepository;
import com.grupo3.Caso1.Dao.Posgrest.ordenReparacion.ordenRepCuerpoRepo;
import com.grupo3.Caso1.Dao.Postgres.RepuestoRepository;
import com.grupo3.Caso1.Mappers.TallerMapper;
import com.grupo3.Caso1.Model.LabelValue;
import com.grupo3.Caso1.Model.Repuestos;
import com.grupo3.Caso1.Model.ordenReparacion.DetalleRepuestos;
import com.grupo3.Caso1.Model.ordenReparacion.ordenRepCuerpo;
import com.grupo3.Caso1.Reports.InformeReparacionContext;
import com.grupo3.Caso1.Reports.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class TallerService {

    @Autowired
    private RepuestoRepository repuestoRepository;
    @Autowired
    private ordenRepCuerpoRepo ordenRepCuerpoRepo;
    @Autowired
    private DetalleOrdenRepository detalleOrdenRepository;

    public List<Map<String, Object>> getRepuestos() {
        return repuestoRepository.findAll().stream().map(TallerMapper::mappRepuesto).collect(Collectors.toList());
    }

    public Map<String, Object> addRepuestoToOrden(Long ordenId, Long repuestoId) {
        DetalleRepuestos detalle = new DetalleRepuestos();
        Repuestos repuesto = new Repuestos();
        repuesto.setId_repuesto(repuestoId);
        detalle.setRepuesto(repuesto);

        detalle.setOrden(ordenRepCuerpoRepo.findById(ordenId).get());
        detalle.setEstado("PENDIENTE");
        DetalleRepuestos detalleBD = detalleOrdenRepository.save(detalle);

        Map<String, Object> json = new HashMap<>();
        json.put("status", "created");
        json.put("id", detalleBD.getId());
        return json;
    }

    public List<Map<String, Object>> getRepuestosSolicitados(Long ordenId) {
        return detalleOrdenRepository.getDetalleRepuestosByIdOrden(ordenId).stream().map(TallerMapper::mappDetalleRepuestos).collect(Collectors.toList());
    }

    public Map<String, Object> deleteDetalleRepuesto(Long id) {
        Map<String, Object> json = new HashMap<>();
        try {
            detalleOrdenRepository.deleteById(id);
            json.put("status", "deleted");
        } catch (Exception e) {
            json.put("status", "error");
        }

        return json;

    }

    public Map<String, Object> generarInformeReparacion(Long ordenId) {
        Map<String, Object> json = new HashMap<>();

        Optional<ordenRepCuerpo> ordenBD = ordenRepCuerpoRepo.findById(ordenId);
        if (ordenBD.isPresent()) {
            ordenRepCuerpo orden = ordenBD.get();
            Map<String, Object> objectMap = TallerMapper.mappOrden(orden);

            List<LabelValue> labelValues = (List<LabelValue>) objectMap.get("detallesVehiculo");

            InformeReparacionContext context = new InformeReparacionContext();
            String repuestos = orden.getDetalleRepuestos().stream().map((obj) -> obj.getRepuesto().getNombre_repuesto()).collect(Collectors.joining("\n"));

            String detallesLabels = labelValues.stream().map(LabelValue::getLabel).collect(Collectors.joining("\n"));
            String detallesValues = labelValues.stream().map(obj -> obj.getValue().toString()).collect(Collectors.joining("\n"));

            context.setOrden(String.valueOf(orden.getIdordenCuerpo()));
            context.setCliente(orden.getOrdenRepCavecera().getInspeCuerpo().getInspeCavecera().getInformeReclamo().getClient().getClienteLabel());
            context.setFecha(Utils.formatDate(orden.getOrdenRepCavecera().getFechaIngreso()));
            context.setEstado(orden.getEstadoOrden());
            context.setObservaciones(orden.getObservaciones());
            context.setNombresRepuestos(repuestos.trim());
            context.setDetallesLabels(detallesLabels.toUpperCase().trim());
            context.setDetallesValues(detallesValues.toUpperCase().trim());


            Report<InformeReparacionContext> report = new Report<>("template", context);

            report.generate();
            json.put("status", "created");
        } else {
            json.put("status", "error");
        }
        return json;
    }
}
