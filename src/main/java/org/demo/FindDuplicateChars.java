package org.demo;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateChars {

    public static void main(String[] args) { //another approach is hash map frequency and getvalue >1
        String s = "programming";
        Set<Character> set = new LinkedHashSet<>();
       Set<Character> duplicates = s.chars().mapToObj(c -> (char) c)
                .filter(ch -> !set.add(ch))
                .collect(Collectors.toSet());
       System.out.println(duplicates); //[r, g, m]

        //find first duplicate character
       Optional<Character> dup = s.chars().mapToObj(c -> (char) c)
                .filter(ch -> !set.add(ch))
                .collect(Collectors.toSet()).stream().findFirst();

        System.out.println(dup); //Optional[p]
        dup.ifPresent(System.out::println);

    }
}
