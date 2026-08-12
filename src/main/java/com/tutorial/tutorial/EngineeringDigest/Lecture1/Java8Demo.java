package com.tutorial.tutorial.EngineeringDigest.Lecture1;

import org.apache.xmlbeans.impl.soap.SOAPPart;

import javax.swing.*;
import java.net.SocketOption;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Java8Demo {

    public static void main(String[] args) {


//        Thread t1 = new Thread(()-> {
//                    System.out.print("Hello");
//                }
//        );
//        t1.run();


        MathOperation sumOperation = (a, b) -> a + b;  // This is function, we can treat as a variable
        MathOperation subOperation = (a, b) -> a - b;

        MathOperation sumOF = (int a, int b) -> a + b;
        MathOperation subOF = (int a, int b) -> a - b;
        MathOperation mulOF = (a, b) -> a * b;
        int rs = mulOF.operation(5,4);
        System.out.println(rs);

        //Predicate --> Functional interface (Boolean Valued function)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> startCheck = x-> x.toLowerCase().startsWith("a");
        Predicate<String> endCheck = x-> x.toLowerCase().endsWith("y");
        Predicate<String> result = startCheck.and(endCheck);
        System.out.println(result.test("Akshay"));


        //Function to work for you
        Function<Integer, Integer> doubleIt = x -> x*2;
        Function<Integer, Integer> tripleIt = x -> x*3;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.compose(tripleIt).apply(20)); //compose are right to left excecute 1.tripleIt and then 2.doubleIt
        System.out.println(doubleIt.apply(100));

        //It retrun same value when we can call
        Function<Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(5);
        System.out.println("res "+res);

        //Consumer

        Consumer <Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(51);

        //Supplier

        Supplier<String> str = () -> "Hello World";
        System.out.println(str.get());

        //Method Reference

        List<String> list = Arrays.asList("Akhsay","Test","XYA");
        list.forEach(x-> System.out.println(x));
        list.forEach(System.out::println);

        //Constructor Referrence
        List<String> list2 = Arrays.asList("Samsung", "Apple", "Nokia");

        //List<Mobile> mobilePhoneList = list2.stream().map(m-> new Mobile(m)).collect(Collectors.toList());
        List<Mobile> mobilePhoneList = list2.stream().map(Mobile::new).collect(Collectors.toList());
        for (Mobile i : mobilePhoneList) {
            System.out.println(i.getName());
        }



        sumOfNo sum = (int a, int b) -> a+b;

        System.out.println(sum.sumofthe(4,5));


    }
}

class Mobile{
    private String name;
    public Mobile (String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
}

//class Task implements Runnable {
//    public void run() {
//        System.out.print("Hello");
//    }
//}


interface MathOperation {
     int operation (int a, int b);
}

interface sumOfNo {
    int sumofthe(int a, int b);
}
