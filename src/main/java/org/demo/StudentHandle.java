package org.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentHandle {

    public static void main(String[] args) {
//        Student s1 = new Student("Mac",56,9);
//        Student s2 = new Student("Kumar",99,19);
//        Student s3 = new Student("Kani",34,34);
//        Student s4 = new Student("Ajay",12,6);

        List<Student> studentList = Arrays.asList(
                new Student("Mac",56,9),
                new Student("Kumar",99,19),
                new Student("Kani",31,34),
                new Student("Ajay",12,6)
        );

        //using list sort
        studentList.sort(Comparator.comparing(Student::getAge).reversed()
                .thenComparing((Student::getName)));

        //using stream
//      studentList.stream().sorted(
//                Comparator.comparing(Student::getAge).reversed()
//                        .thenComparing((Student::getName))
//        ).collect(Collectors.toList());

       System.out.println(studentList); //[Mac - 56 - 9, Kumar - 99 - 19, Kani - 31 - 34, Ajay - 12 - 6]


    }
}
