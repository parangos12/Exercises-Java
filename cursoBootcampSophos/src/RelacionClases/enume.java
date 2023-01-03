package RelacionClases;

import java.util.Scanner;

public class enume {
	
	//FORMA 1 DE USO DE ENUM:
	//enum Talla{MINI,MEDIANO,GRANDE,MUY_GRANDE};
	
	//FORMA2 DE USO DE ENUM:
	enum Talla{
		
		MINI("S"),MEDIANO("M"),GRANDE("L");  //Hace las veces de setters.
		//constructor de un constructor.
		private Talla(String abreviatura) {
			this.abreviatura=abreviatura;
		}
		
		public String dameAbreviatura() {
			return abreviatura;
		}
		
		
		private String abreviatura;
		
	}
	
	public static void main(String[] args) {
		//System.out.println(Talla.GRANDE);
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE,MUY_GRANDE");
		String entrada_datos=entrada.next().toUpperCase();
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos); //Devuelve el nombre de la constante enumerado a la que pertenece el texto introducido.
		System.out.println("La talla="+la_talla);
		System.out.println("Abreviatura="+la_talla.dameAbreviatura());
		
		
		
		
		
		
	}
	
}
