package arreglos;

import clases.Retiro ;

import java.io.*;
import java.util.ArrayList;

public class ArregloRetiro  {
	//  Atributo privado
	private ArrayList <Retiro > retiro ;
    //  Constructor
	public ArregloRetiro () {
		retiro  = new ArrayList <Retiro > ();
		cargarRetiro ();
	}
	//  Operaciones públicas básicas
	public void adicionar(Retiro  x) {
		retiro.add(x);
		grabarRetiros ();
	}
	public int tamaño() {
		return retiro.size();
	}
	public Retiro  obtener(int i) {
		return retiro.get(i);
	}
	public Retiro  buscar(int numRetiro) {
		for (int i=0; i<tamaño(); i++)
			if (obtener(i).getNumRetiro() == numRetiro)
				return obtener(i);
		return null;
	}
	public void eliminar(Retiro x) {
		retiro.remove(x);
		grabarRetiros();
	}
	public void actualizarArchivo() {
		grabarRetiros();
	}
	private void grabarRetiros() {
		try {
			PrintWriter pw;
			String linea;
			Retiro x;
			pw = new PrintWriter(new FileWriter("retiros.txt"));
			for (int i=0; i<tamaño(); i++) {
				x = obtener(i);
				linea =	x.getNumRetiro() + ";" +
						x.getNumMatricula() + ";" +
						x.getFecha() + ";" +
						x.getFecha();
				pw.println(linea);
			}
			pw.close();
		}
		catch (Exception e) {
		}
	}
	public void cargarRetiro() {
		try {
			BufferedReader br;
			String linea,fecha,hora;
			String[] s;
			int numRetiro,numMatricula;
			br = new BufferedReader(new FileReader("retiros.txt"));
			while ((linea=br.readLine()) != null) {
				s = linea.split(";");
				numRetiro = Integer.parseInt(s[0].trim());
				numMatricula = Integer.parseInt(s[1].trim());
				fecha = s[3].trim();
				hora = s[4].trim();
				adicionar(new Retiro(numRetiro,numMatricula,fecha,hora));
			}
			br.close();
		}
		catch (Exception e) {
		}
	}
	//  Operaciones públicas complementarias
	public int codigoCorrelativo() {
		if (tamaño() == 0)
			return 200001;
		else
			return obtener(tamaño()-1).getNumRetiro() + 1;
	}
	public boolean procedenumMatricula(int numMatricula) {
		for (int i=tamaño()-1; i>=0; i--)
			if (obtener(i).getNumMatricula() == numMatricula)
				if (obtener(i).getNumMatricula() == 0)
					return false;
				else
					return true;
		return true;
	}
	
}