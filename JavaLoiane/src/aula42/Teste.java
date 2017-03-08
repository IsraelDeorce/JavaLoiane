package aula42;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//exemplo 02
		System.out.println(Constantes.URL_BLOG);
		//Como URL_BLOG é FINAL, não podemos alterá-lo:
		//Constantes.URL_BLOG = "sdsdfsdfsdfs";
		System.out.println(Constantes.URL_BLOG);
		
		
		//da mesma forma:
		
		final int total = 1;
		//total = 2;
		
		
		
		
	}

}
