package bucles;

import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {
		int numero;
		Scanner entrada=new Scanner(System.in);
		System.out.print("Enter a number to determinate odd or even : ");
		numero=entrada.nextInt();
		
		while (numero!=0) {
			if (numero%2==0) {
				System.out.println("The number entered is odd");
				
			} else {
				System.out.println("The number enteres is even");
			}
			System.out.print("Enter a number to determinate odd or even : ");
			numero=entrada.nextInt();
		}
		System.out.println("You have entered a 0, so program finished!");
	}
}
