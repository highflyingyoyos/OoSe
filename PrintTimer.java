package com.company;

import java.io.File;

public class PrintTimer implements Runnable {
    private File toPrint;
    public void run(){
        while(true){
            System.out.println(toPrint.getPath());
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public PrintTimer(File toPrint){
        this.toPrint = toPrint;
    }
}
