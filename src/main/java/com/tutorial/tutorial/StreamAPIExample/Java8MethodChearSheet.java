package com.tutorial.tutorial.StreamAPIExample;

import ch.qos.logback.core.net.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8MethodChearSheet {



    public static void main (String[] args) {

        //EmployeeDataBase emp = new EmployeeDataBase();
//        List<Employee> employeeList = EmployeeDataBase.getAllEmpolyees();
//
//        Object[][] empList = (Object[][]) EmployeeDataBase.getObjectEmployee();
//
//        for (Object[] row : empList) {
//
//            for (Object value : row) {
//                System.out.print(value + "\t");
//            }
//
//            System.out.println();
//        }

//        Object[] empList1 = (Object[]) EmployeeDataBase.getObjectEmployee1();
//        for (Object row : empList1) {
//            System.out.println(row);
//        }
      /* employeeList.stream().forEach(emp1 -> System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getAddress()));


       employeeList.stream().map(Employee::getName).forEach(System.out::println);


     Map<String,List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getAddress()));

        map.forEach((address, employees) -> {
            System.out.println(address);
            employees.stream().forEach(emp1 -> System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getAddress()));
        });*/


      /*  List<Employee> empList =  employeeList.stream().filter(emp1 -> emp1.getAddress().equals("Pune")).collect(Collectors.toList());
        for (Employee emp: empList) {
            System.out.println("emp  "+ emp.getName());
        }

        //to get All Address

        List<String> List = employeeList.stream().map(emp -> emp.getAddress()).distinct().collect(Collectors.toList());


        System.out.println("List"+List);*/


//
//        String str = "PROGRAMMING";
//
//        String Str1 = new String("HHEELO");
//
//        Map<Character, Long> map = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        map.entrySet().stream().filter(entry -> entry.getValue()>1)
//                .forEach(System.out::println);


        /*String str = "PROGRAMMING";

        Map<Character,Long> map = str.chars().mapToObj(ch-> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream().filter(entry -> entry.getValue()>1).forEach(System.out::println);



        String str1  = "HELLO";


        Map<Character, Long> map1 = str1.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map1.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);*/


       // List<Employee> employeeList1 = EmployeeDataBase.getAllEmpolyees();

//         Map<String, List<Employee>> emp = employeeList1.stream().collect(Collectors.groupingBy(employee -> employee.getName()));
//
//         System.out.println("emp  "+emp);
//
//
//        Map<String,List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getAddress()));
//
//        map.forEach((address, employees) -> {
//            employees.stream().forEach(emp1 -> System.out.println(emp1.getName()));
//        });

       // employeeList1.stream().forEach(emp1 -> System.out.println(emp1.getName()));


//        List<String> List = employeeList.stream().map(emp -> emp.getAddress()).distinct().collect(Collectors.toList());
//
//
//        System.out.println("List"+List);

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Alice", "Pune", "IT"),
                new Employee(2,"Akshay", "Hinjewadi", "IT"),
                new Employee(3,"Yash", "Wakad", "IT"),
                new Employee(4,"Rutik", "Jambe", "DR"),
                new Employee(5,"Pawan", "Punawale", "Finance")

        );

        Map<String, List<Employee>> employeedDep = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        employeedDep.forEach((department, employeeList) -> {
            System.out.println("department "+department);
            employeeList.forEach(System.out::println);
        });
    }
}

