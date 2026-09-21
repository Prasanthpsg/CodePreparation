package org.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      List<Integer> list = Arrays.asList(23,2,23,100,34,2,1,0,55,100);

//      List<Integer> filter = list.stream().filter(num -> num>50)
//              .toList();
//      System.out.println(filter);

        Integer sum = list.stream().reduce(0, (acc, num) -> {
            acc = acc +num;
            return acc;
        });
        System.out.println(sum);



        }
    }
