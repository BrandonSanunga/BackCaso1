package com.grupo3.Caso1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Vehiculo {

    @Id
    private String chasis;
    private String color;
    private String ramv;
    private boolean estado;
    private Double precio;
    @OneToOne
    private Pais pais;
    @ManyToOne
    private GarantiaVehiculo garantia;
    @ManyToOne
    private vehiculo_catalogo vehiculoCatalogo;
<<<<<<< HEAD
  
=======
    private Double precio_venta;
>>>>>>> 4b32ad7da49df23077ed0711f44cdee67a7bd300

    public Vehiculo() {
 
    }

<<<<<<< HEAD
=======
    public Vehiculo(String chasis_vehiculo, String color, String ramv, boolean estado, Pais id_pais, GarantiaVehiculo id_garantia, vehiculo_catalogo vehiculoCatalogo,Double precio_venta) {
        this.chasis_vehiculo = chasis_vehiculo;
        this.color = color;
        this.ramv = ramv;
        this.estado = estado;
        this.id_pais = id_pais;
        this.id_garantia = id_garantia;
        this.vehiculoCatalogo = vehiculoCatalogo;
        this.precio_venta = precio_venta;
    }
>>>>>>> 4b32ad7da49df23077ed0711f44cdee67a7bd300

	public Vehiculo(String chasis, String color, String ramv, boolean estado, Double precio, Pais pais,
			GarantiaVehiculo garantia, vehiculo_catalogo vehiculoCatalogo) {
		this.chasis = chasis;
		this.color = color;
		this.ramv = ramv;
		this.estado = estado;
		this.precio = precio;
		this.pais = pais;
		this.garantia = garantia;
		this.vehiculoCatalogo = vehiculoCatalogo;
	}


	public String getChasis() {
		return chasis;
	}


	public void setChasis(String chasis) {
		this.chasis = chasis;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getRamv() {
		return ramv;
	}


	public void setRamv(String ramv) {
		this.ramv = ramv;
	}


<<<<<<< HEAD
	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Pais getPais() {
		return pais;
	}


	public void setPais(Pais pais) {
		this.pais = pais;
	}


	public GarantiaVehiculo getGarantia() {
		return garantia;
	}


	public void setGarantia(GarantiaVehiculo garantia) {
		this.garantia = garantia;
	}


	public vehiculo_catalogo getVehiculoCatalogo() {
		return vehiculoCatalogo;
	}


	public void setVehiculoCatalogo(vehiculo_catalogo vehiculoCatalogo) {
		this.vehiculoCatalogo = vehiculoCatalogo;
	}
    

=======
    public Double getPrecio_venta() {
        return precio_venta;
    }
>>>>>>> 4b32ad7da49df23077ed0711f44cdee67a7bd300

}
    
