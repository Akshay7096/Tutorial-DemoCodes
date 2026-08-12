package com.tutorial.leetcodes.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Example1 {


    //Given two array combine and mearge with sequence order


    public static void main(String[] args) {

//        int [] nums1 = {1,2,3,0,0,0};
//        int nums2 [] = {2,5,6};
//        int m = 3;
//        int n = 3;

        int [] nums1 = {0};
        int m = 0;
        int [] nums2 = {1};
        int n = 1;

        IntStream stream1 =Arrays.stream(nums1,0,m);
        IntStream stream2 = Arrays.stream(nums2);

        IntStream concat = IntStream.concat(stream1, stream2).sorted();
        concat.forEach(System.out::print);


//        int [] nums1 = {1,2,3,0,0,0};
//        int m = 3;
//        int nums2 [] = {2,5,6};
//        int n = 3;
//        int [] result = new int[6];
//        int index = m + n - 1;
//        int i = m-1;
//        int j = n-1;
//
//        while (i >= 0 && j >= 0) {
//            if (nums1[i] > nums2[j]) {
//                nums1[index--] = nums1[i]
//            }
//        }



        /* for (int i = 0; i < a.length; i++) {

             for (int j = 0; j < b.length; j++) {

                 if (a[i] < b[j]) {
                   result[i] =  a[i];
                 } else if (a[i] == b[j]) {
                     result[i]=a[i];
                     result[i+1]=b[j];
                     i++;
                     break;
                 } else if (a[i] < b[j]) { {
                     System.out.println("b[j] "+b[j]);
                     System.out.println("i "+i);
                     result[i]=b[j];
                 }
                *//* if (a[i] != 0 ) {
                     if (a[i] < b[j]){
                         result[i] = a[i];
                         break;
                     } else if (a[i] == b[j]) {
                         result[i] = b[j];
                         result[i] = a[i];
                         break;
                     } else {
                         result[i] = b[j];
                         break;
                     }
                 } else {
                     result[i] =  b[j];
                 }*//*
             }
         }*/

//         for (Integer i : result) {
//             System.out.println(i);
//         }


    }
}
