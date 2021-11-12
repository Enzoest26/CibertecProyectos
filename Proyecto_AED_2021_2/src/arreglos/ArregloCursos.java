package arreglos;

import clases.Curso;
import java.util.ArrayList;

public class ArregloCursos {
	private ArrayList <Curso> curso;
	//Constructor
	public ArregloCursos() {
		curso = new ArrayList <Curso> ();
		adicionar(new Curso(153648,"Matematica", 2, 5,45));
		adicionar(new Curso(489489,"Lenguaje", 1, 8,30));
		adicionar(new Curso(149846,"Ciencias y Tecnología", 2, 5,45));
		adicionar(new Curso(999000, "Historia",7, 10,60));
		adicionar(new Curso(482486, "Comunicación",3, 3,20));
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
