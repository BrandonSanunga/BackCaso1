package com.grupo3.Caso1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class vehiculo_catalogo {
	
	@Id
	private String id_vehiculo_catalogo;	
	
	@ManyToOne
	@JoinColumn(name="id_diseno")
	private Disenovehiculo diseno;
	
	private int year_vehiculo;
	
	@ManyToOne
	@JoinColumn(name="id_caracteristica")
	private CaracteristicaVehiculo caracteristica;
	
	private String links_imagen;
	
	
	public vehiculo_catalogo(String id_vehiculo_catalogo, Disenovehiculo diseno, int year_vehiculo,
			CaracteristicaVehiculo caracteristica, String links_imagen) {
		super();
		this.id_vehiculo_catalogo = id_vehiculo_catalogo;
		this.diseno = diseno;
		this.year_vehiculo = year_vehiculo;
		this.caracteristica = caracteristica;
		this.links_imagen = links_imagen;
	}

	public vehiculo_catalogo() {
	}

	public String getId_vehiculo_catalogo() {
		return id_vehiculo_catalogo;
	}

	public void setId_vehiculo_catalogo(String id_vehiculo_catalogo) {
		this.id_vehiculo_catalogo = id_vehiculo_catalogo;
	}

	public int getYear_vehiculo() {
		return year_vehiculo;
	}

	public void setYear_vehiculo(int year_vehiculo) {
		this.year_vehiculo = year_vehiculo;
	}

	public String getLinks_imagen() {
		return links_imagen;
	}

	public void setLinks_imagen(String links_imagen) {
		this.links_imagen = links_imagen;
	}

	public Disenovehiculo getDiseno() {
		return diseno;
	}

	public void setDiseno(Disenovehiculo diseno) {
		this.diseno = diseno;
	}

	public CaracteristicaVehiculo getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(CaracteristicaVehiculo caracteristica) {
		this.caracteristica = caracteristica;
	}

	
	
}
