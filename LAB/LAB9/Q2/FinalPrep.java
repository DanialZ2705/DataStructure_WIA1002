/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q2;

/**
 *
 * @author mhmdd
 */
import java.util.PriorityQueue;

public class FinalPrep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();

        // Add elements to the LinkedList
        myList.addLast(3);
        myList.addLast(1);
        myList.addLast(4);

        // Display the original LinkedList
        System.out.println("Original LinkedList: " + myList);

        // Check if the LinkedList is empty
        System.out.println("Is the LinkedList empty? " + myList.isEmpty());

        // Get the size of the LinkedList
        System.out.println("Size of the LinkedList: " + myList.getSize());

        // Create another LinkedList
        LinkedList<Integer> anotherList = new LinkedList<>();
        anotherList.addLast(2);
        anotherList.addLast(5);

        // Display the second LinkedList
        System.out.println("Second LinkedList: " + anotherList);

        // Add elements to the LinkedList using addFirst and addLast
        myList.addFirst(6);
        myList.addLast(8);
        
        myList.combine(myList, anotherList).toString();
        
        // Display the modified LinkedList
        System.out.println("Modified LinkedList: " + myList);

        // Remove the first element from the LinkedList
        myList.removeFirst();
        System.out.println("Modified LinkedList: " + myList);
        
        // Check if the LinkedList contains a specific item
        int searchItem = 4;
        System.out.println("Does the LinkedList contain " + searchItem + "? " + myList.contains(searchItem));
        
    }

    
}
