package com.elizabeth.demo.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NonNull
	private String nombre;
	@NonNull
	private String referencia;
	@NonNull
	private float precio;
	@NonNull
	private float peso;
	@NonNull
	private String categoria;
	@NonNull
	private int stock;
	@NonNull
	private Date fecha;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(int id, String nombre, String referencia, float precio, float peso, String categoria, int stock,
			Date fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.referencia = referencia;
		this.precio = precio;
		this.peso = peso;
		this.categoria = categoria;
		this.stock = stock;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
