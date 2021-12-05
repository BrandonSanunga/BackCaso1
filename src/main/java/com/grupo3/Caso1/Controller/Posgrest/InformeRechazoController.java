package com.grupo3.Caso1.Controller.Posgrest;

import java.util.List;

import com.grupo3.Caso1.Model.InformeRechazo;
import com.grupo3.Caso1.Service.Posgrest.InformeRechazoService;

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
public class InformeRechazoController {
    @Autowired
    private InformeRechazoService informeRechazoService;

    @GetMapping(value = "/all")
    public List<InformeRechazo> getAll() {
        return informeRechazoService.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public InformeRechazo find(@PathVariable(value = "id") Long id) {
        return informeRechazoService.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<InformeRechazo> save(@RequestBody InformeRechazo informeRechazo) {
        InformeRechazo obj = informeRechazoService.save(informeRechazo);
        return new ResponseEntity<InformeRechazo>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<InformeRechazo> delete(@PathVariable(value = "id") Long id) {
        InformeRechazo informeRechazo = informeRechazoService.get(id);
        if (informeRechazo != null) {
            informeRechazoService.delete(id);
        } else {
            return new ResponseEntity<InformeRechazo>(HttpStatus.OK);
        }
        return new ResponseEntity<InformeRechazo>(informeRechazo, HttpStatus.OK);
    }
}
