package com.miempresa.primark.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "articulos")
public class Articulo {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	private Long id;
	    private String nombre;
	    private String descripcion;
	    private Departamentos departamento;
	    private int precio;
	    @Column(name = "tiene_prime")
	    private boolean tienePrime;
	    private int stock;
	    private double descuento;
	    @Enumerated(EnumType.STRING)
	    private Valoracion valoracion;


	    public Articulo() {}

	    public Articulo(String nombre, String descripcion, Departamentos departamento, int precio, boolean tienePrime, int stock, double descuento, Valoracion valoracion) {
	        this.nombre = nombre;
	        this.descripcion = descripcion;
	        this.departamento = departamento;
	        this.precio = precio;
	        this.tienePrime = tienePrime;
	        this.stock = stock;
	        this.descuento = descuento;
	        this.valoracion = valoracion;
	    }

	    // Getters y Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    public Departamentos getDepartamento() {
	        return departamento;
	    }

	    public void setDepartamento(Departamentos departamento) {
	        this.departamento = departamento;
	    }

	    public int getPrecio() {
	        return precio;
	    }

	    public void setPrecio(int precio) {
	        this.precio = precio;
	    }

	    public boolean isTienePrime() {
	        return tienePrime;
	    }

	    public void setTienePrime(boolean tienePrime) {
	        this.tienePrime = tienePrime;
	    }

	    public int getStock() {
	        return stock;
	    }

	    public void setStock(int stock) {
	        this.stock = stock;
	    }

	    public double getDescuento() {
	        return descuento;
	    }

	    public void setDescuento(double descuento) {
	        this.descuento = descuento;
	    }

	    public Valoracion getValoracion() {
	        return valoracion;
	    }

	    public void setValoracion(Valoracion valoracion) {
	        this.valoracion = valoracion;
	    }
}
