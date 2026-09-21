package org.demo;

import java.util.*;
import  java.util.stream.*;

public class SortByStringLength {

    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("John", "Alexander", "Bob", "David");

        /* stream method */
//        List<String> sortedNames=  names.stream().sorted(Comparator.comparingInt(String::length).reversed())
//                .collect(Collectors.toList());
//
//        System.out.println(sortedNames);//[Alexander, David, John, Bob]

        /* normal list method */

//        names.sort((a,b)-> b.length() - a.length()); // internally uses the comparator logic
//        System.out.println(names); //[Alexander, David, John, Bob]

        //ascending order
        names.sort(Comparator.comparingInt(String::length));  // s-> s.length()
        System.out.println(names);//[Bob, John, David, Alexander]
        // if you want descending order, please use reversed() method
    }
}
