/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q3;

import java.util.ArrayList;
import java.util.Scanner;

class Sort{
    ArrayList<Integer> Num = new ArrayList<>();
    ArrayList<Integer> distinctNum = new ArrayList<>();
    
    public void Add(int num){
        Num.add(num);
    }
    
    public void Remove(int i){
        Num.remove(i);
    }
    
    public void Compare() {
        
        for(int i = 0; i < Num.size(); i++){
            if(!distinctNum.contains(Num.get(i))){
                distinctNum.add(Num.get(i));
            }
        }
    }
    
    public void Output(){
        for(int i = 0; i< distinctNum.size() ; i++){
            System.out.print(distinctNum.get(i) + " ");
        }
        
    }
}

public class Main {

    public static void main(String[] args) {
        Sort sort = new Sort();
        Scanner get = new Scanner(System.in);
        
        System.out.println("Enter ten integers: ");
        for(int i = 0; i < 10; i++){
            sort.Add(get.nextInt());
        }
        sort.Compare();
        System.out.print("Output: ");
        sort.Output();
    }
    
}
