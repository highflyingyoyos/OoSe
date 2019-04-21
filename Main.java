package com.company;

public class Main {

    public static void main(String[] args) {
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);

	switch(c){
		case 0:
			System.out.println(a+b);
			break;
		case 1:
			System.out.println(a-b);
			break;
		case 2:
			System.out.println(a*b);
			break;
		case 3:
			System.out.println(a/b);
			break;
		default:
			System.out.println("Der dritte Operator ist leider unbekannt!");
	}
    }
}
