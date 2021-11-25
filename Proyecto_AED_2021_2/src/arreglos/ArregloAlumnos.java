package arreglos;

import clases.Alumno;
import java.util.ArrayList;

public class ArregloAlumnos {
	//Atributo privado
	private ArrayList <Alumno> alu;
	//Constructor
	public ArregloAlumnos() {
		alu = new ArrayList <Alumno> ();
		adicionar(new Alumno(202010001,"Juana","Estrada","56354896", 15, 996899756,0 ));
		adicionar(new Alumno(202115631,"Gabriel","Alvarez","56892315", 13, 969532455,1 ));
		adicionar(new Alumno(202018961,"Iquique","Roca","09657812", 9, 934653876,2 ));
		adicionar(new Alumno(202011351,"Jesús","Quispe","78651323", 8, 948563127,0 ));
		adicionar(new Alumno(202011891,"Kevin","Juares","89351642", 6, 986152345,1 ));
		adicionar(new Alumno(202115651,"Iskar","Howard","89451275", 16, 968543278,2 ));
	}
	//Operaciones publicas basicas
	public void adicionar(Alumno x) {
		alu.add(x);
	}
	public int tamanio() {
		return alu.size();
	}
	public Alumno obtener(int i) {
		return alu.get(i);
	}
	public Alumno buscar(int codigo) {
		for(int i = 0; i<tamanio();i++) {
			if(obtener(i).getCodAlumno() == codigo) {
				return obtener(i);
			}
		}
		return null;
	}
	public void eliminar(Alumno x) {
		alu.remove(x);
	}
	public int codigoCorrelativo() {
		if (tamanio() == 0)
			return 20001;
		else
			return obtener(tamanio()-1).getCodAlumno() + 1;
	}
}
