package org.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstNonRepeatedChar {

    public static void main(String[] args) {
        String s = "swiss";

        Character result =      s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        n -> n, Collectors.counting()
                )).entrySet().stream().filter( (entry) -> entry.getValue() ==1)
                .map((entry) -> entry.getKey())
                .findFirst().orElse(null);

        System.out.println(result);//w


        Map<Object,Long> result1 =      s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        n -> n, LinkedHashMap::new, Collectors.counting()
                ));
        System.out.println(result1); //{s=3, w=1, i=1}


    }
}
