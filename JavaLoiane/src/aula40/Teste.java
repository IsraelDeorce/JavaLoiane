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
		 * Oberve que o m�todo obterEtiquetaEndereco() � da classe Pessoa,
		 * mas como Aluno e Professor estendem Pessoa, um objeto instaciado
		 * como new ALUNO(); mesmo sendo do tipo PESSOA, pode utiliz�-lo.
		 * Observe tamb�m que a classe Aluno possui um m�todo de sobrescrita
		 * de obterEtiquetaEndereco, logo ele ser� chamado ao inv�z do m�todo da
		 * classe Pessoa  (POLIMORFISMO)
		 * 
		 * MESMO N�O PODENDO CHAMAR M�TODOS DA CLASSE ALUNO, (a vari�vel � do tipo
		 * Pessoa).
		 */
	}

}
