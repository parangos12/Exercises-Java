package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Cliente;
import com.example.demo.models.ClienteRepositorio;



@SpringBootApplication
public class JpAconSqLsApplication  implements CommandLineRunner{
	
public static void main(String[] args) {
	SpringApplication.run(JpAconSqLsApplication.class, args);
	
}


@Autowired //importante este ANOTACION para la correcta conexion y persistencia de datos
public ClienteRepositorio repositorioCli;   //depende de la interfaz q nosotros creamos!!!!


@Override
public void run(String... args) throws Exception {
	try {
		//Cliente cli1=new Cliente("01","pedro","paramgoseafitd");
		//repositorioCli.save(cli1);		
		List<Cliente> clientes= repositorioCli.findAll();    //Lista del modelo cliente, poner en una variable clientes, q se busque todos los registros.
		clientes.forEach(System.out::println);
		
	} catch (Exception e) {
		System.out.println("El ERrror"+e.getMessage());
	}
}

}