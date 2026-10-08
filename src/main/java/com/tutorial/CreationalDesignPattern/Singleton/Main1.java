package com.tutorial.CreationalDesignPattern.Singleton;

public class Main1 {
    public static void main (String [] args) {
        Singleton1 s1 = Singleton1.getInstance();


        Singleton1 s2 = Singleton1.getInstance();
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());

    }
}


class Singleton1 {


    private Singleton1() {
        System.out.println("Hello");
    }

    private static Singleton1 instance;

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }


}
