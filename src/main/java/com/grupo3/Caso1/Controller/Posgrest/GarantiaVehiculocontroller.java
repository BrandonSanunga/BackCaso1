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

import com.grupo3.Caso1.Model.GarantiaVehiculo;
import com.grupo3.Caso1.Model.Vehiculo;
import com.grupo3.Caso1.Service.Posgrest.GarantiaVehiculoService;
import com.grupo3.Caso1.Service.Posgrest.VehiculoService;

@RestController
@RequestMapping("/garantia/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class GarantiaVehiculocontroller {
	@Autowired
	private GarantiaVehiculoService vehiculoService;

	@GetMapping(value = "/all")
	public List<GarantiaVehiculo> getAll() {
		return vehiculoService.getAll();
	}

	@GetMapping(value = "/find/{id}")
	public GarantiaVehiculo find(@PathVariable(value = "id") int id) {
		return vehiculoService.get(id);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<GarantiaVehiculo> save(@RequestBody GarantiaVehiculo vehiculo) {
		GarantiaVehiculo obj = vehiculoService.save(vehiculo);
		return new ResponseEntity<GarantiaVehiculo>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<GarantiaVehiculo> delete(@PathVariable(value = "id") int id) {
		GarantiaVehiculo vehiculo = vehiculoService.get(id);
		if (vehiculo != null) {
			vehiculoService.delete(id);
		} else {
			return new ResponseEntity<GarantiaVehiculo>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<GarantiaVehiculo>(vehiculo, HttpStatus.OK);
	}
}
