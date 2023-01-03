package EulerProject;

import java.util.Iterator;
import java.util.Scanner;

public class E1 {
	
	public static void main(String[] args) {
		int sum=0,number;
		Scanner entrada=new Scanner(System.in);
		number=entrada.nextInt();
		
		for (int i = 1; i < number; i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		System.out.println("The total sum is: "+sum);
			
		}
	}
	
}
