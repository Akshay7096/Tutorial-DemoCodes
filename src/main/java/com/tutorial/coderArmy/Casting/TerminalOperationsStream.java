package com.tutorial.coderArmy.Casting;

import org.apache.xmlbeans.impl.xb.xsdschema.LocalSimpleType;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TerminalOperationsStream {

    public static void main(String[] args) {
        //Terminal Operation

        //1.toList();

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,1,2,3);


        List<Integer> collect = numList.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> listofNum = new ArrayList<>(List.of(1,2,3,4,1,23,4));
        List<Integer> list = listofNum.stream().map(x -> x + 1).toList();
        System.out.println(list);

        Set<Integer> collect1 = listofNum.stream()
                .map(x -> x + 1)
                .collect(Collectors.toSet());
        System.out.println(collect1);

       //GIven list of string need to count of each character

        List<String> listofString = new ArrayList<>(List.of("A","BB","CCC","DDDD","EE"));


        Map<String, Integer> collect2 =
                listofString.stream()
                        .collect(Collectors.toMap(
                                x -> x, x->x.length()
                        ));
                System.out.println(collect2);

        Map<Integer, List<String>> collect3 = listofString.stream().collect(Collectors.groupingBy(l -> l.length(), Collectors.toList()));
        System.out.println(collect3);


    }
}
