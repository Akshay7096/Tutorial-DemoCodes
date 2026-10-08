package com.tutorial.tutorial.EngineeringDigest.Lecture1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Hashmap {
    //Hashmap Lecture Day 1 indetails to Learn Collections

    //Map is good example Dictionary -> eg., Walk -> Chalana

    public static void main(String[] args) {

        Map<Integer, String> studetList = new HashMap<>();
        studetList.put(1,"Akshay");
        studetList.put(2,"Neha");
        studetList.put(3,"Komal");
        studetList.put(4,"Suraj");
        System.out.println(studetList);

        String studentName = studetList.get(1);
        System.out.println(studentName);

        Set<Map.Entry<Integer, String>> entries = studetList.entrySet();

        for (Map.Entry<Integer, String>  i : entries) {
            System.out.println(i); /*1=Akshay 2=Neha 3=Komal 4=Suraj*/
        }

        List<Employee1> empList= Arrays.asList(
                new Employee1(101, "Akshay","IT"),
                new Employee1(102, "Kiran","IT"),
                new Employee1(103, "Minakshi","HR"),
                new Employee1(104, "Aniket","BA"),
                new Employee1(105, "Omkar","IT"),
                new Employee1(106, "Jyotsna","BA")
        );

//        List<Employee1> empName =  empList.stream().filter(emp -> emp.getDept() == "IT").collect(Collectors.toList());
//        System.out.println(empName);
//
//        for (Employee1 i : empName) {
//            System.out.println(i.getEmpName());
//        }

        Map<String, List<String>> result =  empList.stream().collect(Collectors.groupingBy(Employee1::getDept, Collectors.mapping(emp -> emp.getEmpName(), Collectors.toList())));
        System.out.println(result);


        Map<String, List<String>> collect = empList.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.getDept(),
                        Collectors.mapping(
                                emp -> emp.getEmpName(),
                                Collectors.toList()
                        )));
        System.out.println(collect);


        //Write a program to print non-repeated characters from a String using HashMap.
        String str = "Programming";

     //   Map<Character, Long> collect1 = str.chars().mapToObj(s -> s).collect(Collectors.groupingBy(str::str, Collectors.counting()));

        Map<Character, Integer> mapInt = new HashMap<>();

        for (char ch : str.toCharArray()) {
            mapInt.put(ch, mapInt.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> i : mapInt.entrySet()) {
            if (i.getValue() == 1) {
                System.out.println(i.getKey());
            }
        }

        List<Integer> list = Arrays.asList(1,2,3,4,1,2,5,6,7);

        Set<Integer> hashSet = new HashSet<>(list);
        //OR
        hashSet.addAll(list);

        System.out.println(hashSet);


//        HashMap<Employee1, Integer> empMap = new HashMap<>();
//
//        empMap.put(emp1, 80);
//        empMap.put(emp2, 60);
//        empMap.put(emp3, 70);

        String subject = "Java,Spring Boot,Microservices";

        String [] stringArray = subject.split(",");
        System.out.println(stringArray);

        for (String i : stringArray) {
            System.out.println(i);
        }

/*
        List<String> listofString = new ArrayList<>(List.of("A","B","C"));

        Iterator<String> itr = listofString.iterator();

        while (itr.hasNext()) {
            String a = itr.next();
            listofString.remove(a);
            System.out.println(itr.next());
        }*/

        Vector<Integer> vector = new Vector<>();
       /* Vector [] v = new Vector[3];
        v[1]=1;
        v[3]=2;
        v[2]=3;*/

        vector.add(5);
        vector.add(1);
        vector.add(3);
        vector.add(2);
        vector.add(4);
        System.out.println(vector);





    }
}
class Employee1 {

    int empCode;
    String empName;
    String deptName;

    Employee1(int empCode, String empName, String deptName) {
        this.empCode=empCode;
        this.empName = empName;
        this.deptName = deptName;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

//    @Override
//    public boolean equals(Object obj) {
//
//        if (this == obj) {
//            return true;
//        }
//        if (this == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        Employee1 emp = (Employee1) obj;
//     //  return empCode = "" ;//&& Object.equals(empName, emp.getEmpName());
//       // return empCode = emp.getEmpCode() && Object.equals(empName, emp.getEmpName());
//        //return super.equals(obj);
//    }

    @Override
    public String toString() {
        return "id: " + empCode + ", name: " + empName + ", department: " + deptName;
    }
}
