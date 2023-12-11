/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q5;

import java.util.Scanner;
import java.util.Stack;
class Matrix{
    
    public static double[][] addMatrix(double[][] a, double[][] b){
        double c00 = a[0][0] + b[0][0];
        double c01 = a[0][1] + b[0][1];
        double c10 = a[1][0] + b[1][0];
        double c11 = a[1][1] + b[1][1];
        
        double[][] c = { {c00, c01},
                         {c10, c11}};
        return c;
    }
        
}
    
public class Main {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        
        double[][] A = new double[2][2];
        double[][] B = new double[2][2];
        
        System.out.print("Enter 4 values of a 2x2 matrix A: ");
        for(int i = 0; i < 2; i++) for(int j = 0; j < 2; j++) 
            if(get.hasNextDouble()) A[i][j] = get.nextDouble();
        System.out.print("Enter 4 values of a 2x2 matrix B: ");
        for(int k = 0; k < 2; k++) for(int l = 0; l < 2; l++) 
            if(get.hasNextDouble()) B[k][l] = get.nextDouble();
        
        double[][] result = Matrix.addMatrix(A, B);
        System.out.println("The addition of the two matrix results in ");
        System.out.println(result[0][0] + " " + result[0][1] + " \n" +
                           result[1][0] + " " + result[1][1]
        );
    }
    
}
