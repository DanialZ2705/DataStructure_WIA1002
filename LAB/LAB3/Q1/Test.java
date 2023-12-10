/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3q1;

/**
 *
 * @author mhmdd
 */
public class Test {
    
    public static void main(String[] args) {
        GeometricObject geo1 = new GeometricObject("red", true);
        System.out.println(geo1);
        
        Circle circle1 = new Circle("red", true, 1.0);
        System.out.println(circle1);
        
        Circle circle2 = new Circle("black", false, 9.0);
        System.out.print(circle2);
        
        Rectangle rectangle1 = new Rectangle(1 ,1 ,"red" ,true );
        System.out.println(rectangle1);
    }
    
}
