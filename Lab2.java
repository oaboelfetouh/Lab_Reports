import java.util.*;


// download any UML illustrator and do the sheet problem
public class Lab2 {
    public static void main(String[] args){
        // testing the empty constructor - setters and getters
        Vector v1 = new Vector();
        System.out.println("for the empty vector");
        System.out.println("x = " + v1.getX() +" , y = " + v1.getY());
        
        v1.setX (1);
        v1.setY ( 1.1);
        System.out.println("for the empty vector after using the setters");
        System.out.println("x = " + v1.getX() +" , y = " + v1.getY());
        
        // testing the non-empty constructor
        Vector v2 = new Vector(5.6, 8.9);
        System.out.println("for the non empty vector ");
        System.out.println("x = " + v2.getX() +" , y = " + v2.getY());
        
        // testing the mag and angle methods
        
        System.out.println("mag = " + v2.magnitude() +" , angle = " + v2.angle());
        
        // testing the print method
        v2.print();
        
        //testing the add method
        Vector v3 = v2.add(v1);
        v3.print();
        
        //testing the sub method
        Vector v4 = v2.sub(v1);
        v4.print();
        
        // testing the ave_arrs method
        Vector[] vArrs = {v1,v2,v3,v4};
        System.out.println("the average of the mag is : " + ave_arr(vArrs));
    }
    // this method takes an array of Vectors and returns its average Magnitude
    public static double ave_arr(Vector[] arrs){
        double mag_sum = 0;
        
        for (int i = 0; i < arrs.length; i ++){
            mag_sum += arrs[i].magnitude();
        }
        return mag_sum / arrs.length ;
    }
}

class Vector {
    
    private double x;
    private double y;
    
    // the empty constructor
    public Vector(){
        this.x = 0;
        this.y = 0;
    }
    // the non-empty constructor
    public Vector(double x_, double y_){
        x = x_;
        y = y_;
    }
    // getters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    // setters
    public void setX(double x_){
        this.x = x_;
    }
    public void setY(double y_){
        this.y = y_;
    }
    // the method that returns the magnitude of the vector
    public double magnitude(){
        return Math.sqrt( Math.pow(this.x,2) + Math.pow(this.y,2));
    }
    // the method that returns the angle of the vector
    public double angle(){
        return Math.atan2(this.y, this.x);
    }
    
    // this method prints the vector in 2 forms (x i + y j) and (magnitude and angle)
    public void print(){
        System.out.println(this.x + " i" + " + " + this.y + " j");
        System.out.println(this.magnitude()+ ", " + this.angle());
    }
    // this methods returns a new vector, the values of the 2 dimensions equals the sum of each in the current vector and the passed vector
    public Vector add(Vector v){
        return new Vector(this.x + v.getX(), this.y + v.getY());
    }
    // this method returns a new vector, the values of the 2 dimensions equals the sub of each in the current vector and the passed vector
    public Vector sub(Vector v){
        return new Vector(this.x - v.getX(), this.y - v.getY());
    }
}
