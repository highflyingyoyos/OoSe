package com.company;

public class DoubleList {
    private DoubleNode head = null;

    public void add(double d){
        DoubleNode pNode = new DoubleNode(d);
        if(head == null)
            head = pNode;
        else{
            DoubleNode current = head;
            while(current.getNext() != null)
                current = current.getNext();
            current.setNext(pNode);
        }
    }

    public void insertFirst(double d){
        DoubleNode pNode = new DoubleNode(d);
        if(head == null)
            head = pNode;
        else{
            pNode.setNext(head);
            head = pNode;
        }
    }

    public double get(int i){
        //i wird wie bei array von 0 an gezählt
        if(i < 0){
            System.out.println("Der Index i ist negativ und ungültig! 0 zurückgegeben");
            return 0;
        }
        DoubleNode current = head;
        for(int j = 0; j < i; j++){
            if(current.getNext() == null){
                System.out.println("Der index i überschreitet die Liste! 0 zurückgegeben");
                return 0;
            }
            current = current.getNext();
        }
        return current.getValue();
    }

    public String toString(){
        StringBuilder retString = new StringBuilder();
        if(head == null)
            return retString.toString();
        else{
            DoubleNode current = head;
            retString.append(current.getValue());
            while(current.getNext() != null){
                current = current.getNext();
                retString.append(";");
                retString.append(current.getValue());
            }
            return retString.toString();
        }
    }

    public void remove(int i){
        if( i < 0)
            System.out.println("Fehler, Index ist negativ!");
        else{
            if(i == 0)
                head = head.getNext();
            else{
                DoubleNode current = head;
                DoubleNode prev = null;
                for(int j = 1; j <= i; j++){
                    prev = current;
                    current = current.getNext();
                    if(current == null){
                        System.out.println("Fehler Index ist zu groß!");
                        return;
                    }
                }
                prev.setNext(current.getNext());
            }
        }
    }
}
