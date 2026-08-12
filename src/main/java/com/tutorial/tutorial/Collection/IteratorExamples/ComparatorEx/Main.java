package com.tutorial.tutorial.Collection.IteratorExamples.ComparatorEx;

import javax.naming.Name;
import java.util.Arrays;

public class Main {

    public static void main (String [] args) {
        Car carArray []  = new Car[4];


        carArray [0] = new Car("SUV", "Petrol");
        carArray [1] = new Car("Sedan", "Disel");
        carArray [2] = new Car("HatchBack", "Cng");
        carArray [3] = new Car("Amion", "Cng");

        Arrays.sort(carArray,(Car obj1, Car obj2) -> obj1.Name.compareTo(obj2.Name));



        Arrays.sort(carArray,(Car obj1, Car obj2) -> obj1.Name.compareTo(obj2.Name));

        for (Car i : carArray) {
            System.out.println(i.Name);
        }







































    }
}
