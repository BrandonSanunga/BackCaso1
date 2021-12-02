package com.grupo3.Caso1.Controller.Posgrest.ordenReparacion;

import java.util.List;

import com.grupo3.Caso1.Model.ordenReparacion.ordenRepCavecera;
import com.grupo3.Caso1.Service.Posgrest.ordenReparacion.ordenRepaCaveceraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ordencave/api/v1")
@CrossOrigin("*")
public class ordenRepaCaveceraController {
    @Autowired
    private ordenRepaCaveceraService ordenRepaCaveceraService;

    @GetMapping(value = "/all")
    public List<ordenRepCavecera> getall() {
        return ordenRepaCaveceraService.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public ordenRepCavecera find(@PathVariable(value = "id") Long id) {
        return ordenRepaCaveceraService.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<ordenRepCavecera> save(@RequestBody ordenRepCavecera ordenRepCavecera) {
        ordenRepCavecera obj = ordenRepaCaveceraService.save(ordenRepCavecera);
        return new ResponseEntity<ordenRepCavecera>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<ordenRepCavecera> delete(@PathVariable(value = "id") Long id) {
        ordenRepCavecera obj = ordenRepaCaveceraService.get(id);
        if (obj != null) {
            ordenRepaCaveceraService.delete(id);
        } else {
            return new ResponseEntity<ordenRepCavecera>(HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<ordenRepCavecera>(obj, HttpStatus.OK);
    }
}
