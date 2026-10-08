package com.tutorial.CreationalDesignPattern.Test;
import java.util.Arrays;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        Demo d = new Demo();
        try{
          //  d.list.add("Kira");
            System.out.println("one");
        } finally {
            System.out.println("Final");
        }
    }
}

final class Demo {

    final List<String> list = Arrays.asList("Akshay", "Jello", "Hii");

}
