package aulas28_33;

public class Aluno {
	private String nome;
	private int matricula;
	private String curso;
	private String[][] matriz;
	
	public Aluno(String nome, int matricula, String curso, String[][] matriz) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;		
		this.matriz = matriz;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public double isAprovado(String disciplina) {
		double media = -1;
		for(int i=0; i < matriz.length ; i++){
			if(matriz[i][0].equalsIgnoreCase(disciplina)) {		
				media = 0;
				double soma = 0;
				double quantidade = matriz[i].length;				
				for(int j=1; j < quantidade; j++) {
					soma = soma + Double.parseDouble(matriz[i][j]);	
					System.out.println(soma);
				}
				
				if(quantidade > 1){
					media = soma / (quantidade-1);
				}
				
				return media;
			}		
		}
		return media;
	}
	

}
