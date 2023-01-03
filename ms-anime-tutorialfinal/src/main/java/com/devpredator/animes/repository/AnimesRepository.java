/**
 * 
 */
package com.devpredator.animes.repository;

import org.springframework.data.repository.CrudRepository;

import com.devpredator.animes.entity.Anime;

/**
 * @author Pedro
 * @version 1.0  28/12/2022
 * Interface que contiene el CRUD con SPRING JPA para la tabla de anime 
 * */
public interface AnimesRepository extends CrudRepository<Anime, Long> {

}
