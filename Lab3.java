import java.util.*;


public class Lab3 {
    public static void main(String[] args){
        MyStringBuffer my_s = new MyStringBuffer("Ana Omar");
        System.out.println(my_s.get_arr());
    }
    public static void test_Q2(){
        System.out.println("//** For testing the functionality of the NEW 2D LINE **\\");
        System.out.println();
        
        System.out.println("FIRST CREATE A VECTOR :-");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x_ = input.nextDouble();
        System.out.println("Enter the value of y: ");
        double y_ = input.nextDouble();
        
        Vector v1 = new Vector(x_, y_);
        
        System.out.println();
        System.out.println("SECOND CREATE A POINT :-");
        System.out.println("Enter the value of x: ");
        double xp_ = input.nextDouble();
        System.out.println("Enter the value of y: ");
        double yp_ = input.nextDouble();
               
        Point p1 = new Point(x_, y_);
        
        System.out.println();
        
        System.out.println("CREATE A LINE USING GIVEN INFORMATION :-");
        Line L2 = new Line(xp_, yp_, x_, y_);
        L2.print();
    
        System.out.println("CREATE A LINE USING 2 OBJECTS WE CREATED FROM GIVEN INFO :-");
        Line L1 = new Line(p1, v1);
        L1.print();
        
       
    }
    public static void test_Q1(){
         System.out.println("//** For testing the functionality of the NEW STATIC METHOD ADD/SUB, we need to create 2 new vectors **\\");
        System.out.println();
        
        double x_;
        double y_;
        System.out.println("FOR THE FIRST VECTOR :-");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x_ = input.nextDouble();
        System.out.println("Enter the value of y: ");
        y_ = input.nextDouble();
        
        Vector v1 = new Vector(x_, y_);
        
        System.out.println();
        System.out.println("FOR THE SECOND VECTOR :-");
        System.out.println("Enter the value of x: ");
        x_ = input.nextDouble();
        System.out.println("Enter the value of y: ");
        y_ = input.nextDouble();
        Vector v2 = new Vector(x_, y_);
        System.out.println();
        
        Vector v_output;
        System.out.println("the RETURN of the add new static method: ");
        v_output = Vector.add(v1,v2);
        v_output.print();
        
        System.out.println("the RETURN of the sub new static method: ");
        v_output = Vector.sub(v1,v2);
        v_output.print();
        
        System.out.println();
        System.out.println();
        System.out.println(" //** For testing the functionality of the NEW MEMBER METHOD READ on v1 **\\");
        System.out.println();
        
        v1.read();
        v1.print();
        
    }
}

class MyStringBuffer {
    private char[] charArr;
    
    public MyStringBuffer(String passed_string){
        int length = passed_string.length();
        this.charArr = new char[length];
        for(int i = 0; i < length; i ++){
            charArr[i] = passed_string.charAt(i);
        }
    }
    public char[] get_arr(){
        return this.charArr;
    }
    public void print(){
        System.out.println(this.get_arr());
    }
    public int indexOf(char c){
        for (int i = 0; i < this.charArr.length; i ++){
            if charArr[i] == c {
                return i;
            }
        }
        return -1;
    }
    public int length(){
        return this.charArr.length;
    }
    public void erase(int index, int length){
        
    }
    public void insert(int index, String str){
        
    }
}
class Line {
    private Point line_point;
    private Vector line_vector;
    
    public Line(Point line_point_passed, Vector line_vector_passed){
        this.line_vector = line_vector_passed;
        this.line_point = line_point_passed;
    }
    
    public Line(double x_point, double y_point , double x_vector, double y_vector){
        this.line_vector = new Vector(x_vector, y_vector);
        this.line_point = new Point(x_point, y_point);
        //this.line_point.setX(x_point);
        //this.line_point.setY(y_point);
        
        //this.line_vector.setX(x_vector);
        //this.line_vector.setY(y_vector);
    }
    public void print(){
        System.out.println("the poit (position) of the line: ");
        this.line_point.print();
        
        System.out.println("the vector (direction) of the line: ");
        this.line_vector.print();
    }
}

class Point {
    private double x;
    private double y;
    
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(double x_, double y_){
       this.x = x_;
       this.y = y_;
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
    public void print(){
        System.out.println("( " + this.x + ", " + this.y + " )");
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
        System.out.println("the magnitude is: " + this.magnitude()+ ", and the angel is: " + this.angle());
    }
    // the new static method add
    static public Vector add(Vector v1, Vector v2){
        return new Vector(v1.getX() + v2.getX(), v1.getY() + v2.getY());
    }
    // the new static method sub
    static public Vector sub(Vector v1, Vector v2){
        return new Vector(v1.getX() - v2.getX(), v1.getY() - v2.getY());
    }
    public void read(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the NEW value of x: ");
        double x_ = input.nextDouble();
        System.out.println("Enter the NEW value of y: ");
        double y_ = input.nextDouble();
        this.setX(x_);
        this.setY(y_);
    }
}
