package Uebungsblatt05;

public class Quader extends Koerper {

	private String kind = "Quader";
	private double volume = 1.0;

	public Quader(int pX, int pY, int pZ) {
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