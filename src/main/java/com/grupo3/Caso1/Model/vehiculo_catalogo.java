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
	private Disenovehiculo id_diseno;
	
	private int year_vehiculo;
	
	@ManyToOne
	@JoinColumn(name="id_caracteristica")	
	private Disenovehiculo id_caracteristica;
	
	private String links_imagen;
	
	public vehiculo_catalogo(String id_vehiculo_catalogo, int year_vehiculo, String links_imagen) {
		this.id_vehiculo_catalogo = id_vehiculo_catalogo;
		this.year_vehiculo = year_vehiculo;
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
}
