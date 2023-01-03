/**
 * 
 */
package com.devpredator.animes.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author Pedro
 * @version 1.0  28/12/2022
 * Clase que representa entidades de animes
 */
@Data
@Entity
@Table(name="anime")
public class Anime {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="anio")
	private int anio;
	
	@Column(name="fecha_creacion")
	private LocalDateTime fechaCreacion;

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

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Anime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Anime(Long id, String nombre, int anio, LocalDateTime fechaCreacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.anio = anio;
		this.fechaCreacion = fechaCreacion;
	}
	
	
	
	
}
