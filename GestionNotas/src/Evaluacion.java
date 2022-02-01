
public class Evaluacion {
	public int numEval;//1,2,3 ; damos por hecho que el usuario introducira uno de esos numeros
	public Asignatura[] asig;
	public Nota[] notas;
	public Evaluacion(int numEval, Asignatura[] asig, Nota[] notas) {
		this.numEval = numEval;
		this.asig = asig;
		this.notas = notas;
	}
	public Evaluacion(int numEval, Asignatura[] asig) {
		this.numEval = numEval;
		this.asig = asig;
		this.notas= new Nota[asig.length];
	}
	public Nota[] getNotas() {
		return this.notas;
	}
	public int getNumEval() {
		return numEval;
	}
	public Asignatura[] getAsig() {
		return asig;
	}
	
}
