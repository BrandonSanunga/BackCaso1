package com.grupo3.Caso1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class InformeConcecionaria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idConcesionaria;
	private String descricion;
	private double costo;
	private int porcentaje;
	private boolean estado;
	
	public InformeConcecionaria() {
		// TODO Auto-generated constructor stub
	}

	public InformeConcecionaria(Long idConcesionaria, String descricion, double costo, int porcentaje, boolean estado) {
		
		this.idConcesionaria = idConcesionaria;
		this.descricion = descricion;
		this.costo = (costo*porcentaje)/100;
		this.porcentaje = porcentaje;
		this.estado = estado;
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

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	

}
