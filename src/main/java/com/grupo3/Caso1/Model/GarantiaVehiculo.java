package com.grupo3.Caso1.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class GarantiaVehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idGarantia;
	private String descripcion;
	@OneToMany(cascade = CascadeType.ALL)
	private  List<DetalleGarantia> detallegarantia;
	

	public GarantiaVehiculo() {
		// TODO Auto-generated constructor stub
	}


	public GarantiaVehiculo(Long idGarantia, String descripcion, List<DetalleGarantia> detallegarantia) {
		this.idGarantia = idGarantia;
		this.descripcion = descripcion;
		this.detallegarantia = detallegarantia;
	}


	public Long getIdGarantia() {
		return idGarantia;
	}


	public void setIdGarantia(Long idGarantia) {
		this.idGarantia = idGarantia;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public List<DetalleGarantia> getDetallegarantia() {
		return detallegarantia;
	}


	public void setDetallegarantia(List<DetalleGarantia> detallegarantia) {
		this.detallegarantia = detallegarantia;
	}
	
	
	}
