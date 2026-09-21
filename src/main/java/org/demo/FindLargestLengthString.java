package org.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindLargestLengthString {

    public static void main(String[] args) {
        String str = "My name is prasanth";

        List<String> list= Arrays.stream(str.split(" ")).
                sorted((a,b) -> b.length() - a.length())
                .collect(Collectors.toList());
        System.out.println(list.get(0));//prasanth
    }
}
