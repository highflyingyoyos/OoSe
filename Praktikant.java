package Uebungsblatt05;

public class Praktikant extends Angestellter{

	private final int gehalt;
	
	public Praktikant(String pVorname, String pNachname, int pAlter) {
		super(pVorname, pNachname, pAlter, 400);
		gehalt = super.gehalt;
	}

	public int getGehalt() {
		return gehalt;
	}
}
