package org.demo;

public class FindSumOfIntegers {

    private static int sumOfDigits(int i){

        if(i<10){
            return i;
        }

        int sum =0;
        while(i > 0){
            sum = sum + i%10;
            i = i/10;
        }

        return sumOfDigits(sum);
    }

    public static void main(String[] args) {
        int i = 9875;
        System.out.println(sumOfDigits(i));
    }
}
