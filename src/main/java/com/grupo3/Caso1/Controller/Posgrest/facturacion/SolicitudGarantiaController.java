package com.grupo3.Caso1.Controller.Posgrest.facturacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo3.Caso1.Model.FacturaClient;
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
}
