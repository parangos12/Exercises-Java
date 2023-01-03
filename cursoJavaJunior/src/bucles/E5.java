package bucles;

import java.util.Random;
import java.util.Scanner;

public class E5 {
	public static void main(String[] args) {
		
		int numero,numero_random;
		Random random=new Random();
		Scanner entrada=new Scanner(System.in);
		System.out.print("Enter a number to guess: ");
		numero=entrada.nextInt();
		numero_random=random.nextInt(101);
		
		while (numero!=numero_random) {
			if(numero>numero_random) {
				System.out.println("El número ingresado es mayor al numero a adivinar");
			}
			else {
				System.out.println("El número ingresado es menor al numero a adivinar");

			}
			System.out.print("Enter again a number  to guess: ");
			numero=entrada.nextInt();
		}
		System.out.println("ADIVINASTES, EL NUMERO ERA: "+numero_random);
		
		
	}
}
