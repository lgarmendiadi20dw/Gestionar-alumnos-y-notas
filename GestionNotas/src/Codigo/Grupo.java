package Codigo;

import java.util.Arrays;

public class Grupo {
	private int idGrupo;
	private String nombreGrupo;
	private Ciclo ciclo;
	private Asignatura[] asig = new Asignatura[1];
	private Alumno[] alumns = new Alumno[1];

	public Grupo(int idGrupo, String nombreGrupo, Ciclo ciclo) {
		this.idGrupo = idGrupo;
		this.nombreGrupo = nombreGrupo.toUpperCase();
		this.ciclo = ciclo;
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

	public int getCantidadAlumnos() {
		return this.alumns.length;
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	// MIRAR!!
	public Asignatura[] increaseAsig(Asignatura[] asig) {
		Asignatura[] newArr = new Asignatura[asig.length + 1];
		for (int i = 0; i < asig.length; i++) {
			newArr[i] = asig[i];// Copying the elements to the new array
		}
		return newArr;
	}

	public void addAsignatura(Asignatura asignatura) {
		this.asig = increaseAsig(this.asig);
		for (int i = 0; i < this.asig.length; i++) {
			if (this.asig[i] == null) {
				this.asig[i] = asignatura;
			}
		}
	}

	public Alumno[] increaseAlumn(Alumno[] alums) {
		Alumno[] newArr = new Alumno[alumns.length + 1];
		for (int i = 0; i < alumns.length; i++) {
			newArr[i] = alumns[i];// Copying the elements to the new array
		}
		return newArr;
	}

	public void addAlumn(Alumno alumn) {
		this.alumns = increaseAlumn(this.alumns);
		for (int i = 0; i < this.alumns.length; i++) {
			if (this.alumns[i] == null) {
				this.alumns[i] = alumn;
			}
		}
	}

	public String listaAsignaturas() {
		String lista = "NOMBRE\tID\n";
		for (int i = 0; i < this.asig.length; i++) {
			lista += this.asig[i].getNombreAsig() + "\t" + this.asig[i].getIdAsignatura() + "\n";
		}
		return lista;
	}

	public String listaAlumnos() {
		String lista = "NOMBRE\tID\n";
		for (int i = 0; i < this.asig.length; i++) {
			lista += this.alumns[i].getNombreAlumno() + "\t" + this.alumns[i].getIdAlumno() + "\n";
		}
		return lista;
	}

	public String toString() {
		return "Grupo: " + nombreGrupo + " que pertenece a " + this.ciclo.toString() + "Lista de asignaturas: \n"
				+ listaAsignaturas() + "Lista de Alumnos:\n" + listaAlumnos();
	}

}
