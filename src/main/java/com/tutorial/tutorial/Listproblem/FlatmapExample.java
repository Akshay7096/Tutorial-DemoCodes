package com.tutorial.tutorial.Listproblem;

import java.util.List;

import static java.util.Arrays.asList;

public class FlatmapExample {


    public static void main(String[] args) {

        List<List<String>> empList = List.of(List.of("a,b,d,fer"),
                List.of("23","2234","jgs")
                );

        List<String> list132 = empList.stream().flatMap(list -> list.stream()).toList();
        System.out.print("list132"+list132);


    }
}
