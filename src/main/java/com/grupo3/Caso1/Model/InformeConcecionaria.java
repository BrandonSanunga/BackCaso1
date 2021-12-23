package com.grupo3.Caso1.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.grupo3.Caso1.Model.ordenReparacion.DetalleRepuestos;

@Entity
public class InformeConcecionaria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idConcesionaria;
	private String descricion;
	private int porcentaje;
	@Column(name = "estado", columnDefinition = "boolean DEFAULT 'true'")
	private boolean estado;
	@OneToOne 
	@JoinColumn(name = "idDetalleRepuesto")
	private DetalleRepuestos detalle;
	private double total;

	public InformeConcecionaria(Long idConcesionaria, String descricion, int porcentaje,  double total,
			boolean estado, DetalleRepuestos detalle) {
		this.idConcesionaria = idConcesionaria;
		this.descricion = descricion;
		this.porcentaje = porcentaje;
		
		this.total =total;
	    this.estado = estado;
		this.detalle = detalle;
	}


	public InformeConcecionaria() {
		// TODO Auto-generated constructor stub
	}


	public Long getIdConcesionaria() {
		return idConcesionaria;
	}


	public void setIdConcesionaria(Long idConcesionaria) {
		this.idConcesionaria = idConcesionaria;
	}


	public String getDescricion() {
		return descricion;
	}


	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}


	public int getPorcentaje() {
		return porcentaje;
	}


	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}


	public double getTotal() {
		return  total;
	}


	public void setTotal(double total) {
		this.total=total;
		
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public DetalleRepuestos getDetalle() {
		return detalle;
	}


	public void setDetalle(DetalleRepuestos detalle) {
		this.detalle = detalle;
	}
	

	
}
