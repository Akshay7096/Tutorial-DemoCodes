package com.tutorial.tutorial.Listproblem;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LinkedlistProgram {

    public static void main (String [] args) {

        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("ABC");
        linkedlist.add("ABCD");
        linkedlist.add("ABCE");
        linkedlist.add("ABCJF");
        System.out.println(linkedlist);

        linkedlist.addFirst("Kire");
        linkedlist.addLast("Bire");
        System.out.println(linkedlist);

         linkedlist.stream().map(String::toUpperCase).forEach(System.out::println);

         List<String> listString = linkedlist.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(listString);

    }
}
