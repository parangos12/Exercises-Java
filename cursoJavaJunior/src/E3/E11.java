package E3;

import java.util.Scanner;

public class E11 {
	public static void main(String[] args) {
		String operacion;
		Scanner entrada=new Scanner(System.in);
		System.out.print("Enter operation u wanna do: ");
		operacion=entrada.next();
		/*double n1,n2,resultado=0;
		

		System.out.println("Enter N1 ");
		n1=entrada.nextInt();
		System.out.println("Enter N2: ");
		n2=entrada.nextInt();

		if(operacion=="SISAS") {
			resultado=n1+n2;
		}
		else if(operacion=="R") {
			resultado=n1-n2;
		}
		else if(operacion=="D") {
			resultado=(double)n1/n2;
		}
		else if(operacion=="M") {
			resultado=n1*n2;
		}	
		else {
			System.out.println("There isnt a opereation with : "+operacion);
		}*/
		System.out.println(operacion=="SISAS");
	}
}
