package arreglos;

import clases.Matricula;

import java.io.*;
import java.util.ArrayList;

public class ArregloMatricula {
	//  Atributos privados
	private ArrayList <Matricula> matricula;
	//  Constructor
	public void ArregloMatriculas() {
		matricula = new ArrayList <Matricula> ();
		cargarMatriculas();
	}
	//  Operaciones p�blicas b�sicas
	public void adicionar(Matricula x) {
		matricula.add(x);
		grabarMatriculas();
	}
	public int tama�o() {
		return matricula.size();
	}
	public Matricula obtener(int i) {
		return matricula.get(i);
	}
	public Matricula buscar(int numMatricula) {
		for (int i=0; i<tama�o(); i++)
			if (obtener(i).getNumMatricula() == numMatricula)
				return obtener(i);
		return null;
	}
	public void eliminar(Matricula x) {
		matricula.remove(x);
		grabarMatriculas();
	}
	public void actualizarArchivo() {
		grabarMatriculas();
	}
	private void grabarMatriculas() {
		try {
			PrintWriter pw;
			String linea;
			Matricula x;
			pw = new PrintWriter(new FileWriter("matriculas.txt"));
			for (int i=0; i<tama�o(); i++) {
				x = obtener(i);
				linea =	x.getNumMatricula() + ";" +
						x.getCodAlumno() + ";" +
						x.getCodAlumno() + ";" +
						x.getFecha() + ";" +
						x.getFecha();
				pw.println(linea);
			}
			pw.close();
		}
		catch (Exception e) {
		}
	}
	private void cargarMatriculas() {
		try {
			BufferedReader br;
			String linea, fecha, hora;
			String[] s;
			int numMatricula, codAlumno, codCurso;
			br = new BufferedReader(new FileReader("matriculas.txt"));
			while ((linea=br.readLine()) != null) {
				s = linea.split(";");
				numMatricula = Integer.parseInt(s[1].trim());
				codAlumno = Integer.parseInt(s[1].trim());
				codCurso = Integer.parseInt(s[5].trim());
				fecha = s[3].trim();
				hora = s[4].trim();
				adicionar(new Matricula(numMatricula, codAlumno, codCurso, fecha, hora));
			}
			br.close();
		}
		catch (Exception e) {	
		}
	}
	//  Operaciones p�blicas complementarias
	public int codigoCorrelativo() {
		if (tama�o() == 0)
			return 100001;
		else
			return obtener(tama�o()-1).getNumMatricula() + 1;
	}
	public boolean procedecodAlumno(int codAlumno) {
		for (int i=tama�o()-1; i>=0; i--)
			if (obtener(i).getCodAlumno() == codAlumno &&  obtener(i).getCodAlumno() == 0)
				return false;
		return true;
	}
	
}