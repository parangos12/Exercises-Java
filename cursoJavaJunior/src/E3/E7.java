package E3;

import java.util.Scanner;

public class E7 {
	public static void main(String[] args) {
		int numero;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Enter t");
		numero=entrada.nextInt();
		
		System.out.println((numero%2==0)?"Es par":"No es par");
	}
}
