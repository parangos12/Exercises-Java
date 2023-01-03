package Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		float[] numeros=new float[5];
		
		for (int i = 0; i<numeros.length; i++) {
			System.out.print("Enter a number plz: ");
			numeros[numeros.length-i-1]=entrada.nextFloat();
		}
		
		System.out.println(Arrays.toString(numeros));
	}
}
