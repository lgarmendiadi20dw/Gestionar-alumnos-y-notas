package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Codigo.Alumno;
import Codigo.Asignatura;
import Codigo.Ciclo;
import Codigo.Grupo;
import Codigo.Nota;

class TestGestion {

	/*@Test
	void testMostrarNotasAlumno() {
		fail("Not yet implemented");
	}*/
	@Test
	void testAñadirNotas() {
		Ciclo ci = new Ciclo(1, "DW");
		Grupo gr = new Grupo(2, "DW31", ci);
		Asignatura asig = new Asignatura(gr, 1, "Mate");
		Alumno al = new Alumno(2, "Leire", gr);
		al.agregarNotaAlumno(asig, 1, 5);
		Nota result= new Nota(al, asig, 5, 1);		
		boolean resultado=al.getNotas().equals(result);
		boolean resultadoEsperado=true;
	}

}
