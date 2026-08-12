package com.tutorial.tutorial.Listproblem;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamExample {


    public static void main (String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple",10);
        fruitMap.put("Banana",20);
        fruitMap.put("Orange",30);
        fruitMap.put("Mango",40);
        fruitMap.put("Guava",50);

       /* Stream<Map.Entry<String,Integer>> streamFruit = fruitMap.entrySet().stream();
        streamFruit.forEach(System.out::println);

        //Create stream using keySet();

        Stream<String> keysetMap = fruitMap.keySet().stream();
        keysetMap.forEach(System.out::println);

        Stream<Integer> valueMap = fruitMap.values().stream();
        valueMap.forEach(System.out::println);*/

      /*  String [] arr = {"Apple","Banana","Orange"};

        int [] arra  = new int[1];
        arra[0] = 5;

        System.out.println("arra "+ arra[0]);


        Stream<String> streaArray = Arrays.stream(arr);
        streaArray.forEach(System.out::println);

        Stream<String> arrayStream = Stream.of("Apple","Banana");
        arrayStream.forEach(System.out::println);*/


        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        List<String> listUpperCase = list.stream().peek( (element) -> System.out.println("Before List: "+ element))
                        .map((element) -> element.toUpperCase())
                                .peek((element) -> System.out.println("After map() menthod: " + element)).toList();

        List<String> listOfString = Arrays.asList("1","2","3","4","5","11");

        List<Integer> listInter =  listOfString.stream().map(element -> Integer.valueOf(element)).collect(Collectors.toList());

        System.out.println("listInter "+listInter);




    }
}
