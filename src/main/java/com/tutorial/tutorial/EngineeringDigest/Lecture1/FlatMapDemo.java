package com.tutorial.tutorial.EngineeringDigest.Lecture1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {
        List<List<String>> flatMap = Arrays.asList(
          Arrays.asList("Apple","Kiwi"),
          Arrays.asList("Watermillan","Guava"),
          Arrays.asList("Pinaple","Stawberry")
        );

        String s = flatMap.get(1).get(1);
        System.out.println(s);

        List<String> list = flatMap.stream().flatMap(x -> x.stream()).sorted(Comparator.reverseOrder()).toList();
        System.out.println("list "+list);
    }
}
