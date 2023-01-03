package prueba;

import java.sql.SQLException;

public class main {
	
	static ConexionOracle objConex;
	
	public static void main(String[] args) throws SQLException {

		objConex=new ConexionOracle();
		objConex.conectar();
		
		//objConex.crearTabla();
		//String resultado=objConex.leerDatosBD();
		//System.out.println(resultado);
		//objConex.ingresarDatosBD("10", "PEDRITO ALIMAÑA", 22);
		//String resultado1=objConex.buscarDatosBD("1");
		//System.out.println(resultado1);
		//objConex.eliminarDatos("2");
		//objConex.eliminarTabla();

	}

}
