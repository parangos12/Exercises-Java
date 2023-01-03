package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Personas;

@Repository("personasRepository")
public interface RepositoryPersonas extends CrudRepository<Personas,String>{
	
}
