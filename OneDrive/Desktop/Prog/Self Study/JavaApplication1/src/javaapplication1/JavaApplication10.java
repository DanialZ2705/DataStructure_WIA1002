/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author mhmdd
 * only one public class, have the same name as the java file
 * can have so many non public class in public javafile
 * 
 * Getters and Setters is used to access private class to enable security
 */

class Person{
    // can have constructor and also method and also data
    String name;
    int age;
    private int phoneNumber = 12345;
    void teaching(){
        for(int i = 0; i < 3; i++){
        System.out.println("He is not teaching his students");
        }         
        System.out.println("He is teaching his students");
        }
    
    public Person(){
        name = "Lutfi";
        age = 300;
    }

void calculateYearToGraduate(){
    double yearsLeft = age + 3.5;
    System.out.println(yearsLeft);
}
    
public int getAge(){
    return age;
}
public void setAge(int newAge){
    this.age = newAge;
}

public int getPhoneNumber(){
    return phoneNumber;
}

public void setPhoneNumber(int number){
    this.phoneNumber = number;
}

}
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        Person Zoro = new Person();
        Zoro.name="Zakwan";
        Zoro.age=20;
        
        System.out.println("Person name is " + Zoro.name + " and his age is " + Zoro.age);
        Zoro.teaching();
        int telefon = Zoro.getPhoneNumber();
        int age = Zoro.getAge();
        System.out.println(age);
        System.out.println(telefon);
    }
    
}
