import java.math.*;

public class Uebungsblatt_02 {

	public static void main(String[] args) {
		Uebungsblatt_02 test = new Uebungsblatt_02();
		
	}
	
	public Uebungsblatt_02() {
		//Aufgabe 1 a) Testaufrufe
				System.out.println("----------------- Aufgabe 1 a) -----------------");
				System.out.println("1! = " + fac(1));
				System.out.println("2! = " + fac(2));
				System.out.println("9! = " + fac(9));
				System.out.println("------------------------------------------------");
				
				//Aufgabe 1 b) Testaufrufe
				System.out.println("----------------- Aufgabe 1 b) -----------------");
				System.out.println("-1 über 3 : + " + binom(-1, 3));                    //-1 als Fehlermeldung, da nicht definiert
				System.out.println("0 über 3 : + " + binom(0, 3));
				System.out.println("2 über 1 : + " + binom(2, 1));
				System.out.println("9 über 3 : + " + binom(9, 3));
				System.out.println("------------------------------------------------");
				
				//Aufgabe 1 c) Testaufrufe
				System.out.println("----------------- Aufgabe 1 c) -----------------");
				System.out.println("n = -1, k = 3  : " + modLotto(-1, 3));	            //-1 als Fehlermeldung, da nicht definiert
				System.out.println("n = 0, k = 3  : " + modLotto(0, 3));
				System.out.println("n = 2, k = 1  : " + modLotto(2, 1));
				System.out.println("n = 9, k = 3  : " + modLotto(9, 3));
				System.out.println("------------------------------------------------");
				
				//Aufgabe 2 Testaufrufe
				System.out.println("----------------- Aufgabe 2 --------------------");
				System.out.println("6.5f == 6.5 ? " + cmpFD(6.5f, 6.5));
				System.out.println("6.5f == 6.4 ? " + cmpFD(6.5f, 6.4));
				System.out.println("6.4f == 6.4 ? " + cmpFD(6.5f, 6.5));
				System.out.println("------------------------------------------------");
				
				//Aufgabe 3 Testaufrufe
				System.out.println("----------------- Aufgabe 3 --------------------");
				System.out.println("a = -1, b = 5 : " + euklid(-1, 5));
				System.out.println("a = 3, b = 9 : " + euklid(3, 9));
				System.out.println("a = 7, b = 13 : " + euklid(7, 13));
				System.out.println("------------------------------------------------");
				
				//Aufgabe 4 Testaufrufe
				System.out.println("----------------- Aufgabe 4 --------------------");
				testA4();
				System.out.println("------------------------------------------------");
	}

	public long fac(long pN) {
		if(pN <= 1) return 1;
		return pN * fac(pN - 1);
	}
	
	public long binom(long pN, long pK) {
		if(pN < 0 || pK < 0) return -1;			//nicht für negative Zahlen definiert, daher -1 als Fehlermeldung
		if(pN < pK) return 0;
		return fac(pN) / (fac(pK) * fac(pN - pK));
	}
	
	public long modLotto(long pN, long pK) {
		if(binom(pN, pK) == -1) return -1;		//Abfangen der Fehlermeldung von binom()
		return binom(pN, pK) * fac(pK);
		
	}
	
	/**
	 * Nicht jede Zahl ist binär als Gleitkommazahl exakt darstellbar (zB 6,4)
	 * da der Datentyp double aber mehr Bits umfasst, als float, kann er sich der exakten 
	 * Zahl mehr annähern und diese somit genauer darstellen.
	 * 
	 * Deshalb ist ein Vergleich dieser beiden Datentypen nur möglich, wenn entsprechend 
	 * einer gewissen Toleranz gerundet wird.
	 * 
	 * Da diese Rundung in der Klasse java.math.BigDecimal bereits implementiert ist,
	 * kann man diese wie folgt für einen Vergleich nutzen.
	 */
	public boolean cmpFD(float pF, double pD) {
		BigDecimal f = new BigDecimal("" + pF);
		BigDecimal d = new BigDecimal("" + pD);
		
		if(f.compareTo(d) == 0) return true;
		else return false;
	}
	
	public int euklid(int pA, int pB) {
		if(pA < 0 || pB < 0) return -1;		//-1 als Fehlermeldung, da nicht definiert
		
		if(pA == 0) return pB;
		
		while(pB != 0) {
			if(pA > pB) pA = pA - pB;
			else pB = pB - pA;			
		}
		return pA;		
	}
	
	public void testA4() {
		Schifffahrtsamt amt = new Schifffahrtsamt();
		Werft w1 = new Werft();
		w1.produce("Gertrut", 12.5, amt);
		Schiff sc1=new Schiff("Merlin", 45.9);
		amt.add(sc1);
		sc1.setID(amt.getKennzeichen());
		amt.meldung("Havarie im Rhein bei Rheinkilometer 591.", 1);
		//Ausgabe Empfangen von Gertrut/IHVMXW: Havarie im Rhein bei Rheinkilometer 591.
		//Empfangen von Merlin/VPBJQW: Havarie im Rhein bei Rheinkilometer 591.
		amt.meldung("Sonnenschein bei Rheinkilometer 650", 0);
		
	}
}
