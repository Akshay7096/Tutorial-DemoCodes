package com.tutorial.tutorial.RealTimeExample;

import org.apache.poi.ss.formula.functions.Count;
import org.apache.poi.ss.formula.functions.Intercept;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindmaleandFemaleCount {

    public static void main(String[] args) {

        List<Employee> listofEmp = Arrays.asList(
               new Employee(1,"Shubham", "Mail", 10000.00),
               new Employee(2,"Priti", "Femail", 50000.00),
               new Employee(3,"Vaishali", "Femail", 80000.00),
               new Employee(4,"Akshay", "Mail", 3000.00)
        );

        //Gender Count
        Map<String, Long> emp = listofEmp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("emp"+emp);

        //Average Salary
        Map<String, Double> list =  listofEmp.stream().collect(Collectors.groupingBy(Employee:: getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("list"+list);


      //  List<Boolean> emp = listofEmp.stream().collect(Collectors.partitioningBy(getGender -> getGender.getGender()));

//        Map<String, Long> mapofCount = listofEmp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//
//        System.out.println("mapofCount"+ mapofCount);


        //Find sum of even number or Odd number given list

        List<Integer> NumberList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map <Boolean, Integer> mapnum = NumberList.stream().collect(Collectors.partitioningBy(d -> d%2 == 0, Collectors.summingInt(Integer:: intValue)));

        System.out.println("sum of Even "+ mapnum.get(true));
        System.out.println("sum of Odd " + mapnum.get(false));


        String str = "This is toold effective, Tool name is Jenkine name Name";

        final List<String> list1 = Arrays.asList(str.split("\\s"));
        Map<String, Long> collect =
                list1.stream()
                .map(ch -> ch.toUpperCase())
                        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println("collect " +collect);
//        str.toUpperCase().chars().mapToObj().collect(Collectors.toList());


        String str1 = "This this akshay Akshay Hello Hii";


        List<String> list2 = Arrays.asList(str1.split("\\s"));
        Map<String, Long> collect1 = list2.stream().map(x-> x.toUpperCase()).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println("collect1"+collect1);



        String str11 = "This is the School my BEst, School is this best";

        List<String> listofStr = Arrays.asList(str11.split("\\s"));

        Map<String, Long> result = listofStr.stream().map(x -> x.toUpperCase()).collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println("result " + result);


        List<Integer> intNumlist = Arrays.asList(1,2,3,4,5,10,11,34,6,7);
        Stream<Integer> sorted = intNumlist.stream().sorted(Comparator.reverseOrder());
        sorted.forEach(System.out::print);


        Optional<Integer> reduce = intNumlist.stream().reduce(Integer::sum);
        System.out.println("Sum of given List "+reduce.get());

        String str111 = "Hello World";

        long count = str111.chars().filter(ch -> ch == 'h').count();
        System.out.println("countOf Chars "+count);

    }
}

class Employee {

    private int EmpId;
    private String Name;
    private String gender;
    private double salary;

    Employee (int EmpId, String Name, String gender,double salary) {

        this.EmpId = EmpId;
        this.Name = Name;
        this.gender = gender;
        this.salary= salary;
    }

    public int getEmpId () {
        return EmpId;
    }

    public String getName () {
        return Name;
    }

    public String getGender  () {
        return gender;
    }

    public double getSalary () {
        return salary;
    }


}
