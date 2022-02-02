
public class Alumno {
	private int idAlumno;
	private String nombreAlumno;
	private Grupo grupo;
	private Nota[] notas;

	public Alumno(int idAlumno, String nombreAlumno, Grupo grupo) {
		this.idAlumno = idAlumno;
		this.nombreAlumno = nombreAlumno.toUpperCase();
		this.grupo = grupo;
		this.grupo.addAlumn(this);
		notas = new Nota[grupo.getCantidadAsignaturas()];
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
		int i = 0;
		boolean añadido = false;
		while (i < notas.length && !añadido) {
			if (notas[i] == null) {
				notas[i] = nota;
				añadido = true;
			}
		}
	}

	public void mostrarNotasAlumno() {
		System.out.println("ASIGNATURAS"+"\t\t"+"NOTA");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(this.notas[i].getAsignatura()+"\t\t"+this.notas[i].getCalificacion());
		}
	}

	public String toString() {
		return "Nombre: " + this.nombreAlumno + " id del alumno: " + this.idAlumno + "\nEste alumno pertenece al grupo "
				+ this.grupo.getNombreGrupo();
	}

}
