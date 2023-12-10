 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q4;

class Circle2D{
    double x,y;
    double radius;
    
    public Circle2D(){
        x = 1;
        y = 1;
        radius = 1;
    }
    
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    double getX(){
        return x;
    }
    
    double getY(){
        return y;
    }
    double getRadius(){
        return radius;
    }
    
    double getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    
    double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    
    boolean contains(double x, double y){
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        if (distance < getRadius()){
            return true;
        }else
        return false;
    }
    
    boolean contains(Circle2D circle){
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        if (distance + circle.radius < getRadius()){
            return true;
        }else
        return false;
    }
    
    boolean overlaps(Circle2D circle){
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        if (distance < getRadius() + circle.radius){
            return true;
        }else
        return false;
    }
}

public class Main {


    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area is " + c1.getArea());
        System.out.println("Perimeter is "  + c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5,10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
    
}
