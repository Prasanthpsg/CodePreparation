package org.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorCustomSortLogicValidation {

    //  sort based on the employee salary
    public static void main(String[] args) {

        Comparator<Employee> comSalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
              if(o1.getSalary() > o2.getSalary()){
                  return 1;
              }else if(o1.getSalary() < o2.getSalary()){
                  return -1;
              }else{
                  return 0;
              }
            }
        };

        Comparator<Employee> comName = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
              return   o1.getName().compareToIgnoreCase(o2.getName());
            }
        };


        List<Employee> list = Arrays.asList(
                new Employee(23,10000,"zack"),
                new Employee(12,34500,"kayal"),
                new Employee(99,11000,"arun")
        );

      //  Collections.sort(list, com); 1st sort
        list.sort(comSalary); // note that above line is not required.
        //op : [23 10000 zack, 99 11000 arun, 12 34500 kayal]

        // again sort based on the name - 2nd sort
        list.sort(comName); //[99 11000 arun, 12 34500 kayal, 23 10000 zack]

        System.out.println(list);


    }
}
