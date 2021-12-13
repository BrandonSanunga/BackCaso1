package com.grupo3.Caso1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class DetalleGarantia {
@Id
private int id_detallegarantia;
private String cobertura;
private String perido;



public DetalleGarantia() {

	// TODO Auto-generated constructor stub
}
public DetalleGarantia(int id_detallegarantia, String cobertura, String perido) {
	this.id_detallegarantia = id_detallegarantia;
	this.cobertura = cobertura;
	this.perido = perido;

}
public int getId_detallegarantia() {
	return id_detallegarantia;
}
public void setId_detallegarantia(int id_detallegarantia) {
	this.id_detallegarantia = id_detallegarantia;
}

public String getCobertura() {
	return cobertura;
}
public void setCobertura(String cobertura) {
	this.cobertura = cobertura;
}
public String getPerido() {
	return perido;
}
public void setPerido(String perido) {
	this.perido = perido;
}





}
