package com.practice;

interface A{
    public void show();
    default void pleaseShow(){
        System.out.println("Please SHow!");
    }
}

interface B{
    public void dontShow();
    default void pleaseShow(){
        System.out.println("Please dont SHow!");
    }
}
public class Multipleinheritance implements A,B {
    @Override
    public void show() {
     A.super.pleaseShow();
    }

    @Override
    public void dontShow() {
        B.super.pleaseShow();
    }

    @Override
    public void pleaseShow(){
        A.super.pleaseShow();
        A.super.pleaseShow();
    }

    public static void main(String[] args) {
        Multipleinheritance object = new Multipleinheritance();
        object.pleaseShow();
    }
}
