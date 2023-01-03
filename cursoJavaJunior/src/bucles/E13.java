package bucles;

import java.util.Scanner;

public class E13 {
	public static void main(String[] args) {
		
		int sumap=0,suman=0,contador=0,cantz=0,contadorp=0,contadorn=0,numero;
		
		while (contador<9) {
			Scanner entrada=new Scanner(System.in);
			System.out.print("Enter a number please: ");
			numero=entrada.nextInt();
			contador++;
			if (numero>0) {
				sumap+=numero;
				contadorp++;
			} 
			else if(numero<0) {
				suman+=numero;
				contadorn++;
			}
			else {
				cantz++;
			}
		}
		System.out.println("The amount of 0 was: "+cantz+" zeros/n"+"The average of positives n was: "+(float)sumap/contadorp+"/n"+"The average of negative numbers is: "+(float)suman/contadorn);
		
	}
}
