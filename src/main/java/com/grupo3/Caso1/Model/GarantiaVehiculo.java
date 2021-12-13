package com.grupo3.Caso1.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class GarantiaVehiculo {
	@Id
	private Integer id_garantia;
	private String descripcion;
	@OneToMany(cascade = CascadeType.ALL)
	private  List<DetalleGarantia> detallegarantia;
	

	public GarantiaVehiculo() {
		// TODO Auto-generated constructor stub
	}
	public GarantiaVehiculo(Integer id_garantia, String descripcion, List<DetalleGarantia> detallegarantia) {
		this.id_garantia = id_garantia;
		this.descripcion = descripcion;
		this.detallegarantia = detallegarantia;
	}
	public Integer getId_garantia() {
		return id_garantia;
	}
	public void setId_garantia(Integer id_garantia) {
		this.id_garantia = id_garantia;
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
