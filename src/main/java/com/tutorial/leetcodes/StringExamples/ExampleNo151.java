package com.tutorial.leetcodes.StringExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExampleNo151 {

    public static void main(String[] args) {

        String str = "a good   example";
      //  String str2 [] = str.split(" \\s");
        String str2 [] = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = str2.length-1; i >=0; i--) {
            System.out.println(str2[i]);
             sb.append(str2[i]); //Append is noting but add() same string inside add
             sb.append(" ");
        }

        String str1 = sb.toString().trim();

        System.out.println("str1 " + str1);


        StringTokenizer st = new StringTokenizer("Java Python");

        System.out.println(st.hasMoreTokens());

        System.out.println(st.nextToken());

        System.out.println(st.hasMoreElements());

        System.out.println(st.nextElement());


        String a =  "  moon fly me ASFDFDSF  to   the ";

        String  [] arrayString = a.split(" ");

        int count = 0;
        StringBuilder sb1 = new StringBuilder();

        System.out.println(arrayString.length);
        for (int i = arrayString.length-1; i >= 0; i --) {

            for (int j = arrayString.length-1; j >0; j--) {

                if (arrayString[j].length() < arrayString[j-1].length()) {
                    if (count < arrayString[j-1].length()) {
                        count = arrayString[j-1].length();
                    }
                }
            }
        }
        System.out.println(count);


        int [] arr = {1,2,3,6,4,5};

//        Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder()).forEach(System.out::print);
       // System.out.println(array);
        //System.out.println(sorted);

        int [] intList = {1,2,3,1,5,6,4};

        Arrays.stream(intList).distinct().boxed().sorted(Comparator.reverseOrder()).forEach(System.out::print);

        List<String> lista = Arrays.asList("CA","Akshay","WER","API","Sring Boot","HR","Akash");

        List<String> collect = lista.stream().filter(s -> s.length() > 3).sorted(Comparator.comparingInt(String::length)).limit(3).collect(Collectors.toList());
        System.out.println(collect);


        String codeStr = "Java is Correct code";

        String s = Arrays.stream(codeStr.split(" ")).reduce((v, b) -> b + " " + v).toString();
        System.out.println(s);
    }
}
