/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2;

/**
 *
 * @author mhmdd
 */
public class Node<T extends Comparable<T>> implements Comparable<T>{
    T data;
    Node<T> next;
    
    public Node(T data){
        this.data = data;
        this.next = null;
    }
    
    public T getData(){
        return data;
    }
    
    public int compareTo(T otherObject) {
        return this.data.compareTo(otherObject);
    }
}
