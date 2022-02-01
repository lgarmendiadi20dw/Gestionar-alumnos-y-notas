
public class Asignatura {
	private Ciclo ciclo;
	private int idAsignatura;
	private String nombreAsig;
	private int nAsig=0;
	private Evaluacion eval1[];
	private Evaluacion eval2[];
	private Evaluacion eval3[];
	public Asignatura(Ciclo ciclo, int idAsignatura, String nombreAsig) {
		this.ciclo = ciclo;
		this.idAsignatura = idAsignatura;
		this.nombreAsig = nombreAsig;
		this.nAsig++;
	}
	
	
}
