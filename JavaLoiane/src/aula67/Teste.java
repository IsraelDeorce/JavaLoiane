package aula67;

public class Teste {

	public static void main(String[] args) {
		MinhaThread thread = new MinhaThread("Thread #1", 600);
		//o start chama o run da thread. Colocamos ele no construtor
		//thread.start();
		
		MinhaThread thread2 = new MinhaThread("Thread #2", 1000);	
	}

}
