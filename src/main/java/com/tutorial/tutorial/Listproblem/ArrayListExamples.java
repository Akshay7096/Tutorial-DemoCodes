package com.tutorial.tutorial.Listproblem;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListExamples {

    public static void main (String[] args) {

        //Interger of list example for interview perspective we can see
        //1. Remove duplicate and avoid then descending order

       // List<Integer> listofNumber = Arrays.asList(23,4,51,56,77,23,65,69,51);

   /*     Stream<Integer> list  = listofNumber.stream().distinct();
        Stream<Integer> sorted = list.collect(Collectors.toList()).stream().sorted();

        sorted.forEach(System.out::println);*/

        //Optimise way..
//       List<Integer>list= listofNumber.stream().sorted(Comparator.reverseOrder()).distinct().toList();
//       System.out.println("list"+list);

        // System.out.println("listof Sorted" + list);


        //Que2. Find odd numbers and given result gives square
        /*List<Integer> numList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> numOdd = numList.stream().filter((element) -> element % 2 != 0).toList(); //1,3,5,7,9
        List<Integer> finalResult =  numOdd.stream().map((element) -> element*element).toList();//1,9,25,49,81

        List<Integer> result = numList.stream().filter((element) -> element%2!=0).map(element -> element*element).collect(Collectors.toList());

        System.out.print("finalResult  " + finalResult);
        System.out.print("result  " + result);*/


        //Que3 Take list and give only 2nd and 3rd element from the list ..  Hint(to use skip()&limit()..
        /*List<Integer> listNum = Arrays.asList(1,2,3,4);
        List<Integer> listNum1 = listNum.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.print("listNum1 "+listNum1);*/

        List<Integer> listNum = Arrays.asList(20,10,10,45,30,45,5,20);
        Optional<Integer> result = listNum.stream().distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst();
        System.out.print("result "+result);

    }
}
