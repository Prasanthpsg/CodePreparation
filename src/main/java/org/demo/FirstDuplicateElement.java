package org.demo;

import java.util.*;

public class FirstDuplicateElement {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 10, 50);
        Set<Integer> set = new LinkedHashSet<>();

        Integer first = list.stream()
                .filter(e -> !set.add(e))
                .findFirst().orElse(0);

        System.out.println(first); //20
    }
}
