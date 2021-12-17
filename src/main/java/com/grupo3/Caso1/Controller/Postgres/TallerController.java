package com.grupo3.Caso1.Controller.Postgres;

import com.grupo3.Caso1.Service.Posgrest.ServiceImp.TallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/taller/api/v1/")
@CrossOrigin("*")
public class TallerController {

    @Autowired
    private TallerService tallerService;

    @GetMapping("respuestos")
    private List<Map<String, Object>> getRepuestos() {
        return tallerService.getRepuestos();
    }

    @PostMapping("add-repuesto/{ordenId}/{repuestoId}")
    private Map<String, Object> addRepuestoToOrden(@PathVariable("ordenId") Long ordenId, @PathVariable("repuestoId") Long repuestoId) {
        return tallerService.addRepuestoToOrden(ordenId, repuestoId);
    }

    @GetMapping("repuesto-solicitados/{ordenId}")
    private List<Map<String, Object>> getRepuestosSolicitados(@PathVariable("ordenId") Long ordenId) {
        return tallerService.getRepuestosSolicitados(ordenId);
    }

    @DeleteMapping("delete-detalle-repuesto/{id}")
    private Map<String, Object> deleteDetalleRepuesto(@PathVariable("id") Long id) {
        return tallerService.deleteDetalleRepuesto(id);
    }

    @GetMapping("informe-reparacion/{ordenId}")
    private Map<String, Object> generarInformeReparacion(@PathVariable("ordenId") Long ordenId) {
        return tallerService.generarInformeReparacion(ordenId);
    }
}
