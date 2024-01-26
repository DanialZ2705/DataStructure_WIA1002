/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q1;

/**
 *
 * @author mhmdd
 * @param <T>
 */

public class Node<T extends Comparable<T>> implements Comparable{
    
    private T data;
    private Node nextNode;
    
    Node(T data){
        this.data = data;
    }
    
        //setters and getters
    public T getData(){
        return data;
    }
    
    public Node getNextNode(){
        return nextNode;
    }
    
    public void setData(T data){
        this.data = data;
    }
    
    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
    
    @Override
    public String toString(){
        return "Data: " + this.data;
    }
    
    @Override
    public int compareTo(Object o) {
        if(o == null || getClass() != o.getClass()){
        throw new IllegalArgumentException("Invalid Comparison");
        }
        Node<T> otherNode = (Node<T>) o;
        
        return this.data.compareTo(otherNode.getData());
    }
    
}
