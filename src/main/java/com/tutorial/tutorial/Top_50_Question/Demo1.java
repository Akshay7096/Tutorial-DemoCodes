package com.tutorial.tutorial.Top_50_Question;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {

    public static void main(String[] args) {
        List<Employee>  listOfEmp = Arrays.asList(
                new Employee(1,"Akshay", 50000.00,"IT"),
                new Employee(2,"Shubham",100000.00,"HR"),
                new Employee(3,"Jivan",80000.00,"IT"),
                new Employee(4,"Pawan",65000.00,"IT"),
                new Employee(5,"Soham",43000.00,"BA")
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


        //Question 6
        Map<String, Double> averageofSalDept = listOfEmp.stream().collect(Collectors.groupingBy(Employee::getDeptNane,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("averageofSalDept "+averageofSalDept);
        Map<String, Double> avegofdepty = listOfEmp.stream().collect(Collectors.groupingBy(Employee::getDeptNane, Collectors.averagingDouble(Employee::getSalary)));

        //Question 7 Check if any employee has a salary greater than 75,000.
        boolean checkhightSalaryEmp = listOfEmp.stream().anyMatch(e -> e.getSalary() > 75000); //true or false just checking anyMatch or Not
        System.out.println("checkhightSalaryEmp "+checkhightSalaryEmp);

        //Question 8 Check if all employee has a salary greater than 40,000.
        List<Employee> hightSalaryEmp = listOfEmp.stream().filter(emp -> emp.getSalary() > 40000).collect(Collectors.toList());
        System.out.println("hightSalaryEmp" + hightSalaryEmp);

       // Question 9 Check if no employee has a salary less than 30,000
        List<Employee> lessSalary =  listOfEmp.stream().filter(e -> e.getSalary() < 45000).collect(Collectors.toList());
        System.out.println("lessSalary"+lessSalary);

        //Question 10 Find the sum of all employee salaries.

        Double sumofSalary = listOfEmp.stream().collect(Collectors.summingDouble(Employee::getSalary));  //using collect (summingDouble)
        System.out.println("sumofSalary"+sumofSalary);

        Double Totalsum = listOfEmp.stream().map(Employee::getSalary).reduce(0.0, Double::sum); //using map().reduce()
        System.out.println("Totalsum"+Totalsum);

       // Question 11 Find the highest salary among employees

        Optional<Employee> collect = listOfEmp.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.getSalary())));
        System.out.println("collect"+collect);

        Optional<Employee> max = listOfEmp.stream().max(Comparator.comparing(e -> e.getSalary()));
        System.out.println("max"+max);

        List<Integer> listInt = Arrays.asList(1,2,3,4,5);
        Optional<Integer> first = listInt.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println("first"+first);

        //Que 12.  Find the top 2 highest-paid employees.
        //sorting and limit(2)
        List<Employee> top2HighpayingsalEmp = listOfEmp.stream()
                                                       .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                                       .limit(2).collect(Collectors.toList());
        System.out.println("top2HighpayingsalEmp "+top2HighpayingsalEmp);

        //Question 13  Find the names of the top 2 highest-paid employees.
         List<String> collect1 =  listOfEmp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).map(Employee::getEmpName).collect(Collectors.toList());

        System.out.println(listOfEmp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).collect(Collectors.toList()));

        System.out.println("collect1"+collect1);

        System.out.println(listOfEmp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).map(Employee::getEmpName).collect(Collectors.toList()));

     // Question 14 Group employee names by department.
        Map<String, List<String>> collect2 = listOfEmp.stream().collect(Collectors.groupingBy(e -> e.getDeptNane(), Collectors.mapping(Employee::getEmpName, Collectors.toList())));
        System.out.println(collect2);;

        //Question 15 15. Find the department with the highest average salary.
        Map<String, Double> collect3 = listOfEmp.stream().collect(Collectors.groupingBy(Employee::getDeptNane, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(listOfEmp.stream().collect(Collectors.groupingBy(Employee:: getDeptNane, Collectors.averagingDouble(Employee::getSalary))));


        Map<String, Double> collect4 = listOfEmp.stream().collect(Collectors.groupingBy(Employee :: getDeptNane, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect4);
        List<String> collect5 = collect4.keySet().stream().sorted().limit(1).collect(Collectors.toList());
        System.out.println("collect5  "+collect5);

        Map<String, Double> collect6 = listOfEmp.stream().collect(Collectors.groupingBy(Employee::getDeptNane, Collectors.averagingDouble(Employee::getSalary)));
        List<Double> collect7 = collect6.values().stream().sorted(Comparator.reverseOrder()).limit(1).collect(Collectors.toList());
        System.out.println("collect6"+collect6);
        System.out.println("collect7"+collect7);

        //Que 16. Print the department name along with its highest average salary.
        Map<String, Double> averagesalary = listOfEmp.stream().collect(Collectors.groupingBy(Employee::getDeptNane, Collectors.averagingDouble(Employee::getSalary)));
        Optional<Map.Entry<String, Double>> max2 = averagesalary.entrySet().stream().max(Comparator.comparingDouble(e -> e.getValue()));
        System.out.println(max2.get());

        averagesalary.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e ->
                        System.out.println(e.getKey() + " → " + e.getValue())
                );

                //Question 17. Find the department with the highest total salary payout.  - {BA -> sum of salery 110000}

               Map<String, Double> sumofdeptwiseSlary =  listOfEmp.stream()
                       .collect(Collectors.groupingBy(Employee :: getDeptNane, Collectors.summingDouble(Employee :: getSalary))
               );
                  System.out.println(sumofdeptwiseSlary);
                Optional<Map.Entry<String, Double>> max1 = sumofdeptwiseSlary.entrySet().stream().max(Comparator.comparingDouble(e -> e.getValue()));
                System.out.println("max1"+max1.get());

                //Question 18. Find the second-highest salary among employees.


        Optional<Employee> max3 = listOfEmp.stream().max(Comparator.comparing(e -> e.getSalary()));
        System.out.println(max3.get());

        List<Employee> collect8 = listOfEmp.stream().sorted(Comparator.comparing(e -> e.getSalary())).collect(Collectors.toList());
        System.out.println("collect8"+collect8);

        List<Employee> collect9 = listOfEmp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println("collect9"+collect9);


        List<String> collect10 = listOfEmp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(e -> e.getEmpName()).collect(Collectors.toList());
        System.out.println(collect10);

        System.out.println(listOfEmp.stream().collect(Collectors.groupingBy(Employee :: getDeptNane, Collectors.mapping(e -> e.getEmpName(), Collectors.toList()))));

        Map<String, Double> collect11 = listOfEmp.stream().collect(Collectors.groupingBy(Employee::getDeptNane, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("collect11"+collect11);

        Optional<Map.Entry<String, Double>> max4 = collect11.entrySet().stream().max(Comparator.comparing(e -> e.getValue()));
        System.out.println("max4"+max4.get());

        List<Map.Entry<String, Double>> collect12 = collect11.entrySet().stream().sorted(Comparator.comparingDouble(e -> e.getValue())).skip(1).limit(1).collect(Collectors.toList());
        System.out.println("collect12"+collect12);
//OR
        List<Map.Entry<String, Double>> collect13 =
                collect11.entrySet()
                        .stream()
                        .sorted(Comparator.comparingDouble(
                                (Map.Entry<String, Double> e) -> e.getValue()
                        ).reversed())
                        .skip(1)
                        .limit(1)
                        .collect(Collectors.toList());

        //collect11.entrySet().stream().sorted(Comparator.comparingDouble().reversed()).skip(1).limit(1);


        //



        String str = "Hell0";
        String str2 = "Hell0";

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
