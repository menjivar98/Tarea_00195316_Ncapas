package com.uca.taras.domain;

public class Product {
	
	Integer id;
	String nombre;
	Integer cantidad;
	
	public Product() {
		super();
	}
	
	public Product(Integer id, String nombre, Integer cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	};
	
	
	
	

}
