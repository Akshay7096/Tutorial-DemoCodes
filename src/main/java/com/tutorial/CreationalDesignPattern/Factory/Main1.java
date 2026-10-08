package com.tutorial.CreationalDesignPattern.Factory;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

interface Category1 {

    void categoryType ();
}

 class Sports1 implements Category1 {

    @Override
    public void categoryType () {
        System.out.println("Sports1");
    }

 }

class Camera1 implements Category1 {
    @Override
    public void categoryType () {
        System.out.println("Camera1");
    }
}

class Setting1 implements Category1 {
    @Override
    public void categoryType () {
        System.out.println("Setting1");
    }
}

class FactoryC {

    public Category1 category(String str) {
        if (str == null) {
            return null;
        }
        if (str == "Setting1") {
            return new Setting1();
        }
        return null;
    }
}

public class Main1 {
    public static void main(String[] args) {
        FactoryC factory = new FactoryC();
        Category1 c = factory.category("Setting1");
        c.categoryType();

        Set<Integer> set = new HashSet<>();

        set.add(5);
        set.add(4);
        set.add(6);
        set.add(1);
        System.out.println(set);


        String str = "Hello";
        String ar = " ";

        StringBuilder sb = new StringBuilder();

        for (int i=str.length()-1; i >=0; i--) {
            sb.append(str.charAt(i));
//            System.out.print(ar.append(str.charAt(i)));
           // ar.append(str.charAt(i));
        }

        System.out.println(sb.toString());


    }
}
