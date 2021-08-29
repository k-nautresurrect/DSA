package com.DSA.Assignments;

import java.io.PrintStream;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);
        output.println("Enter the number for finding factorial : ");
        int facn = input.nextInt();
        int factorial = fac(facn);
        output.println(factorial);
        output.println("Enter the number to check wether it is even or odd : ");
        int checkEO = input.nextInt();
        boolean evenodd = evenOdd(checkEO);
        if(evenodd){ output.println("number is even"); }
        else { output.println("number is odd"); }
        output.println("Enter your name : ");
        String name = input.next();
        output.println(Greetings(name));
        output.println("Enter the principle for simple interest : ");
        int p = input.nextInt();
        output.println("Enter the Rate for Simple interest : ");
        int r = input.nextInt();
        output.println("Enter the time for Simple interest : ");
        int t = input.nextInt();
        output.println("The Simple Interest is : " + SimpleInterest(p,r,t));
        output.println("Enter the numbers to perform operations : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        char Operator = input.next().charAt(0);
        output.println("calculation is : " + operator(num1,num2,Operator));
        output.println("Enter 2 numbers to find which is greater : ");
        int lnum = input.nextInt();
        int lnum1 = input.nextInt();
        output.println("The greatest is : "+ Largestof2(lnum,lnum1));
        int factornum = input.nextInt();
        allFact(factornum);
    }

    static int fac(int num){
        int factorial = 1;
        while(num != 0){
            factorial *= num;
            num--;
        }
        return factorial;
    }

    static boolean evenOdd(int num){
        return num % 2 == 0;
    }

    static String Greetings(String name){
        return "Namaste" + name;
    }

    static int SimpleInterest(int p,int r, int t){
        return (p * r * t)/2;
    }

    static int operator(int num1,int num2,char op){
        if(op == '+'){ return num1 + num2; }
        else if(op == '-'){ return num1 - num2; }
        else if(op == '/'){ return num1 / num2; }
        else if(op == '*'){ return num1 * num2; }
        else{ return -1; }
    }

    static int Largestof2(int num1,int num2){
        return Math.max(num1, num2);
    }

    static void allFact(int num){
        int factor;
        for(factor = 1; factor <= 10; factor++){
            if(num % factor == 0){ System.out.println(factor); }
        }
    }
}
