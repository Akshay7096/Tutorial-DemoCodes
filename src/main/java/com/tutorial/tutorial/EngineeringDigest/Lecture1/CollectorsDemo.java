package com.tutorial.tutorial.EngineeringDigest.Lecture1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

    public static void main(String[] args) {
        List<String> nameofList = Arrays.asList("Akshay","PQR","XYZ","PPRO");

        ArrayDeque<String> collect = nameofList.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println("collect"+collect);


        String str ="afsd";


   //     str.length();
//        System.out.println();
//
//        System.out.println(String.valueOf(x).length());




        int x = 100;
        int count = 0;

        while (x != 0) {
            x = x / 10;
            count++;
        }

        System.out.println(count);

        //Given string (sentence repeated wolrd count)

        String world = "Hello World Hello Java World";
        Map<String, Long> collect1 = Arrays.stream(world.split(" ")).collect(Collectors.groupingBy(d -> d, Collectors.counting()));
        Map <String, Long> countrep = Arrays.stream(world.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect1);


        //create a map from string element fruits total count (Sum)..

        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Apple",10);
        hashMap.put("Banana",15);
        hashMap.put("Stwoberry",20);
        hashMap.put("Guava",40);

        Integer collect2 = hashMap.values().stream().collect(Collectors.summingInt(v -> v));



        System.out.println(collect2); //85

        Optional<Integer> reduce = hashMap.values().stream().reduce(Integer::sum);
        System.out.println(reduce);// Optional[85]

        Collection<Integer> values = hashMap.values();
        Collection<String> key = hashMap.keySet();
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet(); //entrySet() means both key and value we can return
                                                                      //keySet() means only key will return
                                                                      //values() means only value we can return ..

        System.out.println(values); //[20, 40, 10, 15]
        System.out.println(key); //[Stwoberry, Guava, Apple, Banana]
        System.out.println(entries); //[Stwoberry=20, Guava=40, Apple=10, Banana=15]


        String world1 = "Hello World Hello Java World";
        System.out.println(Arrays.stream(world.split(" ")).distinct().collect(Collectors.toMap(d->d,d -> d.length(),(a, b) -> a))); //distinct() and(a, b) -> a both are same
            //o/p  {Java=4, Hello=5, World=5}
    }
}
