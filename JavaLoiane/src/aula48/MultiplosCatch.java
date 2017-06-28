package aula48;

public class MultiplosCatch {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};
		
		for(int i=0; i<numeros.length; i++) {
			try{
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}
			catch(ArithmeticException e1){
				System.out.println("Erro ao dividir por zero");
				//Pegadinh, oq sai no final?
				//System.exit(0);
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				//System.out.println("Erro ao tentar acessar posicao invalida");
				//System.exit(0);
				//melhor forma de printar o erro:
				System.out.println(e2.getMessage());
				e2.printStackTrace();
			}
			finally {
				System.out.println("Essa linha é impressa sempre após o try ou catch");
			}
			
		}
	}

}
