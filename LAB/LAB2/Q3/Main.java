/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q3;

import java.util.Arrays;

class Course{
    String courseName;
    int numberOfStudents = 10;
    String[] students = new String[numberOfStudents];
    
    
    public Course(){
    }
    
    String getCourseName(){
        return courseName;
    }
    
    void addStudents(String studentName){
        if(numberOfStudents >= students.length){
            int Cap = numberOfStudents * 2;
            
            students = Arrays.copyOf(students, Cap);
        }
        students[numberOfStudents] = studentName;
        numberOfStudents++;
    }
    
    void dropStudents(String studentName){
        for(int i = 0; i < numberOfStudents; i++){
            if(studentName.equalsIgnoreCase(students[i])){
                
                for(int j = i; j < numberOfStudents; j++ ){
                    students[j] = students[j + 1];
                }
                
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                return;
            }
        }
    }
    
    String[] getStudents(){
        String[] studentNames = new String[numberOfStudents];
        for(int i = 0; i < students.length; i++){
            studentNames[i] = students[i];
        }    
        return studentNames;
    }
    
    int getStudentsCount(){
        int studentCount = 1;
        for(int i = 0; i < students.length; i++){
            studentCount++;
        }
        return studentCount;
    }
    
    void clear(){
            Arrays.fill(students, null);
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}