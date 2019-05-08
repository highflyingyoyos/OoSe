package Uebungsblatt04;

public class Uebungsblatt04_main {
	
	public static void main(String[] args) {
		Uebungsblatt04_main blatt = new Uebungsblatt04_main();
	}

	public Uebungsblatt04_main() {
		System.out.println("------------------ Aufgabe 1 ------------------");
		aufgabe01();
		System.out.println("-----------------------------------------------");
		System.out.println("------------------ Aufgabe 2 ------------------");
		aufgabe02();
		System.out.println("-----------------------------------------------");
		System.out.println("------------------ Aufgabe 3 ------------------");
		aufgabe03();
		System.out.println("-----------------------------------------------");	
	}

	public void aufgabe01() {
		Auto auto1 = new Lastwagen();
		System.out.println(auto1.reifen); // 4 weil reifen von Auto
		System.out.println(((Lastwagen) auto1).reifen); // 8 weil reifen von LKW
		System.out.println(auto1.getReifen()); // 8  (getReifen() in beiden), 4 (getReifen() nur in Auto), Compilerfehler, da getReifen() für Auto nicht definiert
		System.out.println(((Lastwagen) auto1).getReifen()); // 8  (getReifen() in beiden), 4 (getReifen() nur in Auto), 8 (getReifen() nur in LKW)
	
	
	}
	
	public void aufgabe02() {
		
		Student student = new Student();
		
		Cauliflower essen1 = new Cauliflower();
		student.eat(essen1); //i mog ken Blühmenköhl, da Parameter vom Typ Cauliflower

		
		Spaghetti essen2 = new Spaghetti();
		student.eat(essen2);//i mog Spogehtti, da Parameter vom Typ Spagehtti und der speziellere Typ Spaghetti nicht gesondert behandelt wird
		
		Food essen = new Cauliflower();
		student.eat(essen);//i mog Blühmenköhl, da Parameter vom Typ Food

	}
	
	public void aufgabe03() {
		Person[] arr1 = new Person[6];
		
		arr1[0] = new Person("Alpha", "Pedda", 769234, "Johannstraße", 69);
		arr1[1] = new Person("Alpha", "Flak", 769234, "Johannstraße", 69);
		arr1[2] = new Person("Gamma", "Pedda", 769234, "Johannstraße", 69);
		arr1[3] = new Person("Alpha", "Pedda", 769233, "Johannstraße", 69);
		arr1[4] = new Person("Alpha", "Pedda", 769234, "Johannastraße", 69);
		arr1[5] = new Person("Alpha", "Pedda", 769234, "Johannstraße", 68);
		
		System.out.print("Minimum Personen Array: ");
		Person min = (Person) findMin(arr1);
		min.print();
		
		Integer[] arr2 = new Integer[5];
		
		arr2[0] = 5;
		arr2[1] = 4;
		arr2[2] = 78;
		arr2[3] = 7;
		arr2[4] = 2;
		
		int mini = (int) findMin(arr2);
		System.out.println("Minimum int Array: " + mini);
	
	}
	
	public static Comparable findMin(Comparable[] pToSearch) {
		Comparable min = pToSearch[0];
		for(int i = 1; i < pToSearch.length;i++) {
			if(pToSearch[i].compareTo(min) < 0) min = pToSearch[i];
		}
		return min;
	}

}
