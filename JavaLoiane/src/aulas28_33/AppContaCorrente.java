package aulas28_33;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class AppContaCorrente {

	public static void main(String[] args) {
		
		int number = 123456789;
		double limit = 50000;
		ContaCorrente cc = new ContaCorrente(number, limit);
		
		
		System.out.println("Balance: "+ cc.getbalance() + 
							"\nisSpecial: " + cc.isSpecial() + "\n----");
		
		cc.depositarDinheiro(50);
		
		System.out.println("Balance: "+ cc.getbalance() + 
				"\nisSpecial: " + cc.isSpecial() + "\n----");
		
		cc.sacarDinheiro(30);
		
		System.out.println("Balance: "+ cc.getbalance() + 
				"\nisSpecial: " + cc.isSpecial() + "\n----");
		
		cc.sacarDinheiro(50);
		
		System.out.println("Balance: "+ cc.getbalance() + 
				"\nisSpecial: " + cc.isSpecial() + "\n----");
		
		cc.depositarDinheiro(100);
		
		System.out.println("Balance: "+ cc.getbalance() + 
				"\nisSpecial: " + cc.isSpecial() + "\n----");

	}

}
