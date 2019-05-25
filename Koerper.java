package Uebungsblatt05;

public abstract class Koerper {

	private int[] p = new int[3];
		
	public Koerper(int pX, int pY, int pZ) {
		p[0] = pX;
		p[1] = pY;
		p[2] = pZ;
	}	
	
	abstract void calcVolume();
	abstract void scale(double pA);
	abstract String getKind();
	abstract double getVolume();
	abstract void print();
	
	
	public void move(int pX, int pY, int pZ) {
		p[0] += pX;
		p[1] += pY;
		p[2] += pZ;
	}
	
		
	public int[] getP() {
		return p;
	}
	
	
	
	
	
}
