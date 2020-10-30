package com.practice;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");   
        String value = s.nextLine();
        System.out.println(value);
        List<String> list = new ArrayList();
        String values[] = value.split(" "); // Writing output to STDOUT
        for (int i = 0 ; i < values.length; i++){
                int p =Integer.parseInt(values[i]);
                for(int j = 1; j <=p; j++){
                    if(j%3 ==0 && j% 5 ==0){
                        list.add("FizzBuzz");
                    }
                    else if(j%3 == 0 ){
                        list.add("Fizz");
                    }
                    else if(j%5 ==0){
                        list.add("Buzz");
                    }
                    else {
                        list.add(String.valueOf(j));
                    }
                }
        }
        list.forEach(System.out::println);
    }
}
