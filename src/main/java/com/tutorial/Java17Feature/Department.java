package com.tutorial.Java17Feature;

import java.util.Arrays;
import java.util.stream.Collectors;

public sealed class Department permits Employee {

    int departId = 5;

}

final class Employee extends Department{

     int empId = 10;

}

class HR  {
   public static void main(String[] args) {


       String [] name = {"Akshay", "Rohit", "Neha"};

       Arrays.stream(name).map(String :: toLowerCase).forEach(System.out::println);
       System.out.println(Arrays.stream(name).map(String :: toLowerCase).collect(Collectors.toList()));
//        Employee d = new Employee();
////
////        System.out.println(d.empId);
////        System.out.println(d.departId);
  }
}