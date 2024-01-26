/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q4;

/**
 *
 * @author mhmdd
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedList<String> dlistl = new DoublyLinkedList<>();
        dlistl.addLast("wedges");
        dlistl.addLast("chips");
        dlistl.addLast("french fries");
        dlistl.addLast("mashed potatoes");
        System.out.println(dlistl.toString());
        
    }
    
}
