package Codigo;

public class Nota {
	private Integer calificacion;// las notas están redondeadas
	private Asignatura asignatura;
	private int NumeroEval; // 1-3
	private Alumno alum;

	public Nota(Alumno alum, Asignatura asignatura, Integer calificacion, int eval) {
		this.alum = alum;
		this.asignatura = asignatura;
		this.calificacion = calificacion;
		this.NumeroEval = eval;
	}


	public Integer getCalificacion() {
		return this.calificacion;
	}

	public Alumno getAlum() {
		return alum;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public int getNumeroEval() {
		return NumeroEval;
	}

}
