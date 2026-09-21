package org.demo;
import java.util.*;

public class EYQuestion {

    public static void main(String[] args) {
        int[] arr =  { 1,2,3,4,5,6,7};
        List<Integer> temp = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        for(int value: arr){
            list.add(value);
        }
        //  System.out.println("My list: "+list);

        int input =3;
        for(int i=0;i<input;i++){
            temp.add(arr[i]);
        }
        //     System.out.println(temp);

        for(int j=0;j<input;j++ ){
            list.remove(0);
        }
     //   System.out.println(list);

        list.addAll(temp);
        System.out.println(list);

    }
    }

