package Fundamentals;
import java.util.*;
import java.io.*;

public class Evenorodd{
    public static void main(String args[]){
        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);
        
        output.println("Enter the number to be checked : ");
        int in = input.nextInt();
        Check checkinput = new Check();
        int isevenodd = checkinput.checkEvenOdd(in);
        
        if(isevenodd == 0){
            output.println("Number is even");
        }else{
            output.println("Number is odd");
        }
        
        boolean primen = checkinput.checkPrime(in);
        
        if(primen){ output.println("The number is prime"); }
        else{ output.println("The number is not prime."); }
    }
}


class Check{
    public int checkEvenOdd(int num){
        return num % 2;
    }
    public boolean checkPrime(int num){
        boolean flag = true; //initially true.
        int divisor =  2; //initial condition (starting)
        while(divisor <= num-1){//stoping criteria.
            if(num % divisor == 0){ flag = false; }
            divisor++; //updation criteria
        }
        
        return flag;
    }
}