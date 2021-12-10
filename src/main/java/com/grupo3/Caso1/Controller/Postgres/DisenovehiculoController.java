package com.grupo3.Caso1.Controller.Postgres;

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

import com.grupo3.Caso1.Model.Disenovehiculo;
import com.grupo3.Caso1.Service.Postgres.DisenovehiculoService;


@RestController
@RequestMapping("/diseno/api/v1")
@CrossOrigin("*")
public class DisenovehiculoController {

	@Autowired
	private DisenovehiculoService disenoservice;
	
	@GetMapping(value="/all")
	public List<Disenovehiculo> getAll(){
		return disenoservice.getAll();
	}

	@GetMapping(value="/find/{id_diseno}")
	public Disenovehiculo find(@PathVariable Long id_diseno) {
		return disenoservice.get(id_diseno);
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<Disenovehiculo> save(@RequestBody Disenovehiculo diseno){
		Disenovehiculo obj= disenoservice.save(diseno);
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}
	
	@GetMapping(value="/delete/{id_diseno}")
	public ResponseEntity<Disenovehiculo> delete(@PathVariable(value="id_diseno") Long id_diseno){
		Disenovehiculo diseno= disenoservice.get(id_diseno);
		if(diseno != null) {
			disenoservice.delete(id_diseno);
		}else {
			return new ResponseEntity<Disenovehiculo>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Disenovehiculo>(diseno, HttpStatus.OK);
	}


}
