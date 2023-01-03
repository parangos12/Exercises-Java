package bucles;

import java.util.Scanner;

public class E7 {
	public static void main(String[] args) {
		
		int numero,suma=0,contador=0;
		Scanner entrada=new Scanner(System.in);
		System.out.print("Enter a number to guess: ");
		numero=entrada.nextInt();
		
		while (numero>=0) {
			suma+=numero;
			contador++;
			System.out.print("Enter a number again: ");
			numero=entrada.nextInt();
		}
		System.out.println("The average of the entered numbers is: "+(float)suma/contador);
	}
}
