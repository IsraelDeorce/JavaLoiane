package aula41;

public class Teste {

	public static void main(String[] args) {
		
		//N�o podemos instaciar uma classe abstrata!
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Professor professor = new Professor();
		
		//pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");		
		
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
		
	}

}
