package com.grupo3.Caso1.Controller.Posgrest.inspeccion;

import java.util.List;

import com.grupo3.Caso1.Model.Inspeccion.inspeCavecera;
import com.grupo3.Caso1.Service.Posgrest.Inspeccion.inspeCaveceraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/inspecciCave/api/v1")
@CrossOrigin("*")
public class inspeccionCaveceraController {
    @Autowired
    private inspeCaveceraService inspeCaveceraService;

    @GetMapping(value = "/all")
    public List<inspeCavecera> getAll() {
        return inspeCaveceraService.getAll();
    }

    @GetMapping("/find/{id}")
    public inspeCavecera getid(@PathVariable(value = "id") Long id) {
        return inspeCaveceraService.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<inspeCavecera> save(@RequestBody inspeCavecera inspeCavecera) {
        inspeCavecera obj = inspeCaveceraService.save(inspeCavecera);
        return new ResponseEntity<inspeCavecera>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<inspeCavecera> delete(@PathVariable(value = "id") Long id) {
        inspeCavecera obj = inspeCaveceraService.get(id);
        if (obj != null) {
            inspeCaveceraService.delete(id);
        } else {
            return new ResponseEntity<inspeCavecera>(HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<inspeCavecera>(obj, HttpStatus.OK);
    }

}
