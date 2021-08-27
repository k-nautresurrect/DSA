package Fundamentals;
import java.util.Scanner;

public class Sumn{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //initial condition.
        int itr = 0, sum = 0; //we use while loop bcoz no. of itr is not known.
        while(itr <= n){ //stoping criteria.
            sum += itr;
            itr++; //updation.
        }
        //value of itr = n+1
        System.out.println("The Sum is : " + sum);
        //without while loop
        System.out.println((n * (n + 1))/2);
        System.out.println((n * (n+1) * ((2 * n) + 1))/6);
    }
}