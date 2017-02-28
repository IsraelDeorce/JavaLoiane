package aulas28_33;

public class Lampada {
	
	private boolean isLigada;
	
	public Lampada() {
		isLigada = false;	
	}
	
	public void ligarLampada() {
		isLigada = true;
	}
	
	public void desligarLampada() {
		isLigada = false;
	}

	@Override
	public String toString() {
		return "Lampada [isLigada=" + isLigada + "]";
	}

}