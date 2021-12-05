package com.grupo3.Caso1.Controller.Posgrest;

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

import com.grupo3.Caso1.Model.Vehiculo;
import com.grupo3.Caso1.Service.Posgrest.VehiculoService;

@RestController
@RequestMapping("/vehiculo/api/v1")
@CrossOrigin("*")
public class VehiculoController {
	@Autowired
	private VehiculoService vehiculoService;

	@GetMapping(value = "/all")
	public List<Vehiculo> getAll() {
		return vehiculoService.getAll();
	}

	@GetMapping(value = "/find/{id}")
	public Vehiculo find(@PathVariable(value = "id") Long id) {
		return vehiculoService.get(id);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<Vehiculo> save(@RequestBody Vehiculo vehiculo) {
		Vehiculo obj = vehiculoService.save(vehiculo);
		return new ResponseEntity<Vehiculo>(obj, HttpStatus.OK);
	}

	/*
	 * Metodo Prueba
	 * 
	 * @PostMapping("/vh")
	 * 
	 * @ResponseStatus(HttpStatus.CREATED) public Vehiculo create(@RequestBody
	 * Vehiculo vehiculo)
	 * {
	 * return vehiculoService.save(vehiculo);
	 * }
	 */
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<Vehiculo> delete(@PathVariable(value = "id") Long id) {
		Vehiculo vehiculo = vehiculoService.get(id);
		if (vehiculo != null) {
			vehiculoService.delete(id);
		} else {
			return new ResponseEntity<Vehiculo>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Vehiculo>(vehiculo, HttpStatus.OK);
	}

}
