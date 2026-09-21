package org.demo;

import java.util.Arrays;

public class RotateArrayAndReverse {

    public static void main(String[] args) {
        int[] arr =  { 5,4,3,2,1};  //1st rotation [1,5,4,3,2]
        //2nd rotation [2,1,5,4,3]
        //3rd rotation [3,2,1,5,4]
        int k=3;
        k %= arr.length;
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr)); //[3, 2, 1, 5, 4]


    }
    public static void reverseArray(int[] array, int start, int end){
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

}

