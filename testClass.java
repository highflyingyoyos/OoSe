package com.company;

public class testClass {

    public static void main(String[] args) {
	    DoubleList testList = new DoubleList();
	    testList.add(1);
	    testList.add(2);
	    testList.add(3);
	    System.out.println(testList.toString());
	    testList.insertFirst(4);
	    testList.insertFirst(5);
        System.out.println(testList.toString());
        testList.remove(2);
        testList.remove(0);
        testList.remove(2);
        System.out.println(testList.toString());
        System.out.println(testList.get(0));

    }
}
