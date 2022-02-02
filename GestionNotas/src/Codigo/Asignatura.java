package Codigo;

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

	public void addNota(Nota nota) {
		int i = 0;
		int evalNumber = nota.getNumeroEval();
		boolean añadido = false;
		switch (evalNumber) {
		case 1:
			while (i < this.eval1.length && !añadido) {
				if (this.eval1[i] == null) {
					this.eval1[i] = nota;
					añadido = true;
				}
			}
			break;
		case 2:
			while (i < this.eval2.length && !añadido) {
				if (this.eval2[i] == null) {
					this.eval2[i] = nota;
					añadido = true;
				}
			}
			break;
		case 3:
			while (i < this.eval3.length && !añadido) {
				if (this.eval3[i] == null) {
					this.eval3[i] = nota;
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
			for (int i = 0; i < this.eval1.length; i++) {
				if (this.eval1[i] != null) {
					System.out.println(
							this.eval1[i].getAlum().getNombreAlumno() + "\t\t\t" + this.eval1[i].getCalificacion());
				} else {
					System.out.println("null\t\t\tnull");
				}
			}
			break;
		case 2:
			System.out.println("ALUMNO\t\t\tNOTA");
			for (int i = 0; i < this.eval2.length; i++) {
				if (this.eval2[i] != null) {
					System.out.println(
							this.eval2[i].getAlum().getNombreAlumno() + "\t\t\t" + this.eval2[i].getCalificacion());
				} else {
					System.out.println("null\t\t\tnull");
				}
			}
			break;
		case 3:
			System.out.println("ALUMNO\t\t\tNOTA");
			for (int i = 0; i < this.eval3.length; i++) {
				if (this.eval3[i] != null) {
					System.out.println(
							this.eval3[i].getAlum().getNombreAlumno() + "\t\t\t" + this.eval3[i].getCalificacion());
				} else {
					System.out.println("null\t\t\tnull");
				}
			}
			break;
		default:
			System.out.println("El numero de evaluación no existe");
			break;
		}
	}

	public void mostrarTodasNotas() {

		System.out.println("\tPRIMERA EVALUACION");
		System.out.println("ALUMNO\t\t\tNOTA");
		for (int i = 0; i < this.eval1.length; i++) {
			if (this.eval1[i] != null) {
				System.out.println(
						this.eval1[i].getAlum().getNombreAlumno() + "\t\t\t" + this.eval1[i].getCalificacion());
			} else {
				System.out.println("null\t\t\tnull");
			}
		}
		System.out.println("\tSEGUNDA EVALUACION");
		System.out.println("ALUMNO\t\t\tNOTA");
		for (int i = 0; i < this.eval2.length; i++) {
			if (this.eval2[i] != null) {
				System.out.println(
						this.eval2[i].getAlum().getNombreAlumno() + "\t\t\t" + this.eval2[i].getCalificacion());
			} else {
				System.out.println("null\t\t\tnull");
			}
		}
		System.out.println("\tTERCERA EVALUACION");
		System.out.println("ALUMNO\t\t\tNOTA");
		for (int i = 0; i < this.eval3.length; i++) {
			if (this.eval3[i] != null) {
				System.out.println(
						this.eval3[i].getAlum().getNombreAlumno() + "\t\t\t" + this.eval3[i].getCalificacion());
			} else {
				System.out.println("null\t\t\tnull");
			}
		}
	}

}
