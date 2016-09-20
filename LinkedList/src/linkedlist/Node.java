/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.io.Console;

/**
 *
 * @author kvin
 */
public class Node {

    private static void printList(Node node) {
      
        while(node!=null)
        {
            System.out.println(node.Value);
            node = node.getNext();
            
        
        }
    }

    public int Value;
    public Node next;

    private Node(int i) {
        this.Value = i;
        this.next = null;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int Value) {
        this.Value = Value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    public void addFirst(Node node){
        
       this.next = next;
       
       
       
    
    
    }

    public static void main(String[] args) {

        Node first = new Node(5);
        Node middle = new Node(7);
        first.setNext(middle);
        Node last = new Node(11);
        middle.setNext((last));
        
        printList(first);

    }

}
