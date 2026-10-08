package com.tutorial.LearnCoding;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //Que1 Count the no of digit
        int x = 132424234;
        int count = 0;
        while (x > 0) {
            count++;
            int a = x / 10; // Remaining values 132
            x = a;
        }
        System.out.println(count);

        //Que 2 Print the multiplication table

    //    System.out.println("Please enter the Number for multiple table");
        Scanner sc =  new Scanner(System.in);
//        int num = sc.nextInt();
//
//        for (int i=1; i<=10; i++) {
//            System.out.println(num*i);
//        }

        //Que 3 Tax calculation Program

//        System.out.println("Please enter your Salary");
//
//        int salary = sc.nextInt();
//        int tax = 0;
//        if (salary >= 10000 && salary < 100000) {
//            //Tax is 10 %
//            //salary * 0.10;
//            tax = salary/10;
//            System.out.println("As per your based on salary your tax is  " + tax);
//
//        } else if (salary <= 100000) {
//            //Tax is 20%
//            //salary * 0.20;
//            tax = salary/20;
//            System.out.println("As per your based on salary your tax is  " + tax);
//        } else {
//            // No tax
//            tax = 0;
//            System.out.println("As per your based on salary your tax is  " + tax);
//
//        }


        //Write a program to swap a numbers without using third variable

        int a,b;
        System.out.println("Enter any two numbers");
        Scanner sc1 = new Scanner(System.in);

        a= sc1.nextInt(); //10
        b= sc1.nextInt(); //20

        System.out.println("Before  swapping a: "+ a + " " + "b: " + b);

        a = a+b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping " + a + " "+ b);



    }
}
