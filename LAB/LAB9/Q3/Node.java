/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q3;

/**
 *
 * @author mhmdd
 */
public class Node<T extends Comparable<T>> implements Comparable{
    T data;
    Node<T> next;
    
    public Node(T data){
        this.data = data;
        this.next = null;
    }
    
    public T getData(){
        return data;
    }
    
    public int compareTo(Object otherObject) {
        if(!(otherObject instanceof Node)){
            System.out.println("Invalid Comparison");
        }
        
        Node<T> otherNode = (Node<T>) otherObject;
        return this.data.compareTo(otherNode.data);
    }
    
}
