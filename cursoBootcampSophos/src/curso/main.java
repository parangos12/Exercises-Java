package curso;

public class main {
	
	public static void main(String args[]) 
	{
		//SENTENCIA WHILE
		/*
		 	Inicializacón variable de control
		 	while(condicion) {
		 		bloque
		 		actaulizar variable de control}
		 */
		
		int i=20;
		System.out.println("Lista de pares decreciente");
		while(i!=0)
		{
			System.out.println("i= "+i);
			i=i-2;
		}
		
		// SENTENCIA DO WHILE
		
		/*
		 Inicialización de variable de control;
		 do{
		 		bloque
		 		actaulizar variable de control
		 	}
		 	while(condicion)
		 */
		
		int y=1;
		do
		{
			System.out.println("The number y is: "+y);
			y++;
		} 
		while (y<=20);
		
		
		//SENTENCIA FOR
		
		/*for(i=valor_inicial; i<=valor_final, i++)
		{
			sentencia
		}*/
		
		for(int x=0;x<=10;x++)
		{
			System.out.println("5"+"X"+x+"="+(5*x));
		}
		
		//break
		
		for(int x=0;x<=10;x++)
		{
			if(x>5)
			{
				System.out.println("Entro al break");
				break;
			}
			System.out.println("5"+"X"+x+"="+(5*x));
		}
		
		//CONTINUE
		
		for(int x=0;x<=10;x++)
		{
			if(x==5)
			{
				System.out.println("Entro al CONTINUE");
				continue;
			}
			System.out.println("5"+"X"+x+"="+(5*x));
		}
		
		
		Gato g= new Gato();
		g.SetColor("blanco");
		g.SetAltura("10");

		Gato z= new Gato();
		z.SetColor("blanco");
		z.SetAltura("10");

		if(g.color==z.color)
		{
			System.out.println("Los gatos son del mismo color");
		}
		else
		{
			System.out.println("No son del mismo color");
		}
		
		//OPERADORES CONDICIONALES AND, OR,ETC.
		
		
		if(z.GetColor()=="blanco" && Integer.parseInt(z.GetAltura())>=10)
		{
			System.out.println("el gato es blanco y Alto");
		}
		else
		{
			System.out.println("el gato no cumple con los parametros");
		}
		
		// USO DE 'OR'  --> ||
		if(z.GetColor()=="NEGRO" || Integer.parseInt(z.GetAltura())>=10)
		{
			System.out.println("el gato es blanco y Alto");
		}
		else
		{
			System.out.println("el gato no cumple con los parametros");
		}
		
		
	//OPERADOR TERNARIO
		
		int v1=10;
		int v2=5;
		int mayor;
		
		mayor=(v1>v2)?v1:v2;
		System.out.println(mayor);
		
		//Operador INSTANCEOF
		if(g instanceof Animal)
			System.out.println("Es un animal");
		else
			System.out.println("No es un animal");

		
		//System.out.println("Hola mundo");
		
		//Perro P = new Perro();
		//P.nombre="Junior";
		//P.altura="5";
		
		//System.out.println(P.Comer("Fish"));
		
		g.SetNombre("Azul");
		
		
		Dinosaurio d=new Dinosaurio();
		d.SetNombre("Tyrano Rex");	
		
		System.out.println(g.GetNombre());
		System.out.println(d.GetNombre());
		
		Ruido(g);
		Ruido(d);

	}
	
	public static void Ruido(Animal A)
	{
		System.out.println("El animal "+A.GetNombre()+" hace "+A.HacerRuido());

	}	
	
}

