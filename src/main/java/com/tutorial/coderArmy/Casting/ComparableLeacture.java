package com.tutorial.coderArmy.Casting;

import ch.qos.logback.core.status.WarnStatus;

import java.util.*;
import java.util.List;

public class ComparableLeacture {
    public static void main(String[] args) {


        //Notes
        // 1. Comparable it is a interface to compare two value in side the Objects..
        // Work like a Contract
        //Bellow give example how its works Comparable interface

        //Rule < means -ve  and > means +ve

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Akshay",95));
        empList.add(new Employee("Shubham",85));
        empList.add(new Employee("Rohan",56));

        Collections.sort(empList);
       // Collections.

        for (Employee emp : empList) {
            System.out.println(emp.name + " " + emp.marks);
        }

    }
}

class Employee implements Comparable<Employee>{
    String name;
    int marks;

    Employee(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

//    @Override
//    public int compareTo(Employee o) {
//        System.out.println(o.name);
//        //  + asending  and  - descending
//        //s1.CompareTo(s2)
//        return this.marks - o.marks; //It follows assending order
//       // return o.marks - this.marks; //It follows descending order
//    }

    //Some cased the issue happen is we sort only based on param CompareTO complex
    @Override
    public int compareTo(Employee o) {
        if (this.marks != o.marks) {
            return this.marks - o.marks; //It follows assending order
        }
        return this.name.compareTo(o.name); //It follows assending order
    }

    //Conclusion when we need to use Comparable

    // 1. Custome Class
    // 2. Natural Ordering --> Obvious sound based on 1 sorting or 2 sorting(Custom)
    //

}
