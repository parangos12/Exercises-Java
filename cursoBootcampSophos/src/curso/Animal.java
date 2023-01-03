package curso;

public class Animal implements Acciones{
	
	private String nombre;
	
    String raza;
	
	private String altura;
	
	protected String color;
	
	
	public String GetNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}	
	
	public void SetNombre(String nomb) {
		nombre=nomb;
	}		
	
	public String GetRaza() {
		// TODO Auto-generated method stub
		return raza;
	}	
	
	public void SetRaza(String raz) {
		raza=raz;
	}			
	
	public String GetAltura() {
		// TODO Auto-generated method stub
		return altura;
	}	
	
	public void SetAltura(String altur) {
		altura=altur;
	}			
	
	public String GetColor() {
		// TODO Auto-generated method stub
		return color;
	}	
	
	public void SetColor(String col) {
		color=col;
	}		
	
	
	public String Correr() {
		// TODO Auto-generated method stub
		return null;
	}

	public String Nadar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String dormir()
	{
		return "";
	}

	
	public String despierta()
	{
		return "";
	}
	
	public String HacerRuido()
	{
		return null;
	}
}
