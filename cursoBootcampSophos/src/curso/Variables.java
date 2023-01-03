package curso;

public class Variables {

	public void ejemplo()
	{
		
		//datos primitivos
		
		boolean verfal=false;
		
		byte by=20;
		
		short sh=1000;
		
		int in=20000;
		
		long lg=250;
		
		double cbl=250000.5;
		
		float fl=500005;
		
		char ch="T";
		
		// datos estructurados
		String Apellido="Arango";
				
		String A[]= {"Pedro","Arango"};
		
		String B[]= new String[9]; //Un array vacio q será llenado
		B[1]="Arango";
		B[2]="Sanchez";
		
		// datos envoltorios
		
		int entero=500;
		Integer Entero=new Integer(entero);
		
		
		int aEntero=Entero.intValue();
		
		
		String str="1000";
		int x= Integer.parseInt(str);
		
		
		
	}
	
}
