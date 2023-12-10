/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3q1;

/**
 *
 * @author mhmdd
 */
public class Rectangle extends GeometricObject{
    private double width = 1;
    private double height = 1;
    
    public Rectangle(){
        
    }
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width, double height, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n=== Default Rectangle  ===").append("\nColor: ").append(getColor()).append("\nFilled: ").append(getFilled()).append("\n");
        return sb.toString();
    }
}
