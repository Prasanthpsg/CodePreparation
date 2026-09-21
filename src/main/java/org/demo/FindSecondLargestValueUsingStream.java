package org.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestValueUsingStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,34,56,1,9,55,23,34,1);

        Integer max=  list.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println(max); //55


    }
}
