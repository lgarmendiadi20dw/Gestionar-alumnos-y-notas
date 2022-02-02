

public class Main {
	
	/*Ciclo c1= new Ciclo(1, "DW");
	Grupo g1= new Grupo(2, "DW31", c1, null,null);
	Asignatura asig1=new Asignatura(g1, 1, "Mate");
	Asignatura asig2=new Asignatura(g1, 2, "ED");
	Asignatura asig3=new Asignatura(g1, 3, "Prog");
	Asignatura[] asig= {asig1,asig2,asig3};
	Alumno a1= new Alumno(1, "Xabi", g1);
	Alumno a2= new Alumno(2, "Leire", g1);
	Alumno a3= new Alumno(3, "Iker", g1);
	*/
	public static void main(String[] args) {
		Ciclo c1= new Ciclo(1, "DW");
		
		Grupo g1= new Grupo(2, "DW31", c1);
		
		Asignatura asig1=new Asignatura(g1, 1, "Mate");
		Asignatura asig2=new Asignatura(g1, 2, "ED");
		Asignatura asig3=new Asignatura(g1, 3, "Prog");
		Alumno a1= new Alumno(1, "Mikel", g1);
		Alumno a2= new Alumno(2, "Leire", g1);
		Alumno a3= new Alumno(3, "Iñaki", g1);
		System.out.println(g1.toString());
	}

}
