package com.tutorial.tutorial.StreamAPIExample.Sorting;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Akshay");
        list.add("Deshmane");
        list.add("Suraj");
        list.add("Kiran");
        list.add("Arvind");
        System.out.println(list);

        list.remove("Suraj");
        System.out.println(list);
    }
}
