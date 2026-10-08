package com.tutorial.tutorial.StreamAPIExample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementCheck {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,1,4,5,6,2,7,7);
        List<String> listStr = Arrays.asList("Hello","World","Apple", "Banana","Hello");

        //Question 1 Given List avoide Duplicate element fron the lisst using java 8 stream

        Set<Integer> setInt = new HashSet<>();
        Set<Integer> collect = list.stream().filter(n -> !setInt.add(n)).collect(Collectors.toSet());
        Set<Integer> collect1 = list.stream().filter(n -> setInt.add(n)).collect(Collectors.toSet());
        System.out.println("collect"+collect);
        System.out.println("collect1"+collect1);

        Set<String> strSet = new HashSet<>();
        Set<String> collect2 = listStr.stream().filter(str -> !strSet.add(str)).collect(Collectors.toSet());
        System.out.println("collect2"+collect2);

        List<String> collect3 = listStr.stream().distinct().map(ele -> ele).collect(Collectors.toList());
        System.out.println("collect3"+collect3);


        //Duplicate element check in a list using the stream


       // 21. Coding Question: Find the frequency of each word in a sentence using Java 8.

        String str = "Fear leads to anger , anger leads to heared , heared leads to conflict , Conflict leads to suffering";

        String [] strArray = str.split(" ");

        Map<String, Long> collect4 = Arrays.stream(strArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("collect4"+collect4);


        byte a =14;
        byte b = 13;
        int c = a+b;
        System.out.println(a+b);


        List<Integer> intList = Arrays.asList(1,23,4,5,1,3,5,4,6);

        Set<Integer>  setInt1 = new HashSet<>();

        Set<Integer> collect5 = intList.stream().filter(e -> !setInt1.add(e)).collect(Collectors.toSet());
        System.out.println("collect5"+collect5);


    }

}
