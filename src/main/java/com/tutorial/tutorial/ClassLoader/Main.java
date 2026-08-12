package com.tutorial.tutorial.ClassLoader;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Test {

    private String name;
    private int rollNo;

    String getName () {
        return name;
    }

    String M2() {
        return "Byee";
    }
}

public class Main {

    public static void main (String[] args) throws Exception {
     Class c = Class.forName("com.tutorial.tutorial.ClassLoader.Test") ;
     System.out.println(c.hashCode());


        Class c1 = Class.forName("com.tutorial.tutorial.ClassLoader.Test") ;
        System.out.println(c1.hashCode());

        Method[] m = c.getDeclaredMethods();

        for (Method m1 : m) {
            System.out.println(m1);
        }

        Field[] fields = c.getDeclaredFields();

        for (Field f : fields) {
            System.out.println(f);
        }



    }
}
