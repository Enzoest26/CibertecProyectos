package arreglos;

import clases.Curso;
import java.util.ArrayList;

public class ArregloCursos {
	private ArrayList <Curso> curso;
	//Constructor
	public ArregloCursos() {
		curso = new ArrayList <Curso> ();
		adicionar(new Curso(153648, 2, 5,45,"Matematica"));
		adicionar(new Curso(489489, 1, 8,30,"Lenguaje"));
		adicionar(new Curso(149846, 2, 5,45,"Ciencias y Tecnología"));
		adicionar(new Curso(999000, 7, 10,60,"Historia"));
		adicionar(new Curso(482486, 3, 3,20,"Comunicación"));
	}
	//Operaciones publicas basicas
	public void adicionar(Curso x) {
		curso.add(x);
	}
	public int tamanio() {
		return curso.size();
	}
	public Curso obtener(int i) {
		return curso.get(i);
	}
	public Curso buscar(int codigo) {
		for(int i = 0; i<tamanio();i++) {
			if(obtener(i).getcodCurso() == codigo) {
				return obtener(i);
			}
		}
		return null;
	}
	public void eliminar(Curso x) {
		curso.remove(x);
	}
}
