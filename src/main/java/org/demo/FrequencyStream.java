package org.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyStream {

    public static void main(String[] args) {
        String input = "prasanth hi the hi dog test auto prasanth";
        String[] inputArray = input.split(" ");
         Map<Object, Long> map =Arrays.stream(inputArray).collect(Collectors.groupingBy(
                n -> n, Collectors.counting()
        ));

        System.out.println(map); //{the=1, hi=2, auto=1, test=1, prasanth=2, dog=1}

        //find duplicates
        List<Object> duplicates =  map.entrySet().stream().filter((entry) -> entry.getValue()>1)
                .map((entry) -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println(duplicates); //[hi, prasanth]

        //sorting
//        List<Map.Entry<Object, Long>> sorted = map.entrySet().stream().sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
//                .collect(Collectors.toList());
//
//        System.out.println(sorted); //[hi=2, prasanth=2, the=1, auto=1, test=1, dog=1]






    }
}
