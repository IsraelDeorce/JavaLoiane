package aula43;

public class Teste {
	
	public static void main(String[] args){	
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da Computação");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);	
		
		//A classe object (ver API) é a classe mãe do Java, todas as classes,
		//extendem a classe OBJECT. Esta classe possui um atributo toString
		//que referencia o endereço de memória, no caso abaixo, utilizamos o
		//Polimorfismo (overwrite) escrevendo um toString na classe Aluno,
		//ele então, mostrará o toString da classe Aluno ao invés do end de memória.
		System.out.println(aluno);
		
		String s1 = "asdasfa";
		String s2 = "asdasfA";
		
		//este aki está comparando a referência e não os valores;
		//System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
	}
}
