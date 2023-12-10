package lab1q1;

/**
 *
 * @author mhmdd
 */

class Fan {
    
    int n;
    double rad;
    String warna;
    boolean on;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int HIGH = 3;

    private int speed(){
    int n = 1;    
        switch(n){
            case 3:
            {n = HIGH;
            return n;
            }
            case 2:
            {n = MEDIUM;             
             return n;
            }
            default:
            {n = SLOW;
             return n;
            }
        }
}
    
    private boolean isOn(boolean newOn) {
        if (newOn) {
            on = true;
        } else {
            on = false;
        }
        return on;
    }
    
    private double radius(double rad){
        double radi = rad;
        return radi;
    }
    
    String color(String warna){
        String colour = warna;
        return colour;
    }
    
    Fan(){
        n = SLOW;
        rad = 5;
        warna = "blue";
    }
    
    public int getN(){
        return n;
    }
    
    public void setN(int newN){
        this.n = newN;
    }
    
    public double getRadius(){
        return rad;
    }
    
    public void setRadius(double newRadius){
        this.rad = newRadius;
    }
    
    public String getColour(){
        return warna;
    }
    
    public void setColour(String newColour){
        this.warna = newColour;
    }
    
    public boolean getOn(){
        return on;
    }
    
    public void setOn(boolean newOn){
        this.on = newOn;
    }
    
    public String customToString(String newColour, boolean newOn, double newRadius, int newN) {
        String condition = newOn ? "on" : "off";
        return "The " + newColour + ", " + newRadius + "cm fan is turned " + condition;
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.println(fan1.customToString("yellow", true, 10, 3));

        Fan fan2 = new Fan();
        System.out.println(fan2.customToString("blue", false, 5, 2));
}

    
}