/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q4;

import java.util.Scanner;

class Matrix{
    
    public static int[] locateSmallest(int[][] a){
        int smallestVal = a[0][0];
        int row = 0;
        int col = 0;
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(a[i][j] < smallestVal){
                    smallestVal = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        int[] result = {row + 1 ,col + 1};
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        
        Scanner get = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        
        System.out.println("Enter a 4x4 integer array: \n");
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(get.hasNextInt()){
                    matrix[i][j] = get.nextInt();
                }
            }
        }
        
        int[] smallestLocation = Matrix.locateSmallest(matrix);
        System.out.println("Location: (" + smallestLocation[0] + ", " + smallestLocation[1] + ")");
        
    }
    
}
