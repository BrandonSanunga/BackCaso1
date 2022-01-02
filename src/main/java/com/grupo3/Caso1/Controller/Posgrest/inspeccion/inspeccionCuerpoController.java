package com.grupo3.Caso1.Controller.Posgrest.inspeccion;

import java.util.List;

import com.grupo3.Caso1.Model.Inspeccion.inspeCuerpo;
import com.grupo3.Caso1.Service.Posgrest.Inspeccion.inspeCuerpoService;
import com.grupo3.Caso1.Service.Posgrest.ServiceImp.Inspeccion.inspeccionCuerpoServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/inspcuerpo/api/v1")
@CrossOrigin("*")
public class inspeccionCuerpoController {
    @Autowired
    private inspeCuerpoService inspeCuerpoService;
    @Autowired
    private inspeccionCuerpoServiceImp inspeccionCuerpoServiceImp2;

    @GetMapping(value = "all")
    public List<inspeCuerpo> getAll() {
        return inspeCuerpoService.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public inspeCuerpo find(@PathVariable(value = "id") Long id) {
        return inspeCuerpoService.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<inspeCuerpo> save(@RequestBody inspeCuerpo inspeCuerpo) {
        inspeCuerpo obj = inspeCuerpoService.save(inspeCuerpo);
        return new ResponseEntity<inspeCuerpo>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<inspeCuerpo> delete(@PathVariable(value = "id") Long id) {
        inspeCuerpo obj = inspeCuerpoService.get(id);
        if (obj != null) {
            inspeCuerpoService.delete(id);
        } else {
            return new ResponseEntity<inspeCuerpo>(HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<inspeCuerpo>(obj, HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @JsonIgnore
    public @ResponseBody ResponseEntity<?> update(@RequestBody inspeCuerpo inspeCuerpo) {

        inspeCuerpo insp = inspeCuerpoService.get(inspeCuerpo.getIdinspeCuerpo());
        inspeCuerpo insp1 = null;
        insp.setBateria(inspeCuerpo.getBateria());
        insp.setCinturones(inspeCuerpo.getCinturones());
        insp.setDireccion(inspeCuerpo.getDireccion());
        insp.setEje(inspeCuerpo.getEje());
        insp.setEscape(inspeCuerpo.getEscape());
        insp.setFiltro_aire(inspeCuerpo.getFiltro_aire());
        insp.setFiltro_cabina(inspeCuerpo.getFiltro_cabina());
        insp.setFrenos(inspeCuerpo.getFrenos());
        insp.setIdinspeCuerpo(inspeCuerpo.getIdinspeCuerpo());
        insp.setInspeCavecera(inspeCuerpo.getInspeCavecera());
        insp.setLiquido_transmicion(inspeCuerpo.getLiquido_transmicion());
        insp.setLuces(inspeCuerpo.getLuces());
        insp.setObservaciones(inspeCuerpo.getObservaciones());
        insp.setParabrisas(inspeCuerpo.getParabrisas());
        insp.setPatron_desgaste_neomatico(inspeCuerpo.getPatron_desgaste_neomatico());
        insp.setRefrigerante(inspeCuerpo.getRefrigerante());
        insp.setSuspencion(inspeCuerpo.getSuspencion());
        insp.setTipo_reparacion_neomatico(inspeCuerpo.getTipo_reparacion_neomatico());
        insp1 = inspeCuerpoService.save(insp);

        System.out.println(inspeCuerpo);
        // inspeccionCuerpoServiceImp2.update(inspeCuerpo);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
