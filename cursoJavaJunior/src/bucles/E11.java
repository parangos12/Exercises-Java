package bucles;

public class E11 {
	public static void main(String[] args) {
		
		long contador=0,producto=1,numero=1;
		
		while (contador<9) {
			contador++;
			numero+=2;
			producto*=numero;
		}
		System.out.println(producto);
	}
}
