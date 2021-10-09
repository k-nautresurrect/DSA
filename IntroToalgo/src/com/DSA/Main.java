package com.DSA;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);
        int counter = 0;
        String s = "xxyx";
        int i;
        int res = 0;
        for(i = 0;i<s.length(); i++){
            if(s.charAt(i) == 'x'){
                counter++;
            }
            else{
                counter--;
            }
            if(counter == 0){
                res = 1;
                break;
            }
        }
        System.out.println(i);
        System.out.println(res);
    }
}
