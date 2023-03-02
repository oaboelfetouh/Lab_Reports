
/*
Eng. Abdullah el Rashedy - lab instructor

Java can work on literally any platform, most UI is done by java
Java Development Kit: turns the java file to byte file
 --
 camelCase for variable names and methods instead of _ in cpp
 CONSTANTS are always capital letters
 --
There is main 4 data types in life
TRUE/FALSE
NUMBER
DECIMAL POINT
CHARS/STRINGS
 --
Class global values have initial values by default cuz they alreayd have adresses in the memory
Methods Local variables doesnt have a default value cuz the they are not initailly doesnt have a location in the memory
 --
Consider the literals in Data types
 --

 */
import java.util.*;
public class Lab {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            // the first for loop in control of the number of lines: 5 lines
            for (int j = 0; j <= i; j++){
                // the second for loop is in control of the number of stars for each line. starting from 1 to 5
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static double sum_arr(double[] arr){
        double sum = 0.0;
        for (int i = 0; i < arr.length(); i++){
            sum += arr[i];
        }
        return sum;
    }
}

class Rectangular{
    double width;
    double height;
    public Rectangular(double n_width, double n_height){
        width = n_width;
        height = n_height;
    }
    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2* width  +2* height;
    }
}

class Circle{
    double radius;
    public Circle(double n_radius){
        radius = n_radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
           return Math.PI * 2 * radius;
    }
}
