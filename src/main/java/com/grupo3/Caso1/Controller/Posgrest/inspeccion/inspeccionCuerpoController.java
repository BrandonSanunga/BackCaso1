package com.grupo3.Caso1.Controller.Posgrest.inspeccion;

import java.util.List;

import com.grupo3.Caso1.Model.Inspeccion.inspeCuerpo;
import com.grupo3.Caso1.Service.Posgrest.Inspeccion.inspeCuerpoService;

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
@RequestMapping(value = "/inspcuerpo/api/v1")
@CrossOrigin("*")
public class inspeccionCuerpoController {
    @Autowired
    private inspeCuerpoService inspeCuerpoService;

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
}
