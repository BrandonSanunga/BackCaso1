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

import com.grupo3.Caso1.Model.vehiculo_catalogo;
import com.grupo3.Caso1.Service.Postgres.vehiculo_catalogoService;


@RestController
@RequestMapping("/vehiculo_catalogo/api/v1")
@CrossOrigin("*")
public class vehiculo_catalogoController {
	
	@Autowired
	private vehiculo_catalogoService vehiculoservice;
	
	
	@GetMapping(value="/all")
	public List<vehiculo_catalogo> getAll(){
		return vehiculoservice.getAll();
	}

	@GetMapping(value="/find/{id_vehiculo_catalogo}")
	public vehiculo_catalogo find(@PathVariable Long id_vehiculo_catalogo) {
		return vehiculoservice.get(id_vehiculo_catalogo);
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<vehiculo_catalogo> save(@RequestBody vehiculo_catalogo vehiculocatalogo){
		vehiculo_catalogo obj= vehiculoservice.save(vehiculocatalogo);
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}
	
	@GetMapping(value="/delete/{id_vehiculo_catalogo}")
	public ResponseEntity<vehiculo_catalogo> delete(@PathVariable Long id_vehiculo_catalogo){
		vehiculo_catalogo vehiculocatalogo= vehiculoservice.get(id_vehiculo_catalogo);
		if(vehiculocatalogo != null) {
			vehiculoservice.delete(id_vehiculo_catalogo);
		}else {
			return new ResponseEntity<vehiculo_catalogo>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<vehiculo_catalogo>(vehiculocatalogo, HttpStatus.OK);
	}


}
