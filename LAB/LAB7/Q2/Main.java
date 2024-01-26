/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7q2;

import java.util.Scanner;

class Transaction{
    
    int balance = 1000;
    MyQueue<String> myQ = new MyQueue<>(20);
    
    public void calculate(String input) {
    myQ.enqueueMany(input);

    while (!myQ.isEmpty()) {
        String[] info = myQ.peek().split(" ");
        for (int i = 0; i < info.length; i++) {
            switch (info[i]) {
                case "D":
                    balance = balance + Integer.parseInt(info[i + 1]);
                    myQ.dequeue();
                    break;
                case "W":
                    balance = balance - Integer.parseInt(info[i + 1]);
                    myQ.dequeue();
                    break;
            }
        }
    }
}

    
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transaction t1 = new Transaction();
        
        System.out.print("Enter Transaction: ");
        String input = scanner.nextLine();
        
        t1.calculate(input);
        System.out.println("Initial balance: " + t1.balance);
        
    }
    
}
