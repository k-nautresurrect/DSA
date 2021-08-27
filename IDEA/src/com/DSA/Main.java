package com.DSA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
	    for(int i : arr){
            System.out.print(i+" ");
        }
	    operations n = new operations();
	    n.HelloWorld();
    }
}

class operations{
    public void HelloWorld(){
        System.out.println("Hello world.");
    }
}