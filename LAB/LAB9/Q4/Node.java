/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q4;

/**
 *
 * @author mhmdd
 */
public class Node<T> {
    T item;
    Node<T> prev;
    Node<T> next;
    
    Node(T data) {
            this.item = data;
            this.next = null;
            this.prev = null;
        }
    
}
