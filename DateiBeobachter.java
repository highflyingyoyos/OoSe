package com.company;

import java.io.IOException;

public class DateiBeobachter implements Runnable {
    private java.io.File fileWatch ;

    public void run(){
        long last_modified = fileWatch.lastModified();
        long last_modified_tmp;
        while(true){
            last_modified_tmp = fileWatch.lastModified();
            if(last_modified_tmp != last_modified){
                System.out.println("The file was changed");
                last_modified = last_modified_tmp;
            }
        }
    }
    public DateiBeobachter(String input_file_path){
        fileWatch = new java.io.File(input_file_path);

    }
    public DateiBeobachter(java.io.File input_file){
        fileWatch = input_file;
    }
}
