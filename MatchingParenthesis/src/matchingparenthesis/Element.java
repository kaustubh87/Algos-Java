/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchingparenthesis;

/**
 *
 * @author kvin
 */
public class Element<T>{
    
    private T data;
    private Element next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Element{" + "data=" + data + '}';
    }
    
    public Element(T data, Element next){
        this.data = data;
        this.next = next;
    }
    
   
    
}
