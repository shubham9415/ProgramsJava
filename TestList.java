package com.practice;

import java.util.Arrays;

public class TestList {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("C");
        sb.append(":" + "H");
        String str ="C:H;C:M";
        byte test = 67;
        System.out.println(Arrays.asList(str.split(";")));
        System.out.println("ACTUALLCjhecl" + Arrays.asList(str.split(";")).contains(sb.toString()));

        StringBuilder sb1 = new StringBuilder();
        sb.append("abc");
        String abcd = "abc";
        System.out.println("FOFF" +  sb.equals(new StringBuilder(abcd)));
        String str1 = "12,134";
        System.out.println(str1.chars().allMatch(Character::isDigit));

    }
}
