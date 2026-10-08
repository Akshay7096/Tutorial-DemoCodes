package com.tutorial.Java8Features;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicatorImple {

    public static void main(String[] args) {
       int x = 11;


       Predicate<Integer> pre = y -> y%2 == 0;

       boolean result = pre.test(x);
        System.out.println(result);
       System.out.println(pre.test(x));

        Object o = "Hello";
        System.out.println(o);

        if (o instanceof String) {
            String s = (String) o;
            System.out.println(s.toUpperCase());
        }
        if (o instanceof String) {
            String s = (String) o;
            System.out.println(s.toUpperCase());
        }






//        int a = 10;
//        Predicate<Integer> checkEven  =   b -> b%2 == 0;
//        System.out.println(checkEven.test(a));
//
//        String str = "anfsdbuce";
//
//        String collect = str.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
//
//        System.out.println(collect);
//        String result = str.chars()
//                .sorted()
//                .mapToObj(c -> String.valueOf((char) c))
//                .collect(Collectors.joining());
//
//        System.out.println(result);
//
//        String str1= "silent";
//        String str2 = "listen";
//
//        char ch [] = str1.toCharArray();
//       char ch1[] = str2.toCharArray();
//
//       Arrays.sort(ch);
//       Arrays.sort(ch1);
//
//        System.out.println(Arrays.equals(ch, ch1));
//
//
//        List<Integer> list = Arrays.asList(1,2,3,4,5,1,2);
//
//        Set<Integer> set = new HashSet<>(list);
//        System.out.println(set);








    }
}
