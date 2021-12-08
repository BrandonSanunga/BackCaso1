package com.grupo3.Caso1.Controller.Posgrest.facturacion;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo3.Caso1.Model.SolicitudGarantia;
import com.grupo3.Caso1.Service.Posgrest.SolicitudGarantiaService;

@RestController
@RequestMapping("/solicitud/garantia/api/v1")
@CrossOrigin("*")
public class SolicitudGarantiaController {

	@Autowired
	private SolicitudGarantiaService garantiaService;
	
	@GetMapping
	private ResponseEntity<List<SolicitudGarantia>> getAllSoliGarantia(){
		return ResponseEntity.ok(garantiaService.getAll());
	}
	
	@PostMapping
	private ResponseEntity<SolicitudGarantia> saveSoliGarantia(@RequestBody SolicitudGarantia solicitud){
 		try {
 			SolicitudGarantia solicitudGar = garantiaService.save(solicitud);
 			return ResponseEntity.created(new URI("/solicitud/garantia/api/v1"+solicitudGar.getId_solicitud())).body(solicitudGar);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
