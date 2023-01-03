package valentina;

import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class minireto {
	public static void main(String[] args) {
		
		String resultado=cadena("Tipo A");
		System.out.println(resultado);
		
		List<String> miLista = Arrays.asList("a","b","c");

		boolean resultado2=contenido("z",miLista);
		System.out.println(resultado2);
	}
	//2.a
	public static String cadena(String tipo) {
		Random n=new Random();
		String numeros="",numerosf="";
		for (int i = 0; i < 10; i++) {
			numeros+=String.valueOf(n.nextInt(10));
		}
		if (tipo=="Tipo A") {
			numerosf="54"+numeros.substring(2, 10);
		}
		else if (tipo=="Tipo B") {
			numerosf="08"+numeros.substring(2, 10);
		}
		return numerosf;
	}
	//2.b
	public static boolean contenido(String busqueda,List<String> miLista) {
		if (miLista.contains(busqueda)) {
			return false;
		} else {
			return true;
		}
	}
	
}
