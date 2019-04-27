package com.company;

public class Operatoren {
    public static void main(String [] args){
        int a=15;
        int b=34;
        int c=1;
        System.out.println("1: "+ (a==b)); //false weil a =/= b
        System.out.println("2: "+ (a==b-19)); //true weil a = 15 und b-19 = 15, == bindet schwächer
        System.out.println("3: "+ (a^b)); //45 bitweise xor 001111 xor 100010 = 101101
        System.out.println("4: "+ (a++^b)); //a zuerst in therm zurückgegeben, dann erhöht
        System.out.println("5: "+ (7<<++c)); // zuerst c inkrementiert, deshalb 7 << 2 , zweifacher bit shift
        System.out.println("6: "+ (a=b=c=0x10)); //0x10 ist hexdezimal code 1*16 + 0*1
        System.out.println("7: "+ (1e1)); // 1 * 10**1 = 10 andere schreibeweise für double
    }
}
