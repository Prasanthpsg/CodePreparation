package org.demo;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element");
        int key = scanner.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9,10}; // works on the sorted array
        int lb =0, ub = arr.length-1;
        boolean found = false; // Flag to track if the element is found

        while(lb <= ub){
            int mid = (lb+ub)/2;
            System.out.println("Mid value: "+mid);
           // int midValue = arr[mid];
            if(arr[mid] == key){
                System.out.println("Key found "+key);
                found = true;
                break;
            }else if(arr[mid] < key){
                lb = mid + 1;
            }else{
                ub = mid -1;
            }
        }

        if(!found){
            System.out.println("Key " + key + " not found in the array.");
        }

        scanner.close();

    }
}
