package E3;

import java.util.Scanner;

public class E5 {
	public static void main(String[] args) {
		int salario=0,horas;
		final int precio_hora=16,precio_hextra=20;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Enter the amount of hours");
		horas=entrada.nextInt();
		
		if (horas<=40) {
			salario=precio_hora*horas;
		}
		else if (horas>40) {
			salario=precio_hora*40+precio_hextra*(horas-40);
		}
		System.out.println("The weekly salary is: "+salario);
	}
}
