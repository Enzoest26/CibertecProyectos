package clases;

public class Curso {
	private int codCurso, ciclo,creditos,horas;
	private String asignatura;
	private double totalPagar;


	public Curso(int codCurso, int ciclo, int creditos ,int horas,String asignatura) {
		this.codCurso = codCurso;
		this.ciclo = ciclo;
		this.creditos = creditos;
		this.horas = horas;
		this.asignatura = asignatura;
	}
	//  set/get
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public void setCréditos(int créditos) {
		this.creditos = créditos;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public int getcodCurso() {
		return codCurso;
	}
	public int getCiclo() {
		return ciclo;
	}
	public int getCreditos() {
		return creditos;
	}
	public int getHoras() {
		return horas;
	}
	public String getAsignatura() {
		return asignatura;
	}
}
