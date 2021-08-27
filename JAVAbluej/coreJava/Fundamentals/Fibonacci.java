package Fundamentals;
import java.util.*;

public class Fibonacci{
    public static void main(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int counter = 1, a = 0, b = 1, sum = 0;
        while(counter <= n+1){
            System.out.print(a + " ");       
            sum = a + b;
            a = b;
            b = sum;
            counter++;
        }
    }
}