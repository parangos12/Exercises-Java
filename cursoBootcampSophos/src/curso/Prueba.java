package curso;

import java.util.Scanner;

public class Prueba {
	
    public static void main(String[] args) 
    {
    	System.out.println(verifyPrime(0));
    };
	public static String verifyPrime(int n) {
		for(int i=2; i<n/2;i++)
		{
			if(n%i==0)
			{
				return "El numero " +n +" no es primo";
			}
		}
		return "El numero "+n+" es primo";
	}

}
