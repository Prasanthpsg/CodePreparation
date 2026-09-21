package org.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReturnIndexTwoSum {

    private static int[] twoSum(int[] arr, int target){

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            int complementary = target - arr[i];

            if(map.containsKey(complementary)){
                return new int[] {map.get(complementary),i};
            }

            map.put(arr[i],i);
        }

        return new int[] {-1,-1};
    }
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);

        System.out.println(Arrays.toString(result));//[0,1]
    }
}
