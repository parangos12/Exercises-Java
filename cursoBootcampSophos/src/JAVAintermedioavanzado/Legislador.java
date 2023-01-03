package JAVAintermedioavanzado;

public abstract class Legislador extends Persona{
	
	private String provinciaQueRepresenta;
	
	public String GetprovinciaQueRepresenta() {
		return provinciaQueRepresenta;
	}	
	
	public void SetprovinciaQueRepresenta(String prov) {
		provinciaQueRepresenta=prov;
	}		
	
	abstract String getCamaraEnQueTrabaja();
}
