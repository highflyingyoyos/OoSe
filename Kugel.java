package Uebungsblatt05;

public class Kugel extends Koerper {

	private String kind = "Kugel";
	private double radius;

	public Kugel(int pX, int pY, int pZ, double pRadius) {
		super(pX, pY, pZ);
		radius = pRadius;

	}

	public double calcVolume() {
		return 4 / 3 * Math.PI * Math.pow(radius, 3);
	}

	public void scale(double pA) {
		radius *= pA;
	}

	public String getKind() {
		return kind;
	}

}
