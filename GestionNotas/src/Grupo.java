
import java.util.Arrays;

public class Grupo {
	private int idGrupo;
	private String nombreGrupo;
	private Ciclo ciclo;
	private Asignatura[] asig;
	private Alumno[] alumns;
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
	//MIRAR!!
	public static int[] increaseSize(int[] arr)
    {
        int[] newArr = new int[arr.length + 1];//Creating a new array with space for an extra element
        for(int i = 0; i < arr.length; i++)
        {
            newArr[i] = arr[i];//Copying the elements to the new array
        }
        return newArr;
    }

	
	public String listaAsignaturas() {
		String lista="NOMBRE\tID\n";
		for (int i = 0; i < this.asig.length; i++) {
			lista+= this.asig[i].getNombreAsig()+" "+this.asig[i].getIdAsignatura()+"\n";
		}
		return lista;
	}
	public String listaAlumnos() {
		String lista=null;
		for (int i = 0; i < this.asig.length; i++) {
			lista+= this.asig[i].getNombreAsig()+" ";
		}
		return lista;
	}
	public String toString() {
		return "Grupo: " +  nombreGrupo + " que pertenece al ciclo=" + this.ciclo.toString() + "Contiene las asignaturas: "
				+ listaAsignaturas() + ", alumns=" + Arrays.toString(alumns) + "]";
	}

}
