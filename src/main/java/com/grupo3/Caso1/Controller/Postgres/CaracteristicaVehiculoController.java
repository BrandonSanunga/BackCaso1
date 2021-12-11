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

import com.grupo3.Caso1.Model.CaracteristicaVehiculo;
import com.grupo3.Caso1.Service.Postgres.caracteristicas_vehiculoService;


@RestController
@RequestMapping("/caracteristicas/api/v1")
@CrossOrigin("*")
public class CaracteristicaVehiculoController {
	
	@Autowired
	private caracteristicas_vehiculoService caracteristicaservice;
	
	@GetMapping(value="/all")
	public List<CaracteristicaVehiculo> getAll(){
		return caracteristicaservice.getAll();
	}

	@GetMapping(value="/find/{id_caracteristica}")
	public CaracteristicaVehiculo find(@PathVariable Long id_caracteristica) {
		return caracteristicaservice.get(id_caracteristica);
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<CaracteristicaVehiculo> save(@RequestBody CaracteristicaVehiculo caracteristica){
		CaracteristicaVehiculo obj= caracteristicaservice.save(caracteristica);
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}
	
	@GetMapping(value="/delete/{id_caracteristica}")
	public ResponseEntity<CaracteristicaVehiculo> delete(@PathVariable (value="id_caracteristica")Long id_caracteristica){
		CaracteristicaVehiculo caracteristica= caracteristicaservice.get(id_caracteristica);
		if(caracteristica != null) {
			caracteristicaservice.delete(id_caracteristica);
		}else {
			return new ResponseEntity<CaracteristicaVehiculo>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<CaracteristicaVehiculo>(caracteristica, HttpStatus.OK);
	}


}
