package com.practice;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String arr[] = new String [10000];
        Arrays.fill(arr, "HelloWorld");
        long start = System.currentTimeMillis();
        findString(arr);
        long end = System.currentTimeMillis();
        System.out.println("Time taken:");
        System.out.println(start);
        System.out.println(end);
        System.out.println( end - start);
    }
    public static void findString(String []args){
        for (int i =0 ; i < args.length ; i++){
            if(args[i].equals("HelloWorld")){
                System.out.println("Found");
            }
        }
    }
}