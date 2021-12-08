package com.grupo3.Caso1.Controller.Posgrest;

import java.util.List;

import com.grupo3.Caso1.Model.InformeReclamo;
import com.grupo3.Caso1.Service.Posgrest.InformeReclamoService;

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
@RequestMapping("/inforech/api/v1")
@CrossOrigin("*")
public class InformeReclamoController {
    @Autowired
    private InformeReclamoService informeRechazoService;

    @GetMapping(value = "/all")
    public List<InformeReclamo> getAll() {
        return informeRechazoService.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public InformeReclamo find(@PathVariable(value = "id") Long id) {
        return informeRechazoService.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<InformeReclamo> save(@RequestBody InformeReclamo informeRechazo) {
        InformeReclamo obj = informeRechazoService.save(informeRechazo);
        return new ResponseEntity<InformeReclamo>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<InformeReclamo> delete(@PathVariable(value = "id") Long id) {
        InformeReclamo informeRechazo = informeRechazoService.get(id);
        if (informeRechazo != null) {
            informeRechazoService.delete(id);
        } else {
            return new ResponseEntity<InformeReclamo>(HttpStatus.OK);
        }
        return new ResponseEntity<InformeReclamo>(informeRechazo, HttpStatus.OK);
    }
}
