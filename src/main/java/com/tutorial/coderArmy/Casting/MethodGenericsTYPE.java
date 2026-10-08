package com.tutorial.coderArmy.Casting;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Parent {
    void m1() {
        System.out.println("It its Parent class");
    }
}

class Child extends Parent {
    void m1() {
        System.out.println("It its Child class");
    }

    void m1 (String str) {
        System.out.println("In M1 String method");
    }

    void m1 (Object obj) {
        System.out.println("In M1-Object ethod");
    }
}

public class MethodGenericsTYPE {

    public static boolean checkDivisibility(int n) {
        int resultofSum = 0;
        int resultofMul = 0;
        int result = 0;


        // int n = 99;

        int first = n / 10;

        int second = n % 10;


        //1st need to do sum

        resultofSum = first + second;

        //2nd need to do mul
        resultofMul = first * second;

        //final result
        System.out.println(resultofSum + " " + resultofMul);

        //if ()
        result = resultofSum + resultofMul;

        if (result == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {


        Child ch = new Child();
        ch.m1(null);
        String str = "asdf";
        Object obj = str;
        System.out.println("obj"+obj);
        ch.m1(obj);


        List<Integer> listofInt = new ArrayList<>();

        listofInt.add(1);
        listofInt.add(2);
        listofInt.add(3);
        listofInt.set(1,4);
        //listofInt.set(5,4); //Exception Occured

        listofInt.addAll(0, List.of(1,2,3,4,5));

        System.out.println("listofInt"+listofInt);

        System.out.println(listofInt.size());


        System.out.println(checkDivisibility(10));

//        Parent p = new Child();
//        p.m1();


        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        for (int i=0; i<list.size(); i++) {
            System.out.println(list);
        }


        //Important Topics
        Iterator<Integer> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            int value = listIterator.next();
            System.out.println(value);
        }


        Object y = (String) getInt("Hello") ;

        System.out.println(y);
    }

     static Object getInt (Object x) {
        return x;
    }
}


