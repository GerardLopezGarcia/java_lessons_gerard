package com.ironhack.w1d1;



//Arrays------------------------
/*

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

      int counter = 0;
        int[] output = new int[input.length];

        for(int i = input.length-1;i >= 0 ;i--){
            output[i]= input[counter];
            counter = counter +1;
        }
        System.out.println(Arrays.toString(output));

    }
}
*/
/*

//Standard Input and file handling---------------------------------
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("String input");
        String words = scanner.nextLine();

        String[] arrayWords = words.toLowerCase().split(" ");

        int counter = 0;


        for (String word : arrayWords){
            if (word.startsWith("a")  || word.startsWith("e") || word.startsWith("i")|| word.startsWith("o")|| word.startsWith("u") ){
                counter ++ ;
            }else{
                System.err.println(word);
            }
        }

        System.out.println(counter);
    }
}
*/
// Scanner and Files ---------------------------
/*
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("./src/com/ironhack/w1d1/oscar_age_female.csv");

        FileWriter writer = new FileWriter("result.txt",true);

        Scanner scanner = new Scanner(file);
        String data = scanner.nextLine();
        while (scanner.hasNextLine()){
            data = scanner.nextLine();
            String[] columns = data.split(",");
            writer.write("Name: " + columns[3] + "\n");
            writer.write("Year: " + columns[1]+ "\n");
            writer.write("Age: " + columns[2]+ "\n");
            writer.write("Movie: " + columns[4]+ "\n");
            writer.write("================="+ "\n");

        }

        writer.close();
        scanner.close();

    }
}

 */
/*
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String age;


        boolean access;

        do {
                System.out.println("Inster your age ");
                age = scanner.nextLine();
                access = true;

                char[] array = new char[age.length()];
                age.getChars(0,age.length(),array,0);

            for (char c : array) {
                int ascii = c;
                if(ascii < 47 || ascii > 58) {
                    access = false;
                    break;
                }
            }
        }
        while(!access);

        System.out.println("congrats you entered");

    }
}

*/

// Classes ---------------------------
/*
public class Main {
    public static void main(String[] args) {
        Course ironhack = new Course(001,"mucha",4803325,"probando clases");
        ironhack.setTitle("deja de probar");
        System.out.println(ironhack.getTitle());

    }
}


 */
/*
//Interfaces and Abstract Classes----------------
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Main{
    public static void main(String[] args) {
        BigDecimal a =new BigDecimal(".5");
        BigDecimal b = new BigDecimal(".034");
        BigDecimal add = a.add(b);
        BigDecimal subs = a.subtract(b);
        BigDecimal mult = a.multiply(b);
        BigDecimal divide = a.divide(b,RoundingMode.DOWN);

        BigDecimal result = divide.setScale(4,RoundingMode.UP);

        BigDecimal x = new BigDecimal(2);
        BigDecimal i = x.multiply(new BigDecimal("2.3")).add(new BigDecimal("1.5"));
        BigDecimal j = x.subtract(new BigDecimal(".8"));
        BigDecimal res = i.divide(j,RoundingMode.HALF_EVEN);
        System.out.println(res);
    }
}
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

}