package com.tutorial.tutorial.StreamAPIExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeInterviewQ {
    private static final Logger log = LoggerFactory.getLogger(EmployeeInterviewQ.class);

    public static void main(String[] args) {
        List<Employe> employeeList = new ArrayList<>();
        employeeList.add(new Employe("Alice", 75000, "IT", 28, "Female"));
        employeeList.add(new Employe("Bob", 85000, "Finance", 35, "Male"));
        employeeList.add(new Employe("Charlie", 65000, "HR", 30, "Male"));
        employeeList.add(new Employe("Diana", 95000, "IT", 40, "Female"));
        employeeList.add(new Employe("Ethan", 72000, "Marketing", 25, "Male"));


        // Employee from each department with highest salary using Java 8 features / stream API
        // depart IT -> 95000

        Map<String, Optional<Employe>> collect = employeeList.stream().collect(Collectors.groupingBy(Employe::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employe::getSalary))));
        System.out.println("collect"+collect);

      /*  Optional<String> s = employeeList.stream().max(Comparator.comparingDouble(Employe::getSalary)).map(Employe::getDepartment);
        System.out.println("s"+s);*/

        /*
                Map<String, Optional<Employe>> collect = employeeList.stream().collect(Collectors.groupingBy(Employe::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employe::getSalary))));
                System.out.println("collect"+collect);

                Optional<Double> highestSalary =
                        employeeList.stream()
                                .max(Comparator.comparingDouble(Employe::getSalary)).map(Employe::getSalary);

                Optional<Double> v = employeeList.stream()
                        .max(Comparator.comparingDouble(Employe::getSalary)).map(Employe::getSalary);

                System.out.println(v);*/

       // collect.entrySet().stream().max(Comparator.comparingDouble(Employe:: getSalary)).collect.

        //        String s = "Java";
        //
        //        s.concat(str: " Developer");
        //        System.out.println("s"+s);

         //19. Find the employee with the second-highest salary.   Akshay -> 55000

        Map<String, List<Double>> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employe::getName, Collectors.mapping(Employe::getSalary, Collectors.toList())));
        System.out.println("collect1"+collect1);
    }
}

class Employe {

      private String name;
      private double salary;
      private String department;
      private int age;
      private String gender;

    public Employe(String name, double salary, String department, int age, String gender){
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.age = age;
        this.gender = gender;

    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getDepartment(){
        return this.department;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
