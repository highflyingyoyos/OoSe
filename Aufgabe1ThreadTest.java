package com.company;

public class Aufgabe1ThreadTest {

    public static void main(String[] args) {
	// write your code here
        Thread t1 = new Thread(new DateCommand());
        t1.start();
        Thread t2 = new Thread(new CounterCommand());
        t2.start();
    }
}

/*a)
1. Möglichkeit: Klasse erstellen, die Interface Runnable implementiert, darin die Methode void run()
implementieren, und Instanz dieser Klasse dem Kunstruktor von Thread übergeben

2. Möglichkeit: Klasse erstellen, die Thread erweitert und darin die run Methode überschreiben,
dann Thread über start() starten

Vorteil 1: Klassen, die Runnable implementieren können im Gegensatz zu zweiten Möglichkeit von keiner anderen
Klasse direkt erben, sind außerdem flexibler, man kann Instanzen davon erzeugen, die sogar aus Thread-Pool heraus
aufgerufen werden können

Vorteil 2: hier ist nicht die Instanziierung und Übergabe einer zusätzlichen Klasse erforderlich, spart Laufzeit
 */

/*c)
Die Threads werden parallel ausgeführt, die Laufzeit der run() Methoden ist unterschiedlich,
außerdem wird die Laufzeit durch die zufällige Pausierung zusätzlich verändert.
 */