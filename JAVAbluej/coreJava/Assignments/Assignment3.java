package Assignments;
import java.io.*;
import java.util.*;

public class Assignment3{
    public static void main(String[] argc){
        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);
        /*
        output.println("Enter the radius of circle for finding area");
        int radius = input.nextInt();
        output.println("The area of circle is " + areaCircle(radius));
        output.println("Enter the base of triangle for calculating area");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        output.println("The area of triangle is " + areaTriangle(side1, side2, side3));
        output.println("Enter the sides of the rectangle : ");
        int recs1 = input.nextInt();
        int recs2 = input.nextInt();
        output.println("The area of the rectangle is " + areaRectangle(recs1, recs2));
        */
        output.println("Enter the no for the fibonacci series");
        
        int fibn = input.nextInt();
        int fib0 = 0, fib1 = 1, fibs = 0, counter = 1;
        while(counter <= fibn + 1){
            output.print(fib0 + " ");
            fibs = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibs;
            counter ++;
        }
        output.println();
        output.println("22. Enter the number : ");
        int n = input.nextInt();
        int sumn = 0, prodn = 1;
        while(n > 0){
            sumn += n%10;
            prodn *= n%10;
            n = n/10;
            output.println("sum " + sumn + "  " + "product " + prodn);
        }
        int sub = prodn - sumn;
        output.println(sub);
    }
    
    public static double areaCircle(int r){
        return (r * r * Math.PI);
    }
    
    static double areaTriangle(int a, int b, int c){
        float s = (a + b + c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    static float areaRectangle(int a, int b){
        return a * b;
    }
    
}