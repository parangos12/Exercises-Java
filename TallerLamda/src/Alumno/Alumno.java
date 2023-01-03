package Alumno;

public class Alumno {
	private int id;
	private String cedula;
	private String apellidos;
	private String nombreCurso;
	private int nota;
	private int edad;
	
	public Alumno() {
	}

	public Alumno(int id, String cedula, String apellidos, String nombreCurso, int nota, int edad) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.apellidos = apellidos;
		this.nombreCurso = nombreCurso;
		this.nota = nota;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = (int) nota;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", cedula=" + cedula + ", apellidos=" + apellidos + ", nombreCurso=" + nombreCurso
				+ ", nota=" + nota + ", edad=" + edad + "]";
	}

}

