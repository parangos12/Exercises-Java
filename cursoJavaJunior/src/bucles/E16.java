package bucles;

import java.util.Scanner;

public class E16 {
	public static void main(String[] args) {
		int numero;
		Scanner entrada=new Scanner(System.in);
		System.out.print("Enter a number beetwen 1 and 10: ");
		numero=entrada.nextInt();
		while (numero<0 || numero>10) {
			System.out.print("Enter a number beetwen 1 and 10: ");
			numero=entrada.nextInt();
		}
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i+" X "+numero+" = "+i*numero);
		}
	}

	
}
