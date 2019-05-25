package Uebungsblatt05;

public class Angestellter {

	String vorname;
	String nachname;
	int alter;
	int gehalt;

	public Angestellter(String pVorname, String pNachname, int pAlter, int pGehalt) {
		vorname = pVorname;
		nachname = pNachname;
		alter = pAlter;
		gehalt = pGehalt;
	}

	public void aging() {
		alter++;
	}

	public void raise(int pX) {
		gehalt += pX;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public int getAlter() {
		return alter;
	}

	public int getGehalt() {
		return gehalt;
	}

}
