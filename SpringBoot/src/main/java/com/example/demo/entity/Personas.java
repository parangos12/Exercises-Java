package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personas")
public class Personas {
	@Id
	private String 	idpersona; 
	private String nombre;
	private String apellido;
	
	public String getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
	
	
}
