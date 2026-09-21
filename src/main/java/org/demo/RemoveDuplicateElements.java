package org.demo;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        int[] a = {23,12,45,45,32,1,9,45,12};

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<a.length;i++){
            boolean found = false;
            for(int j=0;j<list.size();j++){
                if(a[i] == (list.get(j))){
                    found =true;
                    break;
                }

            }
            if(!found){
                list.add(a[i]);
            }

        }
        System.out.println(list); //[23, 12, 45, 32, 1, 9]
    }

}

