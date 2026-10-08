package com.tutorial.tutorial.Top_50_Question;

import org.springframework.util.comparator.Comparators;

import javax.swing.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question20_To_Question_25 {

    public static void main(String[] args) {

        //Using Important Topic which is Collectors.collectingAndThen()

        //20. Group employees department-wise and sort them by salary in descending order. IT -> 1000,750,500,200,50   HR -> 1000,750,500,200,50
        List<Employee> empList = Arrays.asList(
                new Employee(1, "ABC", 12000.00, "IT"),
                new Employee(2, "ABCD", 10000.00, "IT"),
                new Employee(3, "ABCDE", 100.00, "IT"),
                new Employee(4, "ABCDEF", 500.00, "IT"),
                new Employee(5, "ABCDEFG", 30000.00, "HR"),
                new Employee(6, "ABCDEFGT", 6000.00, "HR")
        );

        Map<String, List<Double>> collect = empList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDeptNane,
                        Collectors.collectingAndThen(
                                Collectors.mapping(Employee::getSalary, Collectors.toList()),
                                list -> {
                                    Collections.sort(list, Collections.reverseOrder());
                                    return list;
                                }
                        )
                ));
        System.out.println(collect);

//        Map<String, List<Double>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDeptNane, Collectors.mapping(Employee::getSalary, Collectors.collectingAndThen(
//                Collectors.toCollection(TreeSet::new), ArrayList::new
//        ))));



//        List<List<Double>> collect1 = collect.values().stream().sorted(Comparator).collect(Collectors.toList());
//        System.out.println("collect1"+collect1);

        //Question 21. Find the highest-paid employee in each department. IT -> High Salery 10000, HR -> 300000


        Map<String, Double> collect1 = empList.stream()
                .collect(
                        Collectors.groupingBy(Employee::getDeptNane,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(
                                                Comparator.comparingDouble(
                                                        Employee::getSalary)
                                        ), emp -> emp.get().getSalary())
                        )
                );
        System.out.println("collcollect1ect1"+collect1);


        System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getDeptNane, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),emp-> emp.get().getSalary()))));
        
        
        //Question22 Find duplicate element from integer list
        

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,2,4);

        Map<Integer, Long> collect2 = intList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Integer, Long> collect3 = intList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("collect2"+collect2);

    }
}


