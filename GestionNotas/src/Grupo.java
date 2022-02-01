
public class Grupo {
	private int idGrupo;
	private String nombreGrupo;
	private Ciclo ciclo;
	private Asignatura[] asig;
	public Grupo(int idGrupo, String nombreGrupo, Ciclo ciclo, Asignatura[] asig) {
		super();
		this.idGrupo = idGrupo;
		this.nombreGrupo = nombreGrupo;
		this.ciclo = ciclo;
		this.asig = asig;
	}
	public int getIdGrupo() {
		return this.idGrupo;
	}
	public Asignatura[] getAsigGrupo() {
		return this.asig;
	}
	public int getCantidadAsignaturas() {
		return this.asig.length;
	}
	

	
	
	

}
