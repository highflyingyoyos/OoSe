package Uebungsblatt05;

import java.util.ArrayList;

public class Main {

	public Main() {
		aufgabe1();
		aufgabe2();
		aufgabe3();
	}

	public static void main(String[] args) {
		Main main = new Main();
	}

	public void aufgabe1() {
		System.out.println("----------------------- Aufgabe 1 -----------------------");
		Angestellter peter = new Angestellter("Peter", "Johanns", 69, 300);
		Praktikant claude = new Praktikant("Claude", "Jordan", 8000);

		System.out.println("Gehalt Peter: " + peter.getGehalt());
		System.out.println("Gehalt Claude: " + claude.getGehalt());

		peter.raise(2);
		claude.raise(2);

		System.out.println("Gehalt Peter: " + peter.getGehalt());
		System.out.println("Gehalt Claude: " + claude.getGehalt());
		System.out.println("---------------------------------------------------------");
	}

	public void aufgabe2() {
		System.out.println("----------------------- Aufgabe 2 -----------------------");

		Kugel bigD = new Kugel(0, 0, 0, 5000);
		bigD.print(bigD.getKind(), bigD.calcVolume());
		bigD.move(-1, 3, 69);
		bigD.print(bigD.getKind(), bigD.calcVolume());

		Quader jonasKopf = new Quader(-500, 1000, 3, 20, 30, 40);

		ArrayList<Koerper> list = new ArrayList<Koerper>();
		list.add(bigD);
		list.add(jonasKopf);

		for (int i = 0; i < list.size(); i++) {
			list.get(i).print(list.get(i).getKind(), list.get(i).calcVolume());
		}

		System.out.println("---------------------------------------------------------");

	}

	public void aufgabe3() {
		System.out.println("----------------------- Aufgabe 3 -----------------------");
		double[] arr = { 9, 6, 7, 10, 5 };
		printArr(arr);
		arr = sortArr(arr);
		printArr(arr);
		System.out.println("---------------------------------------------------------");
	}

	public double[] sortArr(double[] pArr) {
		double tmp;
		for (int i = 0; i < pArr.length; i++) {
			for (int j = i + 1; j < pArr.length; j++) {
				if (pArr[j] < pArr[i]) {
					tmp = pArr[j];
					pArr[j] = pArr[i];
					pArr[i] = tmp;
				}
			}
		}
		return pArr;
	}

	public void printArr(double[] pArr) {
		System.out.print("[");
		for (int i = 0; i < pArr.length; i++) {
			System.out.print(pArr[i] + ",");
		}
		System.out.print("]\n");
	}
}
