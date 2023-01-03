package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexionOracle {

	String user;
	String pass;
	String url;
	Connection conex;
	Statement stm;
	
	public ConexionOracle() {
		user="SYSTEM";
		pass="giqXPD78";
		url="jdbc:oracle:thin:@localhost:1522:xe";
		conex=null;
		stm=null;
	}
	
	public void conectar() {
		try {
			Class.forName("oracle.jdbc.OracleDriver").newInstance();
			conex=DriverManager.getConnection(url,user,pass);
			System.out.println("Conexion realizada");
		} catch (Exception e) {
			System.out.println("No se realizo la conexion");
		}
	}
	
	public void crearTabla() throws SQLException {
		stm= conex.createStatement();
		int r=0;
		String cadSql;
		
		try {
			cadSql="create table ALUMNOS(ID VARCHAR2(2) PRIMARY KEY, NOMBRE VARCHAR2(20),EDAD NUMBER)";
			r=stm.executeUpdate(cadSql);
			JOptionPane.showMessageDialog(null,(r+1)+" tabla creada");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null," tabla NO creada");
		 	}
		}
	
	public String leerDatosBD() throws SQLException{
		stm=conex.createStatement();
		String cadSql;
		
		try {
			cadSql="Select*from ALUMNOS";
			ResultSet rs=stm.executeQuery(cadSql);
			String datos=" ";
			while(rs.next()) {
				datos+=(rs.getString("ID")+" "+rs.getString(2)+" "+rs.getInt(3)) +"\n";
			}
			return datos;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "La tabla no existe");
			return null;
		}
	}
	
	public void ingresarDatosBD(String id, String nombre, int edad) throws SQLException{
		int r;
		String cadSql;
		stm=conex.createStatement();
		
		try {
			cadSql="insert into ALUMNOS values('"+id+"','"+nombre+"','"+edad+"')";
			r=stm.executeUpdate(cadSql);
			JOptionPane.showMessageDialog(null,r+ " registro agregado");
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null," registro no agregado");
		}
	}
		
	public String buscarDatosBD(String id) throws SQLException{
		stm=conex.createStatement();
		
		String cadSql;
		
		try {
			String nombre="";
			cadSql="select*from ALUMNOS where ID='"+id+"'";
			ResultSet rs=stm.executeQuery(cadSql);
			while(rs.next()) {
				nombre=rs.getString(1)+" "+rs.getString(2)+ " "+rs.getInt(3);
			}
			return nombre;
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "El codigo no existe");
			return null;
		}
	}
	
	public void eliminarDatos(String id) throws SQLException{
		int r;
		String cadSql;
		stm=conex.createStatement();
		try {
			cadSql="delete from ALUMNOS where ID='"+id+"'";
			r=stm.executeUpdate(cadSql);
			JOptionPane.showMessageDialog(null,r+ "Registro eliminado");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "No se encontro el registro");
		}
	}
	
	public void eliminarTabla()throws SQLException{
		int r;
		String cadSql;
		stm=conex.createStatement();
		try {
			cadSql="drop table ALUMNOS";
			r=stm.executeUpdate(cadSql);
			JOptionPane.showMessageDialog(null, (r+1)+ "Tabla eliminada");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "La tabla no se encontro");
		}
	}
	
	
	
	
	
	}
