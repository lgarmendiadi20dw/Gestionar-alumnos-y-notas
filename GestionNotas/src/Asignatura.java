

public class Asignatura {
	private Grupo grupo;
	private int idAsignatura;
	private String nombreAsig;
	private int nAsig = 0;
	private Nota[] eval1= new Nota[grupo.getCantidadAlumnos()];
	private Nota[] eval2= new Nota[grupo.getCantidadAlumnos()];
	private Nota[] eval3= new Nota[grupo.getCantidadAlumnos()];

	public Asignatura(Grupo grupo, int idAsignatura, String nombreAsig) {
		this.grupo = grupo;
		this.idAsignatura = idAsignatura;
		this.nombreAsig = nombreAsig.toUpperCase();
		this.nAsig++;
		grupo.addAsignatura(this);
	}

	public String getNombreAsig() {
		return nombreAsig;
	}
	

	public int getIdAsignatura() {
		return idAsignatura;
	}

	public void addNota(Nota nota, int evalNumber) {
		int i = 0;
		boolean a�adido = false;
		switch (evalNumber) {
		case 1:
			while (i < eval1.length && !a�adido) {
				if (eval1[i] == null) {
					eval1[i] = nota;
					a�adido = true;
				}
			}
			break;
		case 2:
			while (i < eval2.length && !a�adido) {
				if (eval2[i] == null) {
					eval2[i] = nota;
					a�adido = true;
				}
			}
			break;
		case 3:
			while (i < eval3.length && !a�adido) {
				if (eval3[i] == null) {
					eval3[i] = nota;
					a�adido = true;
				}
			}
			break;
		default:
			System.out.println("El numero de evaluaci�n no existe");
			break;
		}
	}

}
