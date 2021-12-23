package com.grupo3.Caso1.Model;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class ImagenCatalogo {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_imagen;

	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private String type;

	@Column(name = "picByte", length = 1000)
	private byte[] picByte;

	public ImagenCatalogo() {
		
	}

	public ImagenCatalogo(Long id_imagen,String name, String type, byte[] picByte) {
		this.id_imagen= id_imagen;
		this.name = name;
		this.type = type;
		this.picByte = picByte;
	}

	 
	public ImagenCatalogo(String name, String type, byte[] picByte) {
		this.name = name;
		this.type = type;
		this.picByte = picByte;
	}

	public Long getId_imagen() {
		return id_imagen;
	}

	public void setId_imagen(Long id_imagen) {
		this.id_imagen = id_imagen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getPicByte() {
		return picByte;
	}

	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}
}