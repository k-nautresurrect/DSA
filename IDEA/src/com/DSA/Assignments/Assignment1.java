package com.DSA.Assignments;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Assignment1 {
    public static void main(String[] args) {
        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);
        output.println("Enter the year to be checked wether leap or not: ");
        int year = input.nextInt();
        leap(year);
        output.println("Enter first no. for summing up");
        int num1 = input.nextInt();
        output.println("Enter the second no. for summing up");
        int num2 = input.nextInt();
        sum(num1, num2);
        output.println("Enter the number to get the multiplication table:");
        int tablevar = input.nextInt();
        table(tablevar);
        output.println("Enter no. 1 for hcf and lcm");
        int facnum1 = input.nextInt();
        output.println("Enter no. 2 for hcf and lcm");
        int facnum2 = input.nextInt();
        hcflcm(facnum1, facnum2);
        sumtillx();
    }
    public static void leap(int year){

        if(year%4 == 0){
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");
        }
    }

    static void sum(int a,int b){
        System.out.println(a + b);
    }

    static void table(int num){
        int mul = 1;
        while(mul <= 10){
            System.out.println(num + "X" + mul + "=" + num * mul);
            mul++;
        }
    }

    static void hcflcm(int num1,int num2){
        //int rem = 1;
        //while(rem != 0){
        //    rem = num1%num2;
        //    num2 = rem; num1 = num2;
        //}
        int hcf = 1,i;
        for(i = 1; i <= Math.min(num1,num2); i++){

            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        System.out.println("the hcf is :"+ hcf);
        System.out.println("the lcm is :" + (num1 * num2) / hcf);
    }

    static void sumtillx(){
        char x = 'c';
        int sum  = 0;
        Scanner sc = new Scanner(System.in);
        while(x != 'x'){
            x = sc.next().charAt(0);

            if(Character.isDigit(x)){
                int a = Character.getNumericValue(x);
                sum += a;
            }else{ x = Character.toLowerCase(x); }
        }
        System.out.println("The Sum is : "+ sum);
    }
}
