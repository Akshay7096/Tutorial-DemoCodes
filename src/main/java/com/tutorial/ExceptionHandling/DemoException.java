package com.tutorial.ExceptionHandling;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoException {

    static  public  void main(String[] args) {
        ExceptionHandling eh = new ExceptionHandling();
        eh.m1();

        //Object -> AbstractCollection -> AbstractList -> ArrayList
        AbstractCollection<Integer> abstractCollection = new ArrayList<>();
        AbstractList<Integer> abstactList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        list.add(1);
        System.out.println(list);
         int x;
      //  x =10;
     //   System.out.println(x);

        ArrayList<ArrayList<Integer>> flatList = new ArrayList<>();

        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);

        flatList.add(array);
        System.out.println(flatList);

        String str = "Hello";

        String str1 = new String("Hello");
        System.out.println(str1 == str);
        System.out.println(str.equals(str1));


        //Using Stream API find duplicate elements from arrays
        List<Integer> listofInt = Arrays.asList(1,2,3,4,5,1,2,6,7,4);

        Set<Integer> setDupl = new HashSet<>();

        Set<Integer> duplicate = listofInt.stream().filter(num ->  !setDupl.add(num)).collect(Collectors.toSet());
        System.out.println(duplicate);


        List<Integer> list1 = Arrays.asList(1,2,3,4,4,5,6,1,2,3);

        Set<Integer> set = new HashSet<>();

        Set<Integer> duplicate1 = list1.stream().filter(num -> !set.add(num)).collect(Collectors.toSet());
        System.out.println(duplicate1);

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

       List<Integer> result =  numList.stream().filter(num -> num >= 11 && num <=15).collect(Collectors.toList());
        System.out.println(result);


     //   IntStream.rangeClosed(1, 100);


        IntStream.rangeClosed(0,100).filter(n -> n >= 80 && n <= 90).forEach(System.out::println);

        String base = "abcdefg";

        String input = "defgabc";

        String doubled = base + base;

        System.out.println(doubled.contains(input));

        if (doubled.contains(input) && input.length() == base.length()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }



        String wordsString = "Hello123@World*#$45";

        StringBuilder chars = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder spec = new StringBuilder();

        for (int i = 0; i < wordsString.length(); i++) {

            if(Character.isDigit(wordsString.charAt(i))) {
                number.append((wordsString.charAt(i)));
            } else if (Character.isLetter((wordsString.charAt(i)))) {
                chars.append((wordsString.charAt(i)));
            } else {
                spec.append((wordsString.charAt(i)));
            }

        }
        System.out.println(chars);
        System.out.println(number);
        System.out.println(spec);


        List<Integer> numbers = Arrays.asList(1,2,3,6,4,8,5);

        numbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::print);


    }
}
class ExceptionHandling{

    void m1() {


        try {
            int [] x = null;
            int a = x.length;
        }  catch (ArithmeticException e) {
            System.out.println("Its Handles");
        } catch (Exception ex) {
            System.out.println("Hii");
        }
    }
}
