package curso;

import java.util.Scanner;

public class Ejercicio3_1 {
	
	public static void main(String args[]) 
	{
		
	//CONTROL USANDO FOR.
	Integer suma=0;
	Scanner n=new Scanner(System.in);
	System.out.println("Enter the limit of number you want to sum : ");
	Integer numberx=n.nextInt();
	
    for(int i=1; i<=numberx;i++)
    {
    	suma=suma+i;
    }
	System.out.println("La suma de los números del 1 al "+numberx+" es: "+suma);
	
	//CONTROL USANDO WHILE
	Integer suma1=0;
	Integer counter=0;
	Scanner n1=new Scanner(System.in);
	System.out.println("Enter the limit of number you want to sum : ");
	Integer numberx1=n1.nextInt();
	
	while(counter<=numberx1)
	{
		counter++;
		suma1=suma1+counter;

	}
	System.out.println("La suma de los números del 1 al "+numberx+" es: "+suma);

	//CONTROL USANDO DO WHILE
	
	Scanner n2=new Scanner(System.in);
	System.out.println("Enter the limit of number you want to sum : ");
	Integer numberx2=n2.nextInt();
	
	Integer suma2=0;
	Integer counter1=0;
	
	do
	{
		counter1++;
		suma2=suma2+counter1;
	} 
	while (counter1<numberx2);
	System.out.println("La suma de los números del 1 al "+numberx2+" es: "+suma2);
} }

