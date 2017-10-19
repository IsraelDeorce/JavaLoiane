package aula67;

//eu já tenho uma thread por estar extendendo uma
public class MinhaThread extends Thread{
	
	//so para ter alguma coisa
	private String nome;
	
	public MinhaThread(String nome){
		this.nome = nome;
		this.start();
	}
	
	//aki vai fazê uqui a gente tem qi fazê
	//o run é chamado pelo start()
	public void run(){
		System.out.println("Executando a Thread");				
	}

}
