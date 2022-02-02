
public class Main {
	public static Integer notaValida() {
		boolean notaAceptada = false;
		Integer notaIntro = null;
		while (!notaAceptada) {
			notaIntro = Console.readInt();
			if (notaIntro >= 0 && notaIntro <= 10) {
				notaAceptada = true;
			}
		}
		return notaIntro;
	}

	public static void menu() {
		// INICIO DATOS INTRODUCIDOS
		Ciclo c1 = new Ciclo(1, "DW");
		Grupo g1 = new Grupo(2, "DW31", c1);
		Asignatura asig1 = new Asignatura(g1, 1, "Mate");
		Asignatura asig2 = new Asignatura(g1, 2, "ED");
		Asignatura asig3 = new Asignatura(g1, 3, "Prog");
		Alumno a1 = new Alumno(1, "Mikel", g1);
		Alumno a2 = new Alumno(2, "Leire", g1);
		Alumno a3 = new Alumno(3, "Iñaki", g1);
		// FIN DATOS INTRODUCIDOS

		// INICIO MENU
		int opcion;
		boolean terminar = false;
		do {
			System.out.println("Menu de opciones:");
			System.out.println("1. Ver notas alumno");
			System.out.println("2. Ver Notas asignatura");
			System.out.println("3. Añadir nota a alumno");
			System.out.println("AVISO: Si intoduces una opción no valida la ejecucion de la aplicacion finalizara");
			opcion = Console.readInt();
			switch (opcion) {
			case 1:
				System.out.println(g1.listaAlumnos());
				System.out.println("Elige un alumno por su id");
				int opcionAlumno = Console.readInt();
				switch (opcionAlumno) {
				case 1:
					a1.mostrarNotasAlumno();
					break;
				case 2:
					a2.mostrarNotasAlumno();
					break;
				case 3:
					a3.mostrarNotasAlumno();
					break;
				}
			case 2:
				System.out.println(g1.listaAsignaturas());
				System.out.println("Elige una asignatura por su id");
				int opcionAsig = Console.readInt();
				System.out.println("Para ver todas las evaluaciones elige '1'");
				System.out.println("Para ver una evaluacion en especifico elige '2'");
				int opcionMostrar = Console.readInt();
				switch (opcionMostrar) {
				case 1:
					switch (opcionAsig) {
					case 1:
						asig1.mostrarTodasNotas();
						break;
					case 2:
						asig2.mostrarTodasNotas();
						break;
					case 3:
						asig3.mostrarTodasNotas();
						break;
					}
				case 2:
					System.out.println("Elige entre la 1º, 2º y 3º evaluacion");
					int opcionEval = Console.readInt();
					switch (opcionAsig) {
					case 1:
						asig1.mostrarNotasEval(opcionEval);
						break;
					case 2:
						asig2.mostrarNotasEval(opcionEval);
						break;
					case 3:
						asig3.mostrarNotasEval(opcionEval);
						break;
					}
				case 3:
					System.out.println(g1.listaAlumnos());

					System.out.println("Elige un alumno por su id");
					int eleccionAlumno = Console.readInt();
					System.out.println(g1.listaAsignaturas());
					System.out.println("Elige la asinatura a calificar por su id");
					int eleccionAsig = Console.readInt();
					System.out.println("Elige la evaluacion a calificar: 1, 2, 3");
					int eleccionEval = Console.readInt();
					System.out.println("Introduce la nota (numeros naturales del 0 al 10):");

					Integer notaIntro = notaValida();

					switch (eleccionAlumno) {
					case 1:
						switch (eleccionAsig) {
						case 1:
							a1.agregarNotaAlumno(asig1, eleccionEval, notaIntro);
							break;
						case 2:
							a1.agregarNotaAlumno(asig2, eleccionEval, notaIntro);
							break;
						case 3:
							a1.agregarNotaAlumno(asig3, eleccionEval, notaIntro);
							break;

						default:
							break;
						}

						break;
					case 2:
						switch (eleccionAsig) {
						case 1:
							a2.agregarNotaAlumno(asig1, eleccionEval, notaIntro);
							break;
						case 2:
							a2.agregarNotaAlumno(asig2, eleccionEval, notaIntro);
							break;
						case 3:
							a2.agregarNotaAlumno(asig3, eleccionEval, notaIntro);
							break;

						default:
							break;
						}
						break;
					case 3:
						switch (eleccionAsig) {
						case 1:
							a3.agregarNotaAlumno(asig1, eleccionEval, notaIntro);
							break;
						case 2:
							a3.agregarNotaAlumno(asig2, eleccionEval, notaIntro);
							break;
						case 3:
							a3.agregarNotaAlumno(asig3, eleccionEval, notaIntro);
							break;

						default:
							break;
						}
						break;
					}
				}
			default:
				terminar = true;
				break;
			}

		} while (!terminar);
	}

	public static void main(String[] args) {
		menu();
	}

}
