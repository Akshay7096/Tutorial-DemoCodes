package com.tutorial.leetcodes.StringExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.tutorial.leetcodes.StringExamples.Person.*;

public class Preactice02Sept {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(10000,20000,32000,55000);

        List<Integer> peekedAtNumbers = numList.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(peekedAtNumbers);



        int sumofSalary = numList.stream().mapToInt(salary -> salary).sum();
        System.out.println(sumofSalary);

        List<Integer> collect = numList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        //Count
        long countofList = numList.stream().count();
        System.out.println(countofList);

        //Given list get first name
        //Problem: Extract first names from a list of full names.

        List<String> listOf = Arrays.asList("Hello My Name is Akshay");

        List<String> collect1 = listOf.stream().map(str -> str.split(" ")[0]).collect(Collectors.toList());
        System.out.println(collect1);

        // FlatMap for Nested Lists
        //Problem: Flatten a nested list structure.

        List<List<Integer>> flatMap = Arrays.asList(
                List.of(1,2,3),
                List.of(4,5)
                );

        System.out.println(flatMap);

        List<Integer> collect2 = flatMap.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(collect2);


        List<Person> listOfPerson = Arrays.asList(
                new Person(1, "Akshay", 28),
                new Person(2, "Suraj", 26),
                new Person(3, "Kiran", 20)
        );

        Map<Integer, List<Person>> collect3 = listOfPerson.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.toList()));

        System.out.println(collect3);


    }
}

class Person {

      private int id;
      private String name;
      private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person(int id, String name, int age) {
           this.id = id;
           this.age = age;
           this.name = name;
       }

       @Override
        public String toString() {
           return  "id: " + id + ", Name: " + name + ", Age" + age;
       }

//    @Override
//    public String toString() {
//        return "id: " + empCode + ", name: " + empName + ", department: " + deptName;
//    }


}
