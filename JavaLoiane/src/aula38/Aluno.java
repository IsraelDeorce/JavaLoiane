package aula38;

public class Aluno extends Pessoa{
	
	private String curso;
	private double[] notas;
	
	/*
	 * o super(); chama o construtor da Super Classe (Pessoa)
	 */	
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aluno(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}
	
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
