package com.company;

public class DoubleNode {
    private double value;
    private DoubleNode next;

    public DoubleNode(){
        next = null;
    }
    public DoubleNode(double value){
        next = null;
        this.value = value;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getNext(){
        return next;
    }

    public void setValue(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

