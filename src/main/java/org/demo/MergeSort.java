package org.demo;

import java.util.Arrays;

public class MergeSort {

    static void MergeSort1(int[] arr, int low, int high){
        if(low < high){
            int mid = (low+high)/2;
            MergeSort1(arr,low,mid);
            MergeSort1(arr,mid+1,high);

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {8,12,60,10,2,5};
        MergeSort1(arr, 0, arr.length-1);


    }
}
