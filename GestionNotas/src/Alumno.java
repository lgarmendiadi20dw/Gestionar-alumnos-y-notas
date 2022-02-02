
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

	public void AñadirNotaAlumno(Asignatura asig, int evalNumber, Integer calificacion) {
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
		System.out.println("PRIMERA EVALUACION");
		System.out.println("EVALUACION\t\t\tASIGNATURAS\t\t\tNOTA");
		for (int i = 0; i < this.notas.length; i++) {
			if(this.notas[i].getNumeroEval()==1) {
			System.out.println(this.notas[i].getNumeroEval()+"\t\t\t"+notas[i].getAsignatura()+"\t\t"+this.notas[i].getCalificacion());
			}
		}

		System.out.println("SEGUNDA EVALUACION");
		System.out.println("EVALUACION\t\t\tASIGNATURAS\t\t\tNOTA");
		for (int i = 0; i < this.notas.length; i++) {
			if(this.notas[i].getNumeroEval()==2) {
			System.out.println(this.notas[i].getNumeroEval()+"\t\t\t"+notas[i].getAsignatura()+"\t\t"+this.notas[i].getCalificacion());
			}
		}

		System.out.println("TERCERA EVALUACION");
		System.out.println("EVALUACION\t\t\tASIGNATURAS\t\t\tNOTA");
		for (int i = 0; i < this.notas.length; i++) {
			if(this.notas[i].getNumeroEval()==3) {
			System.out.println(this.notas[i].getNumeroEval()+"\t\t\t"+notas[i].getAsignatura()+"\t\t"+this.notas[i].getCalificacion());
			}
		}
	}

	public String toString() {
		return "Nombre: " + this.nombreAlumno + " id del alumno: " + this.idAlumno + "\nEste alumno pertenece al grupo "
				+ this.grupo.getNombreGrupo();
	}

}
