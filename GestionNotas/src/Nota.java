
public class Nota {
	private double calificacion;// nota
	private Evaluacion eval;
	private Alumno alum;

	public Nota(double calificacion, Evaluacion eval, Alumno alum) {

		this.calificacion = calificacion;
		this.eval = eval;
		this.alum = alum;
	}

	public void setCalificacion(double nota) {
		this.calificacion = nota;
	}

	public double getCalificacion() {
		return calificacion;
	}
	
}
