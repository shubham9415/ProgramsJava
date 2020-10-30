package com.practice;

import java.util.Iterator;
import java.util.TreeSet;

public class Value implements Comparable{

    @Override
    public String toString() {
        return "1";
    }

    public static void main(String[] args) {
        TreeSet<Value> set = new TreeSet<Value>();
        set.add(new Value());
        set.add(new Value());
        Iterator<Value> it =  set.iterator();
        while (it.hasNext()){
            System.out.println(it.next() + " ");
        }
        }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
