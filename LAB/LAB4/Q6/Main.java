/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q6;

import java.util.Scanner;
    
class Matrix{
    
    public static boolean isMarkovMatrix(double[][] m){
        
        double c1 = m[0][0] + m[1][0] + m[2][0];
        double c2 = m[0][1] + m[1][1] + m[2][1];
        double c3 = m[0][2] + m[1][2] + m[2][2];
        
        if(c1 == 1 && c2 == 1 && c3 == 1) return true;
        else return false;
    }
    
}

public class Main {


    public static void main(String[] args) {
        
        Scanner get = new Scanner(System.in);
        double[][] M = new double[3][3];
        
        System.out.println("Enter a 3x3 Markov Matrix: ");
        for(int i = 0; i < 3; i++) for(int j = 0; j < 3; j++)
        if(get.hasNextDouble()) M[i][j] = get.nextDouble();
        
        System.out.println("Is this a Markov Matrix? " + Matrix.isMarkovMatrix(M));
    }
    
}
