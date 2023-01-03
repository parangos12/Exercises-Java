package E3;

import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {
		char caracter;
		Scanner entrada=new Scanner(System.in);
		caracter=entrada.next().charAt(0);
		
		if (Character.isUpperCase(caracter)) {
			System.out.println("Es mayuscula");
		} else {
			System.out.println("No es mayuscula");
		}
	}
}
