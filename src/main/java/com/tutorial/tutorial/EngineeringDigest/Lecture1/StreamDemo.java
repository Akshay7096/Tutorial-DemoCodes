package com.tutorial.tutorial.EngineeringDigest.Lecture1;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
      //Feature introduce in java8
      // process collections of data in a functional and declarative manner
      // Simplify Data Processing
      // Embrace Functional programming
      // Improve readability and Maintainability
        //Enable Easy Parallelism

         //What is Stream?
        //It is a squece of element supporting functional and declarative programing

        //How to Used Stream
        //Source -> Intermediate Operation -> Termional Operation

        //Example 1
        List<Integer> listofInt = Arrays.asList(1,2,3,4,5,6);
        System.out.println(listofInt.stream().filter(x-> x%2 == 0).count());



//        List<Integer> listOfInt = Arrays.asList(1,2,3,4,5);
//        System.out.println(listOfInt.stream().mapToInt(Integer::intValue).sum());
//
//        List<Integer> salary = Arrays.asList(100,200,190,400,120,100,200);  //find second highest saleye
//         salary.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList()).forEach(System.out::print);


//        List<Employee> emp = Arrays.asList(
//                new Employee(1,"Akshay",100000),
//                new Employee(2,"ABC",5000),
//                new Employee(3,"QER",20000),
//                new Employee(4,"WMS",16000)
//                );
//
//        emp.stream().map(Employee::togetSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList()).forEach(System.out::println);

        //How to create a Stream
        List<String> listString = Arrays.asList("sdf","ewrwe","sdwer","poeer");

         //List -> Stream
        Stream<String> stream = listString.stream();

         //Array -> Stream
        String [] arr = {"ewr","wer","werer"};

        Stream<String> streamarr = Arrays.stream(arr);

        //Using stream of
        Stream<Integer> streaInt = Stream.of(1,23,4,5);

        //Using Filter
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,20);

        List<Integer> squareNumber= number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(squareNumber);

        List<Integer> squareOfNumber = number.stream().filter(x -> x % 2 == 0).map(x -> x * x).collect(Collectors.toList());
        System.out.println(squareOfNumber);

        long count  = number.stream().filter(n -> n > 10).count();
        System.out.println(count);

        //Reduce

        List<Integer> numArrayList = Arrays.asList(1,2,3,4,5);

        Integer sum = numArrayList.stream().reduce(0,(a,b) -> a+b);  //identity is 0 means initially and starts from 0
        Integer mul = numArrayList.stream().reduce(1,(a,b) -> a*b);  //identity is 1 means initially and starts from 1

        System.out.println("sum "+sum);
        System.out.println("mul "+mul);

        Integer max = numArrayList.stream().reduce(0,Integer::max);
        System.out.println("max"+max);

         Integer sumofSquarevenNumber = numArrayList.stream().filter(n-> n%2 == 0).map(n-> n*n).reduce(0, Integer::sum);
        System.out.println("sumofSquarevenNumber"+sumofSquarevenNumber);


        Integer result1 = numArrayList.stream().filter(n -> n%2 == 0).map(n -> n*n).reduce(0, (a,b) -> a+b);

        System.out.println(result1);


        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"ABC", 1000, 22),
                new Employee(2,"ABFF", 10000,30),
                new Employee(3,"TSDABC", 2000,18),
                new Employee(4,"AWERBC", 700,19)
        );

        List<Integer> list = employeeList.stream().map(Employee::togetSalary).sorted().collect(Collectors.toList());
        System.out.println("list" +list);

        List<Integer> listage = employeeList.stream().map(Employee::togetage).collect(Collectors.toList());
        List<Integer> listage1 = listage.stream().filter(n -> n > 20).collect(Collectors.toList());
        System.out.println("Empoyee is "+listage1);


        double listage23  = employeeList.stream().mapToInt(Employee::togetage).average().orElse(0.0);
        System.out.println("listage23"+listage23);


        employeeList.stream().filter(emp-> emp.togetage() > 20).map(emp -> emp.togetEmpId()).forEach(System.out::println);

        List<Integer> listInt = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, List <Integer>> lnum =  listInt.stream().collect(Collectors.partitioningBy(n-> n%2 == 0));
        System.out.println(lnum.get(true));
        System.out.println(lnum.get(false));

        List<Integer> listofNum = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, List<Integer>>  result = listofNum.stream().collect(Collectors.partitioningBy(n-> n%2==0));


        List<String> listofWord = Arrays.asList("apple","bat","cat","catwwer","banana");

        Map<Integer, List<String>> cat  = listofWord.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("cat "+cat);

        List<Integer> listofNum11 = Arrays.asList(1,5,3,6,8,3,6,8,5,9,2,4);

        listofNum11.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        String str = "Programming";

       // str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity()), LinkedHashMap:: new,Collectors.counting()).en

        str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() ==1).map(Map.Entry::getKey).forEach(System.out::println);



        List<Employee> employees = Arrays.asList(
                new Employee(1,"ABC", 1000, 22),
                new Employee(2,"ABFF", 10000,30),
                new Employee(3,"TSDABC", 2000,18),
                new Employee(4,"AWERBC", 700,19)
        );

        Map<Integer, List<Employee>> employeedDep = employees.stream().collect(Collectors.groupingBy(Employee::togetSalary));

        employeedDep.forEach((salary, employeeList1) -> {
//            System.out.println("salary "+salary);
//            employeeList1.forEach(System.out::println);
        });




        List<Employee> employees1 = Arrays.asList(
                new Employee(1,"ABC", 1000, 22),
                new Employee(2,"ABFF", 10000,30),
                new Employee(3,"TSDABC", 2000,18),
                new Employee(4,"AWERBC", 7000,19),
                new Employee(5,"AWERBC", 5000,13)
        );

        Map<Boolean, List<Employee> > partionBy = employees1.stream().collect(Collectors.partitioningBy(emp -> emp.togetSalary() > 5000));

        partionBy.get(true).forEach(System.out::println);

        System.out.println("------------");

        partionBy.get(false).forEach(System.out::println);






    }
}
class Employee {

    private int EmpiId;
    private String Name;
    private int Salary;
    private int age;

    public  Employee(int EmpiId, String Name, int Salary, int age) {
        this.EmpiId = EmpiId;
        this.Name = Name;
        this.Salary = Salary;
        this.age = age;

    }
    int togetEmpId () {
        return EmpiId;
    }
    String togetEmpName () {
        return Name;
    }
    int togetSalary () {
        return Salary;
    }
    int togetage() {
        return age;
    }
}
