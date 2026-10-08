package com.tutorial.leetcodes.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortTheArray {

    public static void main(String[] args) {

//        int [] a = {1,2,4,5,6,3,12,14,10,8};
//
//        for (int i = 0; i < a.length; i++) {
//
//        }

        int a [] = {1,3,5,7}; //assending
        int b [] = {10,8,6,4}; //desc

        int [] result = new int [a.length + b.length];
        int index = 0;

        for (int i=0; i<a.length; i++) {
            result[index++] = a[i];
        }

        for (int j = 0; j< b.length; j++) {
            result[index++] = b[j];
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
        //result need to sort using brute force approach

        for (int i = 0; i<result.length; i++) {

            int temp = 0;

            for (int k=0; k<result.length; k++) {
                for (int j=k+1; j< result.length; j++) {
                   if (result[j] < result[k]) {
                       temp = result[k];
                       result[k] = result[j];
                       result[j] = temp;
                   }
                }
            }
        }
        System.out.println("    ");
        for (int i : result) {
            System.out.print(i + " ");
        }



        //Using stream()
        //Arrays.stream(result).sorted().forEach(System.out::print);









        /*int a [] = {1,3,5,7}; //assending
        int b [] = {10,8,6,4}; //descending

        int result [] = new int [a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            if (i < a.length) {
                System.out.println(a[i]);
                result[i] = a[i];
            }
          //  System.out.print(i);
        }

        for (int j = a.length; j < b.length + a.length; j++) {
            result[j] = b[j];
        }

        for (int i : result) {
            System.out.print(i);
        }*/

    }
}
