package Fundamentals;
import java.util.*;

public class Gcd{
    public static void main(){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();  int num2 = input.nextInt();
        int rem = 1;
        while(rem != 0){
            rem = num1%num2;
            num1 = num2;  num2 = rem;
        }
        System.out.println("HCF is : " + num1);
    }
}