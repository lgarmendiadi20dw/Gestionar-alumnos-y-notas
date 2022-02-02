
public class Asignatura {
	private Grupo grupo;
	private int idAsignatura;
	private String nombreAsig;
	private Nota[] eval1;
	private Nota[] eval2;
	private Nota[] eval3;

	public Asignatura(Grupo grupo, int idAsignatura, String nombreAsig) {
		this.grupo = grupo;
		this.idAsignatura = idAsignatura;
		this.nombreAsig = nombreAsig.toUpperCase();
		grupo.addAsignatura(this);
		eval1 = new Nota[this.grupo.getCantidadAlumnos()];
		eval2 = new Nota[this.grupo.getCantidadAlumnos()];
		eval3 = new Nota[this.grupo.getCantidadAlumnos()];
	}

	public String getNombreAsig() {
		return nombreAsig;
	}

	public int getIdAsignatura() {
		return idAsignatura;
	}

	public void addNota(Nota nota, int evalNumber) {
		int i = 0;
		boolean añadido = false;
		switch (evalNumber) {
		case 1:
			while (i < eval1.length && !añadido) {
				if (eval1[i] == null) {
					eval1[i] = nota;
					añadido = true;
				}
			}
			break;
		case 2:
			while (i < eval2.length && !añadido) {
				if (eval2[i] == null) {
					eval2[i] = nota;
					añadido = true;
				}
			}
			break;
		case 3:
			while (i < eval3.length && !añadido) {
				if (eval3[i] == null) {
					eval3[i] = nota;
					añadido = true;
				}
			}
			break;
		default:
			System.out.println("El numero de evaluación no existe");
			break;
		}
	}

	public void mostrarNotasEval(int eval) {

		switch (eval) {
		case 1:
			System.out.println("ALUMNO\t\t\tNOTA");
			for (int j = 0; j < this.eval1.length; j++) {
				System.out
						.println(this.eval1[j].getAlum().getNombreAlumno() + "\t\t\t" + this.eval1[j].getNumeroEval());
			}
			break;
		case 2:
			System.out.println("ALUMNO\t\t\tNOTA");
			for (int j = 0; j < this.eval2.length; j++) {
				System.out
						.println(this.eval2[j].getAlum().getNombreAlumno() + "\t\t\t" + this.eval2[j].getNumeroEval());
			}
			break;
		case 3:
			System.out.println("ALUMNO\t\t\tNOTA");
			for (int j = 0; j < this.eval3.length; j++) {
				System.out
						.println(this.eval3[j].getAlum().getNombreAlumno() + "\t\t\t" + this.eval3[j].getNumeroEval());
			}
			break;
		default:
			System.out.println("El numero de evaluación no existe");
			break;
		}
	}
	public void mostrarTodasNotas() {
		System.out.println("ALUMNO\t\t\tNOTA");
		System.out.println("PRIMERA EVALUACION");
		for (int j = 0; j < this.eval1.length; j++) {
			System.out
					.println(this.eval1[j].getAlum().getNombreAlumno() + "\t\t\t" + this.eval1[j].getNumeroEval());
		}
		System.out.println("SEGUNDA EVALUACION");
		for (int j = 0; j < this.eval2.length; j++) {
			System.out
					.println(this.eval2[j].getAlum().getNombreAlumno() + "\t\t\t" + this.eval2[j].getNumeroEval());
		}
		System.out.println("TERCERA EVALUACION");
		for (int j = 0; j < this.eval3.length; j++) {
			System.out
					.println(this.eval3[j].getAlum().getNombreAlumno() + "\t\t\t" + this.eval3[j].getNumeroEval());
		}
	}

}
