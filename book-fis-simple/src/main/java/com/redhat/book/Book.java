package com.redhat.book;

import java.io.Serializable;

public class Book implements Serializable{

	private static final long serialVersionUID = -4955103175254241661L;


	private Integer id;
	private String nombre;
	private String autor;
	private String editorial;
	private String anio;
	private String precio;
	private Integer stock;
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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	public Book(Integer id, String nombre, String autor, String editorial, String anio, String precio, Integer stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.anio = anio;
		this.precio = precio;
		this.stock = stock;
	}
	
	public Book() {
		super();
	}
	
	
	
}
