

public class Alumno {
	private int idAlumno;
	private String nombreAlumno;
	private Grupo grupo;
	private Nota[] notas = new Nota[grupo.getCantidadAsignaturas()];

	public Alumno(int idAlumno, String nombreAlumno, Grupo grupo) {
		this.idAlumno = idAlumno;
		this.nombreAlumno = nombreAlumno.toUpperCase();
		this.grupo = grupo;
	}

	public Alumno(int idAlumno, String nombreAlumno, Grupo grupo, Nota[] notas) {
		this.idAlumno = idAlumno;
		this.nombreAlumno = nombreAlumno.toUpperCase();
		this.grupo = grupo;
		this.notas = notas;
	}

	public int getIdAlumno() {
		return this.idAlumno;
	}
	
	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public Grupo getGrupoAlumno() {
		return this.grupo;
	}

	public void crearNota(Asignatura asig, int evalNumber, Integer calificacion) {
		Nota nota = new Nota(this, asig, evalNumber, calificacion);
		this.addNota(nota);
		asig.addNota(nota, evalNumber);
	}
	
	public void addNota(Nota nota) {
		int i=0;
		boolean a�adido=false;
		while (i < notas.length && !a�adido) {
			if (notas[i] == null) {
				notas[i] = nota;
				a�adido = true;
			}
		}
	}
	
	
	public String toString() {
		return "s";
	}

	
}
