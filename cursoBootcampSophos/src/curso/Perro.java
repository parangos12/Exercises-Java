package curso;

public class Perro implements Acciones{
	public String nombre;
	public String raza;
	public String altura;
	
	public String Comer(String carne)
	{
		return nombre+" mide " +altura+ " y comera " + carne;
	}
	
	public String dormir()
	{
		return "";
	}
	
	public String ladrar()
	{
		return "";
	}

	@Override
	public String Correr() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Nadar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
