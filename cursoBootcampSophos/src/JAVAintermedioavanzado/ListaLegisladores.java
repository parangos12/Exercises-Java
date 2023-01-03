package JAVAintermedioavanzado;

import java.time.LocalDate;
import java.time.Month;

public class ListaLegisladores {

	public static void main(String[] args) {
		
		System.out.println("LISTA DE SENADORES:");
		Senador a=new Senador();
		a.SetNombre_Completo("Pedro Arango Sanchez");
		a.SetAltura(1.80);
		a.SetCiudad_Origen("Apartado");
		a.SetTelefono(3127098433l);
		a.SetprovinciaQueRepresenta("ANTIOQUIA");
		System.out.println(a.GetNombre_Completo());
		System.out.println(a.GetAltura());
		System.out.println(a.GetCiudad_Origen());
		System.out.println(a.GetTelefono());
		System.out.println(a.GetprovinciaQueRepresenta());
		System.out.println(a.getCamaraEnQueTrabaja());
		System.out.println("--------------------------------------");

		Senador b=new Senador();
		b.SetNombre_Completo("Jose Alberto Sanchez");
		b.SetAltura(1.80);
		b.SetCiudad_Origen("Apartado");
		b.SetTelefono(3217258514l);
		b.SetprovinciaQueRepresenta("ANTIOQUIA");
		System.out.println(b.GetNombre_Completo());
		System.out.println(b.GetAltura());
		System.out.println(b.GetCiudad_Origen());
		System.out.println(b.GetTelefono());
		System.out.println(b.GetprovinciaQueRepresenta());
		System.out.println(b.getCamaraEnQueTrabaja());
		System.out.println("--------------------------------------");

		
		Senador c=new Senador();
		c.SetNombre_Completo("Jesus Arango Perez");
		c.SetAltura(1.70);
		c.SetCiudad_Origen("Cañasgordas");
		c.SetTelefono(3507891480l);
		c.SetprovinciaQueRepresenta("ANTIOQUIA");
		System.out.println(c.GetNombre_Completo());
		System.out.println(c.GetAltura());
		System.out.println(c.GetCiudad_Origen());
		System.out.println(c.GetTelefono());
		System.out.println(c.GetprovinciaQueRepresenta());
		System.out.println(c.getCamaraEnQueTrabaja());
		System.out.println("--------------------------------------");
		
		System.out.println("LISTA DE DIPUTADOS:");
		Diputado aa=new Diputado();
		aa.SetNombre_Completo("Pedro Arango Sanchez");
		aa.SetAltura(1.80);
		aa.SetCiudad_Origen("Apartado");
		aa.SetTelefono(3127098433l);
		aa.SetprovinciaQueRepresenta("ANTIOQUIA");
		System.out.println(aa.GetNombre_Completo());
		System.out.println(aa.GetAltura());
		System.out.println(aa.GetCiudad_Origen());
		System.out.println(aa.GetTelefono());
		System.out.println(aa.GetprovinciaQueRepresenta());
		System.out.println(aa.getCamaraEnQueTrabaja());
		System.out.println("--------------------------------------");

		Diputado bb=new Diputado();
		bb.SetNombre_Completo("Jose Alberto Sanchez");
		bb.SetAltura(1.80);
		bb.SetCiudad_Origen("Apartado");
		bb.SetTelefono(3217258514l);
		bb.SetprovinciaQueRepresenta("ANTIOQUIA");
		System.out.println(bb.GetNombre_Completo());
		System.out.println(bb.GetAltura());
		System.out.println(bb.GetCiudad_Origen());
		System.out.println(bb.GetTelefono());
		System.out.println(bb.GetprovinciaQueRepresenta());
		System.out.println(bb.getCamaraEnQueTrabaja());
		System.out.println("--------------------------------------");

		
		Diputado cc=new Diputado();
		cc.SetNombre_Completo("Jesus Arango Perez");
		cc.SetAltura(1.70);
		cc.SetCiudad_Origen("Cañasgordas");
		cc.SetTelefono(3507891480l);
		cc.SetprovinciaQueRepresenta("ANTIOQUIA");
		System.out.println(cc.GetNombre_Completo());
		System.out.println(cc.GetAltura());
		System.out.println(cc.GetCiudad_Origen());
		System.out.println(cc.GetTelefono());
		System.out.println(cc.GetprovinciaQueRepresenta());
		System.out.println(cc.getCamaraEnQueTrabaja());
		System.out.println("--------------------------------------");

	}
}
