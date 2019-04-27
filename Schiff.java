
public class Schiff {
	
	private String name;
	private String id;
	private double length;
	
	public Schiff(String pName, double pLength) {
		name = pName;
		length = pLength;
	}
	
	public void receiveMSG(String pMSG) {
		System.out.println("Empfangen von " + name + "/" + id + ": "+ pMSG);
	}
	
	public void setID(String pID) {
		id = pID;
	}
	
}
