package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Personas;
import com.example.demo.service.impl.ServiceImplPersonas;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins="*")
public class ControllerPersona {
	@Autowired
	@Qualifier("PersonasServiceImpl")
	private ServiceImplPersonas personasService;
	@GetMapping(path="/list/",produces= {"application/json"})
	public List<Personas> listPersonas(){
		System.out.println(personasService.listAllPersonas());
		return personasService.listAllPersonas();
		
	}
}
