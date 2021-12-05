package com.grupo3.Caso1.Controller.Posgrest.facturacion;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
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

import com.grupo3.Caso1.Model.FacturaClient;
import com.grupo3.Caso1.Service.Posgrest.FacturaCliService;

@RestController
@RequestMapping("/factura/api/v1")
@CrossOrigin("*")
public class FacturaCliController {

	@Autowired
	private FacturaCliService facturaCliService;
	
	
	@GetMapping
	private ResponseEntity<List<FacturaClient>> getAllFacturas(){
		return ResponseEntity.ok(facturaCliService.getAll());
	}
	
	@GetMapping(value="/find/{id}")
	private ResponseEntity<FacturaClient> getFacturaById(@PathVariable long id) {
		return ResponseEntity.ok(facturaCliService.get(id));
	}
	
	@PostMapping
	private ResponseEntity<FacturaClient> saveFactura(@RequestBody FacturaClient factura){
 		try {
 			FacturaClient facturaClient = facturaCliService.save(factura);
 			return ResponseEntity.created(new URI("/factura/api/v1"+facturaClient.getId_factura())).body(facturaClient);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
