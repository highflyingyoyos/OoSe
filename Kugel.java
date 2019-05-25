package Uebungsblatt05;

public class Kugel extends Koerper {

	private String kind = "Kugel";
	private double volume = 1.0;

	public Kugel(int pX, int pY, int pZ) {
		super(pX, pY, pZ);

	}

	public void calcVolume() {

	}

	public void scale(double pA) {
		volume *= pA;
	}

	public double getVolume() {
		return volume;
	}

	public String getKind() {
		return kind;
	}

	public void print() {
		System.out.println("Art: " + kind + ", Volume: " + volume + ", Position: (" + getP()[0] + ";" + getP()[1] + ";"
				+ getP()[2] + ")");
	}
}
