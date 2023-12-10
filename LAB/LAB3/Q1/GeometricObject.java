/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3q1;

/**
 *
 * @author mhmdd
 */
public class GeometricObject {
    private String color;
    private boolean filled;
    
    public GeometricObject(){
        
    }
    
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean getFilled(){
        return filled;
    }
    
    void setColor(String color){
        this.color = color;
    }
    
    void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("=== Geometric Object ===").append("\nColor: ").append(color).append("\nFilled: ").append(filled).append("\n");
        return sb.toString();
    }
    
}
