/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3q1;

/**
 *
 * @author mhmdd
 */
public class Circle extends GeometricObject{
    private double radius = 1;
    
    public Circle(){
        
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(String color,boolean filled ,double radius ){
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(getColor().equals("red"))
            sb.append("=== Default Circle ===").append("\nColor: ").append(getColor()).append("\nFilled: ").append(getFilled()).append("\nRadius: ").append(radius).append("\n");
        else
            sb.append("=== Black, unfilled Circle ===").append("\nColor: ").append(getColor()).append("\nFilled: ").append(getFilled()).append("\nRadius: ").append(radius).append("\n");
        return sb.toString();
    }
}
