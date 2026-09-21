package org.demo;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[]  arr = {8,12,60,10,2,5}; // find the smallest item and move it to the front

        for(int i=0;i<arr.length-1;i++){

            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min =j;
                }
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Final result: "+Arrays.toString(arr));
    }
}
