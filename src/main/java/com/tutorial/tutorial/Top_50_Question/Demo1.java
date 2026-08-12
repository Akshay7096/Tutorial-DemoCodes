package com.tutorial.tutorial.Top_50_Question;

import java.util.*;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args) {
        List<Employee>  listOfEmp = Arrays.asList(
                new Employee(1,"Akshay", 5000.00,"IT"),
                new Employee(2,"Shubham",10000.00,"HR"),
                new Employee(3,"Jivan",7000.00,"IT"),
                new Employee(4,"Pawan",8000.00,"IT"),
                new Employee(5,"Soham",12000.00,"BA")
        );

    //        Long collect = listOfEmp.stream().collect(Collectors.counting());
    //        System.out.println("No. of Employees  "+collect);

//        List<Employee> highestSalary = listOfEmp.stream().filter(emp -> emp.getSalary() > 7000.00).collect(Collectors.toList());
//        System.out.println("highestSalary "+highestSalary.toString());


//        Map<String, Long> deptCount = listOfEmp.stream().collect(Collectors.groupingBy(Employee::getDeptNane, Collectors.counting()));
//        System.out.println("deptCount"+deptCount.toString());

        Double avgofSal = listOfEmp.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        Double average = listOfEmp.stream().collect(Collectors.averagingDouble(Employee::getSalary));

        System.out.println("avgofSal "+avgofSal);

        OptionalDouble average1 = listOfEmp.stream().filter(Objects::nonNull).mapToDouble(Employee::getSalary).average();
        System.out.println("average1"+average1);

        OptionalDouble average2 = listOfEmp.stream().filter(Objects::nonNull).mapToDouble(Employee::getSalary).average();
        System.out.println("hello ");


        Map<String, Double> averageofSalDept = listOfEmp.stream().collect(Collectors.groupingBy(Employee::getDeptNane,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("averageofSalDept "+averageofSalDept);
        Map<String, Double> avegofdepty = listOfEmp.stream().collect(Collectors.groupingBy(Employee::getDeptNane, Collectors.averagingDouble(Employee::getSalary)));


        /*String s = "Logic ";
        String a ="";

        s.concat("Build");
        a =  s.concat("Build");
        System.out.println(a);*/

    }
}
class Employee {

    int EmpId;
    String EmpName;
    Double Salary;
    String deptNane;

    Employee (int EmpId, String EmpName, Double Salary, String deptNane) {
        this.EmpId =  EmpId;
        this.EmpName =  EmpName;
        this.Salary =  Salary;
        this.deptNane =  deptNane;
    }

    public int getEmpId() {
        return EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }
    public double getSalary() {
        return Salary;
    }
    public String getDeptNane() {
        return deptNane;
    }

    @Override
    public String toString() {
        return "Employee{EmpId='" + EmpId + "', EmpName=" + EmpName + ", Salary=" + Salary+", Department=" + deptNane+"}";
    }
}
