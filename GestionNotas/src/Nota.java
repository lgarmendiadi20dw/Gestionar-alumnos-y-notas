
public class Nota {
	private double calificacion;// nota
	private Evaluacion eval;
	private Alumno alum;

	public Nota(Evaluacion eval, Alumno alum, double calificacion) {

		this.calificacion = calificacion;
		this.eval = eval;
		this.alum = alum;
	}

	public Nota(Evaluacion eval, Alumno alum) {

		this.calificacion = (Double) null;// sin clasificar
		this.eval = eval;
		this.alum = alum;
	}

	public void setCalificacion(double nota) {
		this.calificacion = nota;
	}

	public double getCalificacion() {
		return this.calificacion;
	}

	/*public void addNota(Evaluacion eval, Alumno alumno, double nota) {
		if
	}*/

}
