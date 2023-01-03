package curso;

import java.util.Scanner;

public class ciudades {
	public static void main(String[] args) 
    {		
		String [] paises=new  String[4];
		String [][] ciudades=new  String[4][3];
		
		for(int i=0;i<paises.length;i++)
		{
			Scanner c=new Scanner(System.in);
			System.out.println("Enter a country: ");
			String country=c.next();
			paises[i]=country;
			for(int j=0;j<ciudades[i].length;j++)
				{
					Scanner ci=new Scanner(System.in);
					System.out.println("Enter a city for the country : "+country);
					String city=ci.next();
					ciudades[i][j]=city;}
		}
    }
}
