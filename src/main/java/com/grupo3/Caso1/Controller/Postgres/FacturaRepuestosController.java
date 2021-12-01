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

import com.grupo3.Caso1.Model.FacturaRepuestos;
import com.grupo3.Caso1.Service.Postgres.FacturaRepuestoService;

@RestController
@RequestMapping("/facturaRep/api/v1")
@CrossOrigin("*")
public class FacturaRepuestosController {

	@Autowired
	private FacturaRepuestoService facturaService;
	
	@GetMapping(value="/all")
	public List<FacturaRepuestos> getAll(){
		return facturaService.getAll();
	}

	@GetMapping(value="/find/{id_factura_repuesto}")
	public FacturaRepuestos find(@PathVariable String id_factura_repuesto) {
		return facturaService.get(id_factura_repuesto);
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<FacturaRepuestos> save(@RequestBody FacturaRepuestos factura){
		FacturaRepuestos obj= facturaService.save(factura);
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}
	
	@GetMapping(value="/delete/{id_factura_repuesto}")
	public ResponseEntity<FacturaRepuestos> delete(@PathVariable String id_factura_repuesto){
		FacturaRepuestos factura= facturaService.get(id_factura_repuesto);
		if(factura != null) {
			facturaService.delete(id_factura_repuesto);
		}else {
			return new ResponseEntity<FacturaRepuestos>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<FacturaRepuestos>(factura, HttpStatus.OK);
	}

}
