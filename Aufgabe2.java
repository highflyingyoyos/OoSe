package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Aufgabe2 {
    public static void main(String[] args) throws IOException, InterruptedException{
        File testFile = new File("C:\\Users\\johan\\Google Drive\\UNI\\OOSE19\\Uebung7\\test.txt");
        Thread t1 = new Thread(new DateiBeobachter(testFile));
        Thread t2 = new Thread(new PrintTimer(testFile));
        t1.start();
        t2.start();
        Thread.sleep(10000);
        FileWriter fw = new FileWriter("C:\\Users\\johan\\Google Drive\\UNI\\OOSE19\\Uebung7");
        fw.write("file change");
        fw.close();

    }
}
