/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4q1;

/**
 *
 * @author mhmdd
 */
public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1122, 1000, 1.5);
             
        acc1.deposit('d', 30);
        acc1.deposit('d', 40);
        acc1.deposit('d', 50);
        acc1.withdraw('w', 5);
        acc1.withdraw('w', 4);
        acc1.withdraw('w', 2);

        System.out.println(acc1.toString());

    }
}
