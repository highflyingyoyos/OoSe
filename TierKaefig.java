package Uebungsblatt08;

public class TierKaefig<E> {

	private E insasse;
	
	public TierKaefig() {
		
	}
	
	public void setInsasse(E x) {
		insasse = x;
	}
	
	public E getInsasse() {
		return insasse;
	}

}
