package Fundamentals;
import java.io.PrintStream;

public class ifelse{
    public static void main(){
        int a = 10, b = 20;
        PrintStream output = new PrintStream(System.out);
        a = a + 20;
        if(a > b){
            output.println(a);
        }else{
            output.println(b);
        }
        boolean True = false;
        if(True){
            output.println("this is true");
        }else{
            output.println("this is false");
        }
    }
}