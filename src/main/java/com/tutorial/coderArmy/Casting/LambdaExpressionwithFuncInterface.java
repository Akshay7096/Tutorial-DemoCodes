package com.tutorial.coderArmy.Casting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.apache.commons.collections4.IteratorUtils.forEach;

public class LambdaExpressionwithFuncInterface {

    public static void main(String[] args) {
       // calculator cal = new summing();

        calculator cal = (int a, int b) -> a + b;

        print(5,4, cal);
      //  print(5,4,(a,b) -> a + b);
        //System.out.println( cal.tocalculate(5,10));

        // 4 Core Interfaces

        //Function Types of Interface

        Function<Integer, Integer> func = x -> x + x;

        System.out.println(func.apply(5));

        // Consumer  //Only take value it will no return values

        Consumer<Integer> print1 = x -> System.out.println(x);
        print1.accept(7);

        //Supplier oppo to consumer
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());

        //Predicate

        Predicate<Integer> isEven = (a) -> a%2 == 0;
        System.out.println(isEven.test(5));

        //Iterator

        List<Integer> listInt = new ArrayList<>(List.of(1,23,4,5,6,7,8,1));
        for (Integer i : listInt) {
            System.out.println(i);
        }

        listInt.forEach(System.out::println);
//        List<Integer> listM = Arrays.asList(123,23,2,3,4,5);
//
//        for (Integer j : listM) {
//            System.out.println(j);
//        }

        //List<Integer> listInt = List.of(1,23,4,5,6,7,8,1);

//        Function<Integer, Integer> sumOf = (x) -> x+2;
//        System.out.println(sumOf);





    }

    public static void print (int a, int b,calculator cal) {
        System.out.println(cal.tocalculate(a,b));
    }


}

@FunctionalInterface
interface calculator {
    int tocalculate (int a, int b);
}

//class summing implements calculator {
//    @Override
//    public int tocalculate(int a, int b) {
//        return a + b;
//    }
//}
//
//class multiplication implements calculator {
//    @Override
//    public int tocalculate(int a, int b) {
//        return a * b;
//    }
//}
