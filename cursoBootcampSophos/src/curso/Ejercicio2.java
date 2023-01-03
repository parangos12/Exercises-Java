package curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String args[]) 
	{
	ArrayList<Integer> myList=new ArrayList<Integer>();
	//System.out.println(myList);
	Integer counter=0;
	
	//Esto pide las 6 notas del alumno.
	while(counter<6)
	{
		Scanner n=new Scanner(System.in);
		System.out.println("Enter a number: ");
		Integer numberx=n.nextInt();
		counter++;
		myList.add(numberx);
	};
	
	//Esto ordena de mayor a menor la lista
	Comparator<Object> c = Collections.reverseOrder();
	Collections.sort(myList, c);
	System.out.println(myList);
	
	//Esto saca el promedio
	Integer suma=0;
	
	for(int i=0;i<counter;i++)
	{
		suma=suma+myList.get(i);
	};
	double promedio=(double)suma/counter;
	System.out.println("The average of grades is "+promedio);
	System.out.println(suma/counter);	
	}
}
