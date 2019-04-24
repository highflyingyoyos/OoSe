package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Eingabe: ");
        int k = sc.nextInt(); // liest eine Ganzzahl (int) ein
        System.out.println(++k); // Ausgabe a) eingabe um eins erhöht, dann zurückgegeben
        System.out.println(k); // Ausgabe b) ausgabe von inkrementiertem k
        System.out.println(k++); // Ausgabe c) ausgabe von k, dann inkrementieren
        int k2 = 5;
        double result = k2 / 2; // Stelle 1 es müsste hier stattdessen (double) k2 / 2
        System.out.println("5 / 2 = " + result); // Ausgabe d) k2 ist und wird durch zwei geteilt und trunkated, dann zu double
        boolean b = false;
        if(b = false) {
            System.out.println("b ist falsch."); // Ausgabe e)
        } else {
            System.out.println("b ist wahr."); // Ausgabe f) weil b = false den boolschen wert false hat, wird der else teil ausgeführt
        }
        // b ? System.out.println("b ist wahr") : System.out.println("b ist falsch");
        if(b) System.out.println("b ist wahr"); else System.out.println("b ist falsch");
    }
}
