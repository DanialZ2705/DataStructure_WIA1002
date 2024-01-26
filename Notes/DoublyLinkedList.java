/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprep;

/**
 *
 * @author mhmdd
 */
public class DoublyLinkedList<T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;
    int size;
    
    public DoublyLinkedList(){
        this.size = 10;
        head = null;
        tail = null;
    }
    
    public DoublyLinkedList(int size){
        this.size = size;
        head = null;
        tail = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void insertFront(T data){
        Node<T> newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
            size++;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
        }
    }
    
    public void insertEnd(T data){
        Node<T> newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
            size++;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public T deleteFront(){
        T temp = head.data;
        if(size == 1){
            head = tail = null;
        }
            head = head.next;
            head.prev = null;
            size--;
            return temp;
        }
    
    public boolean contains(T data){
        Node<T> current = head;
        while(current != null){
            if(data.equals(current.data)){
                return true;
            }else{
                current = current.next;
            }
        }
        System.out.println("Not found");
        return false;
    }
    
    public void clear(){
        head = tail = null;
        size = 0;
        System.out.println("The list is cleared");
    }
    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while(current != null){
            sb.append(current.data).append(" > ");
            current = current.next;
        }
        return sb.toString();
    }
}
