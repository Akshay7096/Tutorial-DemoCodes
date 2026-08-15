package com.tutorial.LearnCoding;

public class InnerClassExample {

    public static class Innerclass {
        public String m1() {
            return  "Inner inside m1()";
        }
    }
    public static void main(String[] args) {
        Innerclass inner = new Innerclass();
        System.out.println(inner.m1());

    }
}
