package org.demo;

import java.util.Arrays;

public class MethodOverloadCompile {

    static int sum(int a , int b){
        return a+b;
    }

    static double sum(double a , double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(7,7.5));//14.5
        System.out.println(sum(7,7));//14
        System.out.println(sum(7.5,7.5));//15.0
        System.out.println(sum(7.5,7));//14.5
    }
}
