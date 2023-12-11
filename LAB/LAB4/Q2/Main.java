/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q2;

import java.util.ArrayList;
import java.util.Scanner;

class Calculate{
    ArrayList<Integer> NumList = new ArrayList<>();
    
    public void add(int num){
        NumList.add(num);
    }   
    
    public int sum(){
        int sum = 0;
        for(int i = 0; i < NumList.size(); i++){
            sum += NumList.get(i);
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        Calculate num= new Calculate();
        System.out.println("Enter five numbers:");
        
        for(int i = 0; i < 5; i++){
            num.add(get.nextInt());
        }
        
        System.out.println("Sum of all numbers: " + num.sum());
    }
}
