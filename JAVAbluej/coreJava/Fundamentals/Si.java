package Fundamentals;
import java.util.*;

public class Si{
    public static void main(String[] argsc){
        int time;  int intrest;  int amount;
        Scanner input = new Scanner(System.in);
        //it will return anything given as an input from System.in .
        System.out.print("Enter the time for si : ");
        time = input.nextInt();
        System.out.print("Enter the intrest rate : ");
        intrest = input.nextInt();
        System.out.print("Enter the amount : ");
        amount = input.nextInt();
        float si = (amount * intrest * time) / 100.00f; 
        //to say a value is float not double just add an f at last to it.
        System.out.println("Simple intrest is : " + si); 
        inputexample exmpl = new inputexample();
        exmpl.exinput();
    }
}

class inputexample{
    public static void exinput(){  //how to return any value from a function
        Scanner input = new Scanner(System.in);
        //how to check type of an object.
        String  thing = input.next();
        if(input.hasNextInt()){
            //it will check if there is an integer in the input that can be parsed into int.
            System.out.println(thing);
        }
    }
}