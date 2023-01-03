package Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class E4 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int cont=1,a=0,b=1;
		float[] numeros=new float[10];
		float[] numeros_o=new float[10];

		
		for (int i = 0; i<numeros.length; i++) {
			System.out.print("Enter a number plz: ");
			numeros[i]=entrada.nextFloat();
		}
		for (int i = 0; i < numeros.length/2; i++) {
			numeros_o[i+a]=numeros[i];
			numeros_o[i+b]=numeros[numeros.length-i-1];
			a+=1;
			b+=1;
		}
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(numeros_o));
	}
}
