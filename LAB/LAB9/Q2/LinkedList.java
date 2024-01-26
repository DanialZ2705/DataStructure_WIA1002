/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2;

public class LinkedList<T extends Comparable<T>> {
    Node<T> head;

    public LinkedList(){    
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public int getSize(){
        int count = 0;
        Node<T> current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    
    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
        }else{
            Node<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public Object removeFirst(){
        if(!isEmpty()){
            Node<T> temp = head;
            head = head.next;
            return temp;
        }
        return null;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        sb.append("[size=").append(getSize()).append("]");
        while(current != null){
            sb.append(" >> ").append(current.data);
            current = current.next;
        }
        return sb.toString();
    }
    
    public boolean contains(T item){
        Node<T> current = head;
        while(current != null){
            if(current.data.equals(item)){
            return true;
        }else{
                current = current.next;
            }
        }
        return false;
    }

    public LinkedList<T> combine(LinkedList<T> list1, LinkedList<T> list2) {
        Node<T> currentNode1 = list1.head;
        Node<T> currentNode2 = list2.head;
        LinkedList<T> list3 = new LinkedList<>();

        while (currentNode1 != null && currentNode2 != null) {

            if (currentNode1.compareTo(currentNode2.data) < 0) {
                list3.addLast(currentNode1.data);
                currentNode1 = currentNode1.next;

            } else {
                list3.addLast(currentNode2.data);
                currentNode2 = currentNode2.next;

            }
        }
        
        while (currentNode1 != null) {
            list3.addLast(currentNode1.data);
            currentNode1 = currentNode1.next;
        }

        while (currentNode2 != null) {
            list3.addLast(currentNode2.data);
            currentNode2 = currentNode2.next;
        }
        return list3;
    }
    
}
