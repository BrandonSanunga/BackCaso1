package com.grupo3.Caso1.Service.Posgrest.ServiceImp.OrdenReparacion;

import com.grupo3.Caso1.Commons.GenericServiceImp;
import com.grupo3.Caso1.Dao.Posgrest.ordenReparacion.ordenRepCuerpoRepo;
import com.grupo3.Caso1.Model.ordenReparacion.ordenRepCavecera;
import com.grupo3.Caso1.Model.ordenReparacion.ordenRepCuerpo;
import com.grupo3.Caso1.Service.Posgrest.ordenReparacion.ordenRepCuerpoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ordenRepaCuerpoServiceImp extends GenericServiceImp<ordenRepCuerpo, Long> implements ordenRepCuerpoService {

    @Autowired
    private ordenRepCuerpoRepo ordenRepCuerpoRepo;

    @Override
    public CrudRepository<ordenRepCuerpo, Long> getDao() {
        // TODO Auto-generated method stub
        return ordenRepCuerpoRepo;
    }

    public ordenRepCuerpo update(ordenRepCuerpo ordenRepCuerpo, Long id) {
        if (ordenRepCuerpoRepo.findById(id) != null) {
            return ordenRepCuerpoRepo.save(ordenRepCuerpo);
        } else {
            return null;
        }
    }

    @Override
    public List<Map<String, Object>> getOrdenesTaller(String estado) {
        List<Map<String, Object>> ordenes = new ArrayList<>();
        List<ordenRepCuerpo> ordenesRep = ordenRepCuerpoRepo.getOrdenesTaller(estado);
        ordenesRep.forEach(obj -> {

            Map<String, Object> json = new HashMap<>();
            json.put("id", obj.getIdordenCuerpo());
            json.put("persona", obj.getOrdenRepCavecera().getInspeCuerpo().getInspeCavecera().getInformeReclamo().getClient().getClienteObject());
            json.put("fechaIngreso", obj.getOrdenRepCavecera().getFechaIngresoWithFormat());
            json.put("estado", obj.getEstadoOrden());

            Map<String, Object> vehiculo = new HashMap<>();
            vehiculo.put("id", 1);
            vehiculo.put("modelo", "2010");
            vehiculo.put("marca", "TOYOTA");
            vehiculo.put("label", "TOYOTA | 2010");
            json.put("vehiculo", vehiculo);

            ordenes.add(json);
        });
        return ordenes;
    }
}
