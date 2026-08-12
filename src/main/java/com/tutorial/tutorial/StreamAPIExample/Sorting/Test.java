package com.tutorial.tutorial.StreamAPIExample.Sorting;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        //Unique character
        String str = "aabccKKYweYrhh";
        System.out.println(str.length());

        /*for (int i=0; i<str.length();i++){
            boolean unique= false;

            for (int j=0; j<i; j++) {
                if (str.toUpperCase().charAt(i) != str.toUpperCase().charAt(j)) {
                    unique = true;
                } else {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                System.out.print(str.charAt(i) + " ");
            }
        }*/

      //not repeated like a chacter only give return

       /* String str1 = "aabccKKYweYrhh";
        for (int i = 0; i < str1.length(); i++){
            int count = 0;

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(str1.charAt(i)+"");
            }
        }*/

        //Using Stream API

        String string = "AABccFFsR";

        string.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() ==1).map(Map.Entry::getKey).forEach(System.out::println);



    }
}
