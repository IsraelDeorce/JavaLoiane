package aula67;

//eu jah tenho uma thread por estar extendendo uma
public class MinhaThread extends Thread {

	// so para ter alguma coisa
	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		this.start();
	}

	// aki vai fazer o que a gente tem que fazer
	// o run eh chamado pelo start()
	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contador " + i);
				//Esse metodo faz dormir por algum tempo, logo ele imprime 1 segundo cada vez
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nome + " terminou a execucao");

	}

}
