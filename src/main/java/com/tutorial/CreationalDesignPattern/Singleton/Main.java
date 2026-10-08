package com.tutorial.CreationalDesignPattern.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
       System.out.println(s1.v1());

    }
}

class Singleton {

    private Singleton () {
        System.out.println("To call from private constructor");
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance= new Singleton();
        }
        return instance;
    }

    public String v1() {
        return "In v1 Instance";
    }
}
