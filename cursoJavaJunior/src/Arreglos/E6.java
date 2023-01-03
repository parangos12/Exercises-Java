package Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class E6 {
	public static void main(String[] args) {
		float[] list1=new float[12];
		float[] list2=new float[12];
		float[] listc=new float[24];
		int cont=0,cont2=0,contlista1=0,contlista2=0;
		Scanner entrada=new Scanner(System.in);


		for (int i = 0; i < 12; i++) {
			System.out.println("Enter number: "+(i+1)+" of the list1: ");
			list1[i]=entrada.nextFloat();
			System.out.println("Enter number: "+(i+1)+" of the list2: ");
			list2[i]=entrada.nextFloat();
		}
		//recorrer tabla A de 3 en 3
		for (int i = 0; i < list1.length+1; i+=4) {
			listc[i+cont]=list1[i+contlista1];
			listc[i+1+cont]=list1[i+1+contlista1];
			listc[i+2+cont]=list1[i+2+contlista1]; 
			cont+=2;
			contlista1-=1;
		}
		for (int i = 0; i < list1.length+1; i+=4) {
			listc[i+cont2+3]=list2[i+contlista2];
			listc[i+1+cont2+3]=list2[i+1+contlista2];
			listc[i+2+cont2+3]=list2[i+2+contlista2]; 
			cont2+=2;
			contlista2-=1;
		}
		System.out.println(Arrays.toString(listc));
	}
}
