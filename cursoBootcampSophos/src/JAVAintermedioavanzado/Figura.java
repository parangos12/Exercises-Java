package JAVAintermedioavanzado;

public abstract class Figura {
	private String color;
	
	public Figura(String color) {
		this.color=color;
	}
	
	abstract double area(); //Metodo abstracto
	abstract double perimetro(); //Metodo  abstracto
	
	public String getColor() {//Metodo no abstracto
		return color;
	}
	
}
