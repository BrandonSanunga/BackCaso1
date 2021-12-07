package com.grupo3.Caso1.Controller.Posgrest.facturacion;

import java.net.URI;
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

import com.grupo3.Caso1.Model.DetalleFacturaClient;
import com.grupo3.Caso1.Service.Posgrest.DetalleCliService;
import com.grupo3.Caso1.Service.Posgrest.ServiceImp.facturacion.DetalleCliServiceImp;

@RestController
@RequestMapping("/factura/detalle/api/v1")
@CrossOrigin("*")
public class DetalleCliController {

	@Autowired
	private DetalleCliService detalleCliService;
	@Autowired 
	private DetalleCliServiceImp detalleSI;
	
	@GetMapping("{id}")
	private ResponseEntity<List<DetalleFacturaClient>> getAllDetalleByFactura(@PathVariable("id") Long id_factura){
		return ResponseEntity.ok(detalleSI.findAllByFatura(id_factura));
	}
	@GetMapping
	private ResponseEntity<List<DetalleFacturaClient>> getAllDetalles(){
		return ResponseEntity.ok(detalleCliService.getAll());
	}
	
	@PostMapping
	private ResponseEntity<DetalleFacturaClient> saveFactura(@RequestBody DetalleFacturaClient factura){
 		try {
 			DetalleFacturaClient detallleFact = detalleCliService.save(factura);
 			return ResponseEntity.created(new URI("/factura/detalle/api/v1"+detallleFact.getId_detalle())).body(detallleFact);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
