package org.demo;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[]  arr = {8,12,60,10,2,5}; //Swaps adjacent elements if they are in the wrong order.

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr)); // after each iteration the largest number will be moved to the right side of the array
        }

        System.out.println("Final :" +Arrays.toString(arr));
    }
}
