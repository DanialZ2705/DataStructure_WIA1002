/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q7;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

class Matrix{
    
    Random shuffle = new Random();
    int position = shuffle.nextInt(4);
    
    public static void shuffle(int[][] m){
        ArrayList<int[]> Matrix = new ArrayList<>();
        
        for (int[] row : m){
            Matrix.add(row);
        }
        
        Collections.shuffle(Matrix);
        
        for(int i = 0; i < Matrix.size(); i++) m[i] = Matrix.get(i);
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] m = {{1,2},{3,4},{5,6},{7,8},{9,10}};
        
        Matrix.shuffle(m);
        
         for (int i = 0; i < m.length; i++) 
                System.out.print("(" + m[i][0] + ", " + m[i][1] +  ") " );
    }
    
}
