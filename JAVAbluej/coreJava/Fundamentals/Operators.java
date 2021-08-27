package Fundamentals;

public class Operators{
    public static void main(String[] args){
        int a = 10;  int b =20;
        operations op = new operations();
        int sum = op.Sum(a,b);
        int sub = op.Sub(a,b);
        float div = op.Div(a,b);
        int mul = op.Mul(a,b);
        System.out.println("Sum is : "+ sum);
        System.out.println("Difference is : "+ sub);
        System.out.println("Division is : "+ div);
        System.out.println("Multiplication is : "+ mul);
    }
}

class operations{
    public static int Sum(int a, int b){
        return a + b;
    }
    public int Sub(int a, int b){
        return a - b;
    }
    public float Div(int a, int b){
        float x = (float)(a);  float y = (float)(b);
        // this conversion is important as int / int == integer which is to be converted in float
        //converion will be done explicitly and data can be loosen.
        return x / y;
    }
    int Mul(int a, int b){
        return a * b;
    }
}