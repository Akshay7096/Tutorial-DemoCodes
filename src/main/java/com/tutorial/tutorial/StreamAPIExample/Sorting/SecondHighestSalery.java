package com.tutorial.tutorial.StreamAPIExample.Sorting;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestSalery {

        public static void main (String[] args) {

            List<String> list = Arrays.asList("Akshay","Deshmane","Akshay", "LongHello");

            list.stream().map(ch-> ch.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);

             // List<String> lists = list.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());

             // lists.stream().


            /*List<Employee> employee = Arrays.asList(
                    new Employee("Akshay","IT"),
                    new Employee("Shivraj","HR"),
                    new Employee("Ajinkya","IT"));

           Map<String, List <Employee>> map = employee.stream().collect(Collectors.groupingBy(Employee::getterDept));
           System.out.println(map);*/


            List<Employee> employees = Arrays.asList(
                    new Employee("Ram", "IT"),
                    new Employee("Amit", "HR"),
                    new Employee("Raj", "IT")
            );


            //delete Amit


//            List<String> collect1 = employees.stream().filter(e -> e.getterName() == "Amit").reduce(employee -> employee.getterName()).map(employee -> employee.getterName()).collect(Collectors.toList());
//            System.out.println(collect1);

            boolean b = employees.removeIf(employee -> employee.getterName() == "Amit");
            System.out.println(b);
//            List<String> collect = employees.stream().map(e -> e.getterName()).collect(Collectors.toList());
//
//            System.out.println(collect);

//            Map<String, List<Employee>> result = employees.stream()
//                    .collect(Collectors.groupingBy(Employee::getterDept));
//
//            System.out.println(result);



        }
}
