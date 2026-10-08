package com.tutorial.LearnCoding;

public class Main {

    public static void main(String[] args) {

        Outerclass.Innerclass out = new Outerclass.Innerclass();
        System.out.println(out.m1());
    }
}

class Outerclass {
     static class Innerclass {
        String m1() {
            return "Innter inside m1()";
        }
    }
}
