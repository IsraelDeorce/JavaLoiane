package aula37;

public class Aluno extends Pessoa{
	
	private String curso;
	private double[] notas;
	
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	public double calcularMedia(){
		return 0;
	}
	
	public boolean verificarAprovada(){
		return true;
	}

}	
