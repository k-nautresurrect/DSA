package Assignments;
import java.io.*;
import java.util.*;

public class Assignment3{
    public static void main(String[] argc){
        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);
        output.println("Enter the radius of circle for finding area");
        int radius = input.nextInt();
        output.println("The area of circle is " + areaCircle(radius));
        output.println("Enter the base of triangle for calculating area");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        output.println("The area of triangle is " + areaTriangle(side1, side2, side3));
        
    }
    
    public static double areaCircle(int r){
        return (r * r * Math.PI);
    }
    
    static double areaTriangle(int a, int b, int c){
        float s = (a + b + c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}