package com.ironhack.w1d1;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] input ={5,4,3,2,1};

        /*input[input.length-1]= input[input.length-1] * input[0];
        for (int i = 0; i < input.length-1;i++){
            input[i] = input[i] * input[i+1];
        }
        System.out.println(Arrays.toString(input));

*/      int counter = 0;
        int[] output = new int[input.length];

        for(int i = input.length-1;i >= 0 ;i--){
            output[i]= input[counter];
            counter = counter +1;
        }
        System.out.println(Arrays.toString(output));
    }
}