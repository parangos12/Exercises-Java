package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="CLIENTE")
public class Cliente {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	
	private String Codigo;
	private String Nombre;
	private String Email;

	public Cliente() {
		super();
	}
	

	public Cliente(String codigo, String nombre, String email) {
		super();
		Codigo = codigo;
		Nombre = nombre;
		Email = email;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", Codigo=" + Codigo + ", Nombre=" + Nombre + ", Email=" + Email + "]";
	}
	
}