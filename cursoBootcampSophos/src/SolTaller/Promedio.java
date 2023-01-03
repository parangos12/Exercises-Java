package SolTaller;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Scanner;

public class Promedio {

	public int[] numeros() {
		int [] nums=new int[5];
		for (int i = 0; i < 5; i++) {
			Scanner entrada=new Scanner(System.in);
			System.out.println("Enter a grade pliz (5 total) : ");
			nums[i]=entrada.nextInt();
		}
		return nums;}

	
	private void getPromedio() {
		Promedio lista=new Promedio();
		int[] listan=lista.numeros();
		class promedio{//Esta sería la clase interna local ya que esta dentro de un bloque-metodo.
			private int suma=0;
			private double contadores=listan.length;
			
				int suma() {
				for (int i = 0; i < listan.length; i++) {
					suma+=listan[i];
				}
				return suma;
			}
				double prom() {
					return (double)suma/contadores;
				}
		}
		promedio prome=new promedio();
		System.out.println("The average is: "+prome.suma());
		System.out.println("The average is: "+prome.prom());
	}
	
	public static void main(String[] args) {
		Promedio calculoprom=new Promedio();
		calculoprom.getPromedio();
		System.out.println(Arrays.toString(calculoprom.numeros()));
	}
}
