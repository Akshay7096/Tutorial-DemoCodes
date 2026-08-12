package com.tutorial.tutorial.Collection.IteratorExamples;
import java.util.*;
public class IteratorPractice
{

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int val = iterator.next();
            System.out.println(val);
            if (val == 3) {
                iterator.remove();
            }
        }

        for (int i : list) {
            System.out.println(i);
        }

        list.forEach((Integer i) -> System.out.println(i));

    }



}
