package aula41;

public class Aluno extends Pessoa{
	
	private String curso;
	private double[] notas;
	
	
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
	
	public void metodoQualquer(){
		this.setCpf("51651651");
		super.setCpf("561818");
	}
	
	public String obterEtiquetaEndereco(){
		String s = "Endereco do Aluno: ";
		s += super.getEndereco();
		
		return s;
	}
	@Override
	public void metodoAbstrato() {
		// TODO Auto-generated method stub
		
	}

}	
