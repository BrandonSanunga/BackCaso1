package com.grupo3.Caso1.Model;

public class ConcecionariaInforme {
	private double precio;
	private double mano_obra;
	public ConcecionariaInforme(double precio, double mano_obra) {
		this.precio = precio;
		this.mano_obra = mano_obra;
	}
	public ConcecionariaInforme() {
		// TODO Auto-generated constructor stub
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getMano_obra() {
		return mano_obra;
	}
	public void setMano_obra(double mano_obra) {
		this.mano_obra = mano_obra;
	}

	
}
