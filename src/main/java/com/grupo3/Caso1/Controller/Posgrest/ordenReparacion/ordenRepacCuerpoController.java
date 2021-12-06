package com.grupo3.Caso1.Controller.Posgrest.ordenReparacion;

import java.util.List;

import com.grupo3.Caso1.Model.ordenReparacion.ordenRepCuerpo;
import com.grupo3.Caso1.Service.Posgrest.ServiceImp.OrdenReparacion.ordenRepaCuerpoServiceImp;
import com.grupo3.Caso1.Service.Posgrest.ordenReparacion.ordenRepCuerpoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ordecuerpo/api/v1")
@CrossOrigin("*")
public class ordenRepacCuerpoController {
    @Autowired
    public ordenRepCuerpoService ordenRepCuerpoService;
    public ordenRepaCuerpoServiceImp ordenRepaCuerpoServiceImp2;

    @GetMapping(value = "/getall")
    public List<ordenRepCuerpo> getAll() {
        return ordenRepCuerpoService.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public ordenRepCuerpo find(@RequestParam(value = "id") Long id) {
        return ordenRepCuerpoService.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<ordenRepCuerpo> save(@RequestBody ordenRepCuerpo ordenRepCuerpo) {
        ordenRepCuerpo obj = ordenRepCuerpoService.save(ordenRepCuerpo);
        return new ResponseEntity<ordenRepCuerpo>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<ordenRepCuerpo> delete(@RequestParam(value = "id") Long id) {
        ordenRepCuerpo obj = ordenRepCuerpoService.get(id);
        if (obj != null) {
            ordenRepCuerpoService.delete(id);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<ordenRepCuerpo>(obj, HttpStatus.OK);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<ordenRepCuerpo> update(@PathVariable(name = "id") Long id,
            @RequestBody ordenRepCuerpo ordenRepCuerpo) {
        if (ordenRepaCuerpoServiceImp2.update(ordenRepCuerpo, id) != null) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
