
public class Alumno {
	private int idAlumno;
	private String nombreAlumno;
	private Grupo grupo;
	private Nota[] notas=new Nota[grupo.getCantidadAsignaturas()];

	public Alumno(int idAlumno, String nombreAlumno, Grupo grupo) {
		this.idAlumno = idAlumno;
		this.nombreAlumno = nombreAlumno;
		this.grupo = grupo;
	}
	

	public Alumno(int idAlumno, String nombreAlumno, Grupo grupo, Nota[] notas) {
		this.idAlumno = idAlumno;
		this.nombreAlumno = nombreAlumno;
		this.grupo = grupo;
		this.notas = notas;
	}


	public int getIdAlumno() {
		return this.idAlumno;
	}
	
	public Grupo getGrupoAlumno() {
		return this.grupo;
	}
	
}
