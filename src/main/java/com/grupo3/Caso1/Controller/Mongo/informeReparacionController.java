package com.grupo3.Caso1.Controller.Mongo;

import java.util.List;

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

import com.grupo3.Caso1.Model.informeReparacion;
import com.grupo3.Caso1.Service.Mongo.informeReparacionService;

@RestController
@RequestMapping("/comercializadora/api/v1")
@CrossOrigin("*")
public class informeReparacionController {

	@Autowired
	private informeReparacionService informeService;
	
	@GetMapping(value="/all")
	public List<informeReparacion> getAll(){
		return informeService.getAll();
	}

	@GetMapping(value="/find/{id_informe}")
	public informeReparacion find(@PathVariable String id_informe) {
		return informeService.get(id_informe);
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<informeReparacion> save(@RequestBody informeReparacion informe){
		informeReparacion obj= informeService.save(informe);
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}
	
	@GetMapping(value="/delete/{id_informe}")
	public ResponseEntity<informeReparacion> delete(@PathVariable String id_informe){
		informeReparacion informe= informeService.get(id_informe);
		if(informe != null) {
			informeService.delete(id_informe);
		}else {
			return new ResponseEntity<informeReparacion>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<informeReparacion>(informe, HttpStatus.OK);
	}
}
