package com.DSA;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n+1];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int j = 2; j < arr.length; j++) {
            int key = arr[j];
            int i = j-1;

            while (i>0 && arr[i] < key ){
                arr[i+1] = arr[i];
                i = i-1;
            }

            arr[i+1] = key;
        }

        for (int i = 1; i < arr.length; i++) {
            output.print(arr[i] + " ");
        }
    }
}
