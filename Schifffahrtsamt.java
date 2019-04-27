
public class Schifffahrtsamt {

	private Schiff[] schiffe;
	
	public Schifffahrtsamt() {
		schiffe = new Schiff[50];
	}
	
	public int add(Schiff pSchiff) {
		for(int i = 0; i < schiffe.length;i++) {
			if(schiffe[i] == null) {
				schiffe[i] = pSchiff; 
				return 1;
			}			
		}
		return -1;
	}
	
	public void meldung(String pMSG, int pUrgency) {
		if(pUrgency == 1) {
			for(int i = 0; i < schiffe.length; i++) {
				if(schiffe[i] != null) {
					schiffe[i].receiveMSG(pMSG);
				}
			}
		}		
	}
	
	public String getKennzeichen() {
		java.util.Random rnd = new java.util.Random();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 6; i++) {
			sb.append((char)((rnd.nextInt(25)+65)));
		}
		
		return sb.toString();
	}

}
