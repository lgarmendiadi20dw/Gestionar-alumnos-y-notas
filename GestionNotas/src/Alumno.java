
public class Alumno {
	private int idAlumno;
	private String nombreAlumno;
	private Grupo grupo;
	private Nota[] nota;

	public Alumno(int idAlumno, String nombreAlumno, Grupo grupo) {
		this.idAlumno = idAlumno;
		this.nombreAlumno = nombreAlumno;
		this.grupo = grupo;
	}

	public int getIdAlumno() {
		return idAlumno;
	}
	
}
