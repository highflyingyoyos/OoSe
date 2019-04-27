
public class Werft {

	public Werft() {
		
	}
	
	public Schiff produce(String pName, double pLength, Schifffahrtsamt pAmt) {
		Schiff schiff = new Schiff(pName, pLength);
		pAmt.add(schiff);
		schiff.setID(pAmt.getKennzeichen());
		return schiff;
	}

}
