package aulas28_33;

public class ContaCorrente {
	
	private int number;
	private double balance;
	private boolean isSpecial;
	private double limit;
	
	public ContaCorrente(int number, double limit) {
		setNumber(number);
		setLimit(limit);	
		balance = 0;
	}
	
	//-------------------------------------------------------------------

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getbalance() {
		return balance;
	}

	public boolean isSpecial() {
		return isSpecial;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	//------------------------------------------------------------------
	
	public boolean depositarDinheiro(double dinheiro){		
		if(dinheiro <= 0) return false;
		else if(isSpecial) isSpecial = false;
		balance = balance + dinheiro;
		return true;
	}
	
	public boolean sacarDinheiro(double dinheiro){
		balance = balance - dinheiro;
		if(balance <= 0) isSpecial = true;
		return true;
	}

	@Override
	public String toString() {
		return "ContaCorrente [number=" + number + ", balance=" + balance + ", isSpecial=" + isSpecial + ", limit="
				+ limit + "]";
	}
}
