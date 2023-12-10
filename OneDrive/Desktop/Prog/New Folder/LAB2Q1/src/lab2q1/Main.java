/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q1;

/**
 *
 * @author mhmdd
 */

class MyPoint{
    
    private double Ox, Oy;
    public double x, y;
    
    public MyPoint(){
        this.Ox = 0;
        this.Oy = 0;
    }
    
    public MyPoint(double Px, double Py){
        Px = 0;
        Py = 0;
    }
    
    public double getOX(){
        return Ox;
    }
    
    public double getOY(){
        return Oy;
    }
    
    double distance(double Ox, double Oy){
        double dist = Math.sqrt(Math.pow(Ox - 0, 2) + Math.pow(Oy - 0, 2));
        return dist;
    }
    
    double distance(double x, double y, double Px, double Py){
        double dist = Math.sqrt(Math.pow(Px - x, 2) + Math.pow(Py - y, 2));
        return dist;
    }
    
    static void distance(double dist){
        System.out.println("The distance is " + dist );
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyPoint point1 = new MyPoint();
        MyPoint.distance(point1.distance(4,4));
        
        MyPoint point2 = new MyPoint();
        MyPoint.distance(point2.distance(0,0, 10, 30.5));

    }
    
}
