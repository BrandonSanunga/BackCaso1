package com.grupo3.Caso1.Controller.Postgres;

import java.util.ArrayList;
import java.util.List;

import com.grupo3.Caso1.Service.Postgres.RepuestoService;
import com.grupo3.Caso1.Service.Postgres.ServiceImpPostgres.RepuestoServiceImp;
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

import com.grupo3.Caso1.Model.Repuestos;

@RestController
@RequestMapping("/repuestos/api/v1")
@CrossOrigin("*")
public class RepuestosController {

    @Autowired
    private RepuestoService repuestoservice;

    @GetMapping(value = "/all")
    public List<Repuestos> getAll() {
        return repuestoservice.getAll();
    }

    @GetMapping(value = "/find/{id_repuesto}")
    public Repuestos find(@PathVariable String id_repuesto) {
        return repuestoservice.get(id_repuesto);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Repuestos> save(@RequestBody Repuestos repuesto) {
        Repuestos obj = repuestoservice.save(repuesto);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id_repuesto}")
    public ResponseEntity<Repuestos> delete(@PathVariable String id_repuesto) {
        Repuestos repuesto = repuestoservice.get(id_repuesto);
        if (repuesto != null) {
            repuestoservice.delete(id_repuesto);
        } else {
            return new ResponseEntity<Repuestos>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Repuestos>(repuesto, HttpStatus.OK);
    }

    @GetMapping(value = "/find-by-id-disenio/{idDisenio}")
    public ResponseEntity<ArrayList<Repuestos>> findRepuestosByIdDisenio(@PathVariable String idDisenio) {
        System.out.println(idDisenio);
        ArrayList<Repuestos> repuestos = repuestoservice.findAllByIdDisenio(idDisenio);
        return new ResponseEntity<ArrayList<Repuestos>>(repuestos, HttpStatus.OK);
    }

}
