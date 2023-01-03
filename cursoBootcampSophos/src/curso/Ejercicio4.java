package curso;

public class Ejercicio4 {
	
	public static void main(String args[]) 
	{
	Integer suma=0;
	
    for(int i=1; i<=100;i++)
    {
    	suma=suma+i;
    }
	double media=(double)suma/100;
	System.out.println("La suma de los números del 1 al 100 es "+suma+" y su media es "+media);
}
	}
