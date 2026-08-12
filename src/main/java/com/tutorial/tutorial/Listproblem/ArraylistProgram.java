package com.tutorial.tutorial.Listproblem;

import java.util.*;
import java.util.stream.Stream;

public class ArraylistProgram {


    public static void main (String [] args) {
       /* ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add(".Net");
        arrayList.add("JavaScript");

        System.out.println(arrayList);*/

      /*ArrayList<String> stringEle = new ArrayList<>();
      stringEle.add("Java");
      stringEle.add("C");
      stringEle.add("C++");
      stringEle.add("MSSQL");*/

      /*List<String> list = Arrays.asList("java","c++","javascript");
        stringEle.stream().forEach(System.out::println);
        for(String str : stringEle) {
            System.out.println(str);
        }*/


      /*  ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Java");
        arrayList.add("JavaScript");
        arrayList.add("React");
        arrayList.add("Python");

        boolean ischeckReact = arrayList.contains("React");
        System.out.println("ischeckReact"+ischeckReact);
        System.out.println(arrayList.contains("React"));
        System.out.print(arrayList.contains("React1"));

        if (arrayList.contains("React")) {
            System.out.println("Found the React");
        }*/

 /*       ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("ABC");
        arrayList.add("CDFG");
        arrayList.add("ZXRE");
        arrayList.add("LMSDF");

        Collections.sort(arrayList);
        System.out.println("arrayList"+arrayList);*/

   /*     ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(34);
        arrayList.add(54);
        arrayList.add(76);
        arrayList.add(2);

        arrayList.stream().distinct().forEach(System.out::print);
       long v =  arrayList.stream().count();
       System.out.println("Total no.of elements"+v);


        Collections.sort(arrayList);
        System.out.println("arrayList "+arrayList);

        Optional<Integer> arraMaxelement = arrayList.stream().max(Integer ::compare);
        System.out.println("arraMaxelement "+arraMaxelement);

        int maxElement = arrayList.stream().max(Integer::compare).get();
        System.out.println("maxElement "+maxElement);

        int sumOfList = arrayList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sumOfList "+sumOfList);*/



        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(68);
        arrayList.add(36);
        arrayList.add(55);
        arrayList.add(11);
        int sum = arrayList.stream().mapToInt(Integer::intValue).sum(); //193

        System.out.print("Sum of Collections " + sum);

        Stream<Integer> streamInt = arrayList.stream();
        System.out.println("streamInt"+streamInt);







    }
}
