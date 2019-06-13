package com.company;

public class CounterCommand implements Runnable {
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println(i);
            try{
                Thread.sleep(new java.util.Random().nextInt(1000));
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
