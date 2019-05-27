package Uebungsblatt05;

public abstract class Koerper {

	private int[] p = new int[3];
		
	public Koerper(int pX, int pY, int pZ) {
		p[0] = pX;
		p[1] = pY;
		p[2] = pZ;
	}	
	
	abstract double calcVolume();
	abstract void scale(double pA);
	abstract String getKind();
	
	
	
	
	public void move(int pX, int pY, int pZ) {
		p[0] += pX;
		p[1] += pY;
		p[2] += pZ;
	}
	
		
	public int[] getP() {
		return p;
	}
	
	public void print(String pKind, double pVolume) {
		System.out.println("Art: " + pKind + ", Volume: " + pVolume + ", Position: (" + p[0] + ";" + p[1] + ";"
				+ p[2] + ")");
	}
	
	
	
	
}
