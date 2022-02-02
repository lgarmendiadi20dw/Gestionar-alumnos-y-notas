

public class Asignatura {
	private Grupo grupo;
	private int idAsignatura;
	private String nombreAsig;
	private int nAsig = 0;
	private Nota[] eval1;
	private Nota[] eval2;
	private Nota[] eval3;

	public Asignatura(Grupo grupo, int idAsignatura, String nombreAsig) {
		this.grupo = grupo;
		this.idAsignatura = idAsignatura;
		this.nombreAsig = nombreAsig.toUpperCase();
		this.nAsig++;
		grupo.addAsignatura(this);
		eval1= new Nota[this.grupo.getCantidadAlumnos()];
		eval2= new Nota[this.grupo.getCantidadAlumnos()];
		eval3= new Nota[this.grupo.getCantidadAlumnos()];
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

}
