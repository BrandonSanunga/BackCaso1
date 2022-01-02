package com.grupo3.Caso1.Controller.Posgrest.ordenReparacion;

import com.grupo3.Caso1.Model.ordenReparacion.ordenRepCavecera;
import com.grupo3.Caso1.Service.Posgrest.ServiceImp.OrdenReparacion.ordenRepaCaveceraServiceImp;
import com.grupo3.Caso1.Service.Posgrest.ordenReparacion.ordenRepaCaveceraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.grupo3.Caso1.Model.Inspeccion.inspeCuerpo;
import com.grupo3.Caso1.Service.Posgrest.Inspeccion.inspeCuerpoService;

@RestController
@RequestMapping(value = "/ordencave/api/v1")
@CrossOrigin("*")
public class ordenRepaCaveceraController {
    @Autowired
    private ordenRepaCaveceraService ordenRepaCaveceraService;
    @Autowired
    private ordenRepaCaveceraServiceImp ordenRepaCaveceraServiceImp2;

    @Autowired
    private inspeCuerpoService inspeserv;

    @GetMapping(value = "/all")
    public List<ordenRepCavecera> getall() {
        return ordenRepaCaveceraService.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public ordenRepCavecera find(@PathVariable(value = "id") Long id) {
        return ordenRepaCaveceraService.get(id);
    }

    @PostMapping(value = "/save/{id}")
    public ResponseEntity<ordenRepCavecera> save(@PathVariable(name = "id") Long id,
            @RequestBody ordenRepCavecera ordencab) {
        inspeCuerpo inspe = new inspeCuerpo();
        inspe = inspeserv.get(id);
        ordencab.setInspeCuerpo(inspe);
        ordenRepCavecera obj = ordenRepaCaveceraService.save(ordencab);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{idordenCave}")
    public ResponseEntity<Boolean> delete(@PathVariable("idordenCave") Long idordenCave) {
        ordenRepaCaveceraService.delete(idordenCave);
        return ResponseEntity.ok(!(ordenRepaCaveceraService.get(idordenCave) != null));
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<ordenRepCavecera> update(@RequestBody ordenRepCavecera ordenRepCavecera,
            @PathVariable(name = "id") Long id) {
        if (ordenRepaCaveceraServiceImp2.update(ordenRepCavecera, id) != null) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

}
