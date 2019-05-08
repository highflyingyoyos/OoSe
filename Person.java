package Uebungsblatt04;

public class Person implements Comparable<Person> {

	private String name;
	private String vorname;
	private int plz;
	private String straße;
	private int hausnummer;

	public Person(String pName, String pVorname, int pPLZ, String pStraße, int pHausnummer) {
		name = pName;
		vorname = pVorname;
		plz = pPLZ;
		straße = pStraße;
		hausnummer = pHausnummer;
	}
	
	/**
	 * Ausgabe = 0  bei Gleichheit
	 * Ausgabe < 0 wenn this kleiner
	 * Ausgabe > 0 wenn pToCompare kleiner
	 */

	public int compareTo(Person pToCompare) {
		
		if(!(name.equals(pToCompare.getName()))) {
			return strCmp(name, pToCompare.getName(), 5);			
		}
		else if(!(vorname.equals(pToCompare.getVorname()))) {
			return strCmp(vorname, pToCompare.getVorname(), 4);
		}
		else if(plz != pToCompare.getPLZ()) {
			if(plz < pToCompare.getPLZ()) return -3;
			else return 3;
		}
		
		else if(!(vorname.equals(pToCompare.getVorname()))) {
			return strCmp(straße, pToCompare.getStraße(), 2);
		}
		else if(hausnummer != pToCompare.getHausnummer()) {
			if(hausnummer < pToCompare.getHausnummer()) return -1;
			else return 1;
		}
		return 0; 
		
	}
	
	public int strCmp(String pS1, String pS2, int pValue) {
			String kl = pS2;   
			if(kl.length() > pS1.length()) kl = pS1;
			
			for(int i = 0; i < kl.length(); i++) {
				int cmp = Character.compare(pS1.charAt(i), pS2.charAt(i));
				if(cmp != 0) return cmp;
			}
			
			if(pS1.length() != pS2.length()) {
				if(pS1.equals(kl)) return -pValue;
				else return pValue;
			}
			return 0;
		}
	
	
	public void print() {
		System.out.println(name + ", " + vorname + ", " + straße + ", " + hausnummer + ", " + plz);
	}

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public int getPLZ() {
		return plz;
	}

	public String getStraße() {
		return straße;
	}

	public int getHausnummer() {
		return hausnummer;
	}
}
