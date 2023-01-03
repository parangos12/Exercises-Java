package curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String args[]) 
	{
	ArrayList<Integer> myListPositive=new ArrayList<Integer>();
	ArrayList<Integer> myListNegative=new ArrayList<Integer>();
	Integer sumaPositivos=0;
	Integer sumaNegativos=0;
	
	System.out.println(prueba(3));

	Integer counter=0;
	
	//Esto pide las 10 números al usuario y va sumando los positivos y negativos.
	while(counter<10)
	{
		Scanner n=new Scanner(System.in);
		System.out.println("Enter a number: ");
		Integer numberx=n.nextInt();
		counter++;
		if(numberx>=0)
		{
			myListPositive.add(numberx);
			sumaPositivos=sumaPositivos+numberx;
		}
		else
		{
			myListNegative.add(numberx);
			sumaNegativos=sumaNegativos+numberx;
		}
		
	};
	
	//Esto saca la cantidad de positivos, negativos y sus promedios respectivamente. 
	Integer cantPositivos=myListPositive.size();
	Integer cantNegativos=myListNegative.size();

	double promPositivos=(double)sumaPositivos/cantPositivos;
	double promNegativos=(double)sumaNegativos/cantNegativos;
	System.out.println("The average of positive numbers is "+promPositivos);
	System.out.println("The average of negative numbers is "+promNegativos);

	}
	
	public static Integer prueba(Integer a) {
		return 2;
	}
	public static Integer prueba1(Integer a) {
		return 2;
	}
	
}
