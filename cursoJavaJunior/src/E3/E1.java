package E3;

import java.util.Scanner;

public class E1 {
	
	public static void main(String[] args) {
		int numero=0;
		Scanner entrada=new Scanner(System.in);

		while (numero>=0) {
			System.out.print("Enter a number to calculate the square: ");
			numero=entrada.nextInt();
			if(numero<0) {break;}
			double resultado=Math.pow(numero, 2);
			System.out.println("The square of the number is: "+resultado);
		}
		System.out.println("You have entered a negative number");
	}
}
