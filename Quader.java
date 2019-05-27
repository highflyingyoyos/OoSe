package Uebungsblatt05;

public class Quader extends Koerper {

	private String kind = "Quader";
	private double length;
	private double width;
	private double height;

	public Quader(int pX, int pY, int pZ, double pLength, double pWidth, double pHeight) {
		super(pX, pY, pZ);
		length = pLength;
		width = pWidth;
		height = pHeight;

	}

	public double calcVolume() {
		return length * width * height;
	}

	public void scale(double pA) {
		length *= pA;
		width *= pA;
		height *= pA;
	}

	public String getKind() {
		return kind;
	}

}