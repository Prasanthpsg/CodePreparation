package org.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxMinStream {

    public static void main(String[] args) {
        int[] arr ={23,45,122,33};
        List<Integer> list =  Arrays.stream(arr).boxed().collect(Collectors.toList());
        int max = list.stream().mapToInt(Integer::intValue).
                max().orElse(0);
        System.out.println(max); //122
    }
}
