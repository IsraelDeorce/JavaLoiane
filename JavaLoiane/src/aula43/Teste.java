package aula43;

public class Teste {
	
	public static void main(String[] args){	
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ci�ncia da Computa��o");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);	
		
		//A classe object (ver API) � a classe m�e do Java, todas as classes,
		//extendem a classe OBJECT. Esta classe possui um atributo toString
		//que referencia o endere�o de mem�ria, no caso abaixo, utilizamos o
		//Polimorfismo (overwrite) escrevendo um toString na classe Aluno,
		//ele ent�o, mostrar� o toString da classe Aluno ao inv�s do end de mem�ria.
		System.out.println(aluno);
		
		String s1 = "asdasfa";
		String s2 = "asdasfA";
		
		//este aki est� comparando a refer�ncia e n�o os valores;
		//System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
	}
}
