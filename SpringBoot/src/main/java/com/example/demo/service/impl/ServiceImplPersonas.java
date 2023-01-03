package com.example.demo.service.impl;
//clase en el q implemenatare mis metodos de la interfez SERVICE PERSONAS

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Personas;
import com.example.demo.repository.RepositoryPersonas;
import com.example.demo.service.ServicePersonas;

@Service("PersonasServiceImpl")
@Transactional
public class ServiceImplPersonas implements ServicePersonas{

	@Autowired
	@Qualifier("personasRepository")
	private RepositoryPersonas repositoryPersonas;
	
	@Override
	public List<Personas> listAllPersonas() {
		return (List<Personas>) repositoryPersonas.findAll();
	}

}
