/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q4;

/**
 *
 * @author mhmdd
 */
public class DoublyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int maxsize;
    
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.maxsize = 0;
    }
    
    public boolean isEmpty(){
        return maxsize == 0;
    }
    
    public int getSize(){
        return maxsize;
    }
    
    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } maxsize++;
    }
    
    public void addLast(T data){
        Node<T> newNode = new Node<>(data);
        if(isEmpty()){
            System.out.println("It is empty, adding first");
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }System.out.println("Successfully added " + newNode.item);
        maxsize++;
    }
    
    public T removeFirst(){
        T temp = head.item;
        if(maxsize == 1){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        maxsize--;
        return temp;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[size=").append(getSize()).append("]");
        
        Node<T> current = head;
        while(current != null){
            sb.append(" >> ").append(current.item);
            current = current.next;
        }
        
        sb.append("\n");
        
        Node<T> reverse = tail;
        while(reverse != null){
            sb.append(" << ").append(reverse.item);
            reverse = reverse.prev;
        }
        return sb.toString();
    }
    
    
    public boolean contains(T data){
        Node<T> current = head;
        while(current != null){
            if(data.equals(current.item)){
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
        maxsize = 0;
        System.out.println("The list is cleared");
    }
}
