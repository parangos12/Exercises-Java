/**
 * 
 */
package com.devpredator.animes.service;

import java.util.List;

import com.devpredator.animes.entity.Anime;

/**
 * @author Pedro
 * @version 1.0  28/12/2022
 * Interface que contiene los metodos de logica de negocio para los animes.
 */
public interface AnimesService {
	/**
	 * Metodo que permite consultar un listado de animes
	 * @return listado de animes.
	 */
	List<Anime> consultarAnimes();
	/**
	 * Metodo que permite guardar un anime
	 * @param anime {@link Anime} objeto anime a guardar
	 * @return anime guardado
	 */
	Anime guardarAnime(Anime anime);
	/**
	 * Metodo que permite actualizar un anime
	 * @param anime {@link Anime} objeto anime a guardar
	 * @return anime actualizado
	 */
	Anime actualizarAnime(Anime anime);
	/**
	 * Metodo que permite eliminar un anime
	 * @param anime {@link Long} objeto anime a eliminar.
	 * @return anime eliminado
	 */
	void eliminarAnime(Long id);
}
