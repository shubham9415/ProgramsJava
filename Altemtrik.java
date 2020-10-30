package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Altemtrik {

    private static int temp1 =1;
    public  int temp2 =1;
String str = "ppp";

    class inner{
        /*static int temp5=4;*/
    /*private static int temp = 6;*/

    private int getR(){
        /*return (temp1 + temp);*/
        out.println(str.chars().distinct().count());
        return  1;
    }
        //accessing variables of super class

    }

    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add("F");
        obj.add("G");
        obj.add(1,"D");
        out.println(obj);
        out.println(5);
        int a = 260;
        byte b = (byte) a;
        out.println(b);
        out.println(1+
        2==+
        3+
                +
                        +5);
        /*out.println(Integer.parseInt("10.87"));*/
        out.println(1*2+3^4/5);
        out.println(Pattern.matches("[789]{1}[0-9]{3}","9953038949"));
        for(int i =0;i >5;){
            out.println("hello");;
        }
        String str = "aaeertrr";
        out.println("Value:");
        Long count  =str.chars().distinct().count();

        HashMap<String, Long> maps = new HashMap<>();
        out.println();
    /*    String s1 ="abc";
        String s2 = s1.intern();
        String s3 = "Java";
        String s4 = new String("Java");
        out.println(s1==s2 + " " + s3 == s4) +" ");
*/
        /*int[][] goats;
        goats = new int[3][];
        goats[0]={1,2};*/
        out.println("Traversing");
        findDistinct(Arrays.asList("aaryanna","aayanna", "airianna"),"aa");
        List<List<String>>ls=new ArrayList<>();
        List<String> lst = Arrays.asList("[10,d0,d1]","[15, EMPTY, EMPTY]","[20, d1, EMPTY]");
        ls.add(lst);
        List<String> lists  = ls.stream().flatMap(List::stream).collect(Collectors.toList());
        lists.stream().forEach(x-> out.println(x));
    }

    public static List<String> findDistinct(List<String> names, String prefix) {
        int length = prefix.length();
        List<String> list = new ArrayList<>();

        for(String str: names){
            if(str.substring(0, length).equals(prefix)){
                System.out.println("Entered");
                Long count = str.chars().distinct().count();
                String count1  = count.toString();
                list.add(str+ "-" +count1);
            }
        }
        return list;
    }

}
