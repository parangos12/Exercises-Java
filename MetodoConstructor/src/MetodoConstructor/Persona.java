package MetodoConstructor;

public class Persona {
	//ATRIBUTOS
	
	String nombre;
	int edad;
	
	//METODOS--->PRIMER METODO Q SE CREA EN UNA CLASE.
	
	//MedodoConstructor
	public Persona(String nom, int ed){
		this.nombre=nom;    //this.---->este nombre y edad son los referencias en los atributos, puesto q
		this.edad=ed;		//y asi no se confunda con los parametros ingresados.
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre es: " +nombre);
		System.out.println("La edad es: "+edad);
	}
	
	
}
