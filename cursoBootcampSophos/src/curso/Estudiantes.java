package curso;

public class Estudiantes {
	
    public static void main(String[] args) 
    {
    	//Lista ordenada en filas niveles del idioma y columnas el idioma
    	int [][] alumnos= {{1,23,49},{45,78,51},{21,45,47},{5,6,2}};
    	
    	//Para recorrer la matriz se utiliza el siguiente codigo
		for(int x=0;x<alumnos.length;x++)
		{
			for(int y=0;y<alumnos[x].length;y++)
			{
				System.out.println(alumnos[x][y]);
			}
		}
    }
}
