/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author kvin
 */
public class Stack<T> {

    /**
     * @param args the command line arguments
     */
    private static int MAX_SIZE = 10;
    private Element<T> top;
    private int size = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        
      
        
        Stack st = new Stack();
        st.push(40);
        st.push(30);
        
        int poppedElement = (int) st.pop();
        System.out.println(poppedElement);
        
        
        
    }

    public void push(T data) {

        if (size == MAX_SIZE) {

        } else {
            Element elem = new Element(data, top);
            top = elem;
            size++;
        }

    }

    public T pop() {

        T data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }
    
    public T peek(){
    
    return top.getData();
    
    }

}
