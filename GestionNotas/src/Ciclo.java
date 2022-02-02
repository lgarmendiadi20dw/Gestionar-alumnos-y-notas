

public class Ciclo {
	private int idCiclo;
	private String nombreCiclo;

	public Ciclo(int idCiclo, String nombreCiclo) {
		this.idCiclo = idCiclo;
		this.nombreCiclo = nombreCiclo.toUpperCase();
	}

	public String toString() {
		return "Ciclo: " + this.nombreCiclo+"\nId del ciclo: "+this.idCiclo;
	}

	

}
