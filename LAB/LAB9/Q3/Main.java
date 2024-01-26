/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q3;

/**
 *
 * @author mhmdd
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addLast(2);
        list1.addLast(10);
        list1.addLast(38);
        list1.addLast(41);
        list1.addLast(51);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addLast(5);
        list2.addLast(12);
        list2.addLast(18);
        list2.addLast(21);
        list2.addLast(35);
        list2.addLast(41); 
        list2.addLast(56);

        LinkedList<Integer> list3 = list1.combine(list1, list2);

        System.out.println("List1: " + list1.toString());
        System.out.println("List2: " + list2.toString());
        System.out.println("List3: " + list3.toString());
    }
}
