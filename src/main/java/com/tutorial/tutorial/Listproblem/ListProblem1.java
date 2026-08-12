package com.tutorial.tutorial.Listproblem;

import com.tutorial.tutorial.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListProblem1 {

    void listMethod() {
       /*  List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> listOfMul = list.stream().map(n -> n*2).collect(Collectors.toList());
        List<Integer> reverse = listOfMul.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("reverse"+reverse);*/


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list.stream().map(n -> n*2).forEach(System.out::println);

       List<Integer> list1 = list.stream().filter(n -> n*2==0).toList();
        List<Integer> even = list.stream()
                .map(n -> n * 2 )
                .toList();
        System.out.println("levenist1"+even);


    }


    public static void main(String[] args) {
        ListProblem1 list =new ListProblem1();
        list.listMethod();
    }
}
