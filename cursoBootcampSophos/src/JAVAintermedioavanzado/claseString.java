package JAVAintermedioavanzado;

import curso.main;

public class claseString {
	public static void main(String[] args) {
		
		String Nombre="Pedro";
		String color=new String(); // Crea un string vacio.
				
		System.out.println(Nombre.length());
		System.out.println(Nombre.indexOf("Pe"));
		System.out.println(Nombre.charAt(3));
		System.out.println(Nombre.substring(2,5));
		System.out.println(Nombre.toUpperCase());

		
		
	}
}
