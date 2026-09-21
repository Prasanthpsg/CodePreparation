package org.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableValidation {

    public static void main(String[] args) {
        List<Employee> list1 = Arrays.asList(
                new Employee(23,10000,"zack"),
                new Employee(12,34500,"kayal"),
                new Employee(99,11000,"arun")
  );

        Collections.sort(list1);
        System.out.println(list1);
        list1.forEach(e -> System.out.println(e.getName() + " "+e.getSalary() + " "+e.getEmployeeId()) );


    }
}
