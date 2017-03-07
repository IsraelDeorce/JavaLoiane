package aula40;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Professor professor = new Professor();
		
		pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
		/*
		 * Oberve que o método obterEtiquetaEndereco() é da classe Pessoa,
		 * mas como Aluno e Professor estendem Pessoa, um objeto instaciado
		 * como new ALUNO(); mesmo sendo do tipo PESSOA, pode utilizá-lo.
		 * Observe também que a classe Aluno possui um método de sobrescrita
		 * de obterEtiquetaEndereco, logo ele será chamado ao invéz do método da
		 * classe Pessoa  (POLIMORFISMO)
		 * 
		 * MESMO NÃO PODENDO CHAMAR MÉTODOS DA CLASSE ALUNO, (a variável é do tipo
		 * Pessoa).
		 */
	}

}
