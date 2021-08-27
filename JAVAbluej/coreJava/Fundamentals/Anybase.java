package Fundamentals;
import java.io.*;
import java.util.*;

public class Anybase{
    public static void main(){
        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);
        output.println("Enter any no. : ");
        int num = input.nextInt();
        output.println("Enter the base for the number : ");
        int base = input.nextInt();
        BaseToDcml conversion = new BaseToDcml();
        int converted = conversion.anybasetodcml(num, base);
        output.println(converted);
    }
}

class BaseToDcml{
    public int anybasetodcml(int num, int base){
        int ans = 0, mul = 1;
        while(num != 0){
            int rem = num % 10;
            ans += (mul * rem);
            mul = mul * base;
            num = num/10; 
        }
        return ans;
    }
}