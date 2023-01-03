package curso;

import java.util.Scanner;

public class Primo1 {

    public static void main(String[] args) 
    {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter a number: ");
		Integer numberx=n.nextInt();
    	System.out.println(primo(numberx));
    };
    private static String primo(Integer a)
      {
          Integer contador=0;
          String resultado="";
          for(int i=2; i<a;i++){
              if(a%i!=0){
                  contador=contador+1;}}
          if(contador==(a-2) || a==1){
              resultado="El numero "+a+" es primo";}
          else {
              resultado="El numero "+a+" no es primo";}
          
      return resultado;    
      }
}
