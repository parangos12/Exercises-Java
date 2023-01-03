package E3;

import java.util.Scanner;

public class E13 {
	public static void main(String[] args) {
		double masa;
		
		String unidad,resultado="";
		Scanner entrada=new Scanner(System.in);
		System.out.print("Enter operation u wanna convert to (TON,GR): ");
		unidad=entrada.next();
		System.out.print("Enter the mass in Kg: ");
		masa=entrada.nextDouble();
		
		switch(unidad) {
		case "TON": resultado=String.valueOf(masa/1000);
					break;
		}
		System.out.println("The result is: "+resultado+" Ton ");
	}
}
