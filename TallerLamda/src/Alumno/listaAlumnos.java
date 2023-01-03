package Alumno;

import java.util.Arrays;
import java.util.List;

public class listaAlumnos{

	public static void main(String[] args) {
		Alumno a1=new Alumno(01,  "1192793107",  "Arango Sanchez",  "POO",  5,  22);
		Alumno a2=new Alumno(02,  "1192793107",  "Sanchez",  "POO",  4,  25);
		Alumno a3=new Alumno(03,  "1192793107",  "Perez",  "POO",  3,  63);
		Alumno a4=new Alumno(04,  "1192793107",  "Agudelo",  "POO",  2,  64);
		Alumno a5=new Alumno(05,  "1192793107",  "Castañeda",  "POO",  1,  17);
		Alumno a6=new Alumno(06,  "11111111",  "Juanes",  "POO",  7,  33);

		
		List<Alumno> listaAlumnos=Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		System.out.println("Obtener todos los alumnos de la lista.");
		listaAlumnos.stream().forEach(System.out::println);
		
		System.out.println("Obtener los alumnos cuya longitud de nombres sea mayor a 10.");
		listaAlumnos.stream().filter(alumno->alumno.getApellidos().length()>10)
		.map(alumno->alumno.getApellidos())
		.forEach(System.out::println);

		System.out.println("Obtener el alumno que tiene la menor edad");
		System.out.println("El alumno más joven es de apellido "+listaAlumnos.stream().min((a,b)->a.getEdad()-b.getEdad()).get().getApellidos());
		
		System.out.println("devolvemos la longitud de la lista");
		System.out.println(listaAlumnos.stream().count());


		System.out.println("Obtenga 5 alumnos con mayor nota.");
		listaAlumnos.sort((Alumno a11,Alumno a22)->(int)a22.getNota()-(int)a11.getNota());
		listaAlumnos.stream().limit(5).forEach(System.out::println);

	}
	
}
