package JavaBasicCode.String;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
//        String s = "Hello";
//        String a = "World";
//
//        String c = s+ " " +a;
//        System.out.println("c"+c);


        //Given the string need to count of each character
        String str = "abc$abcdf#";

        Map<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);

         hashMap.compute(ch, (k, v) -> (v == null) ? 1 : ++v);

        }
        System.out.println(hashMap);
        //Using Stream API

        Map<Character, Long> collect = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

//        str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//
//        str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));





       /* String str = "pro21gri434";
        int sum=0;
        for (int i=0; i<str.length();i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.println(sum +"  "+ ch);
                sum = sum + ch - '0';

                //sum += ch - '0';
            }
        }
        System.out.println("Sum of total " + sum);*/

        String [] strarray = {"abc", "abcde", "ab", "abcd","adcdef"};

       // String[] a = strarray.split(",");


        //Given a String to calculate non repeating character this string

        String str3 = "akkshhy";

        Map<Character, Integer> map = new HashMap<>();


//           String str = "swiss";
//
//        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // 2. Find first character whose count is 1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
//        System.out.println("Please enter the Character");
//        Scanner sc  = new Scanner(System.in);
//        char ch = sc.next().charAt(0);
//        System.out.println("ch " + ch);

        //check vowel character or consonent
        //vowel -> AEIOU  else consonent

//        System.out.println("Please enter the character");
//
//        Scanner sc = new Scanner(System.in);
//
//        char ch = sc.next().charAt(0);
//        int ascii = ch;
//
//        System.out.println(ch+ " Ascii values is : " + ascii);
//
//        int a = 97;

//      for(char chc = 'A'; chc <= 'Z'; chc++) {
//          System.out.print(chc + " " );
//      }

        //WAP to calculate power of number

        Scanner sc = new Scanner(System.in);

    /*    int firstNum = sc.nextInt(); //5
        int senNum = sc.nextInt(); //7
        int thirdNum = sc.nextInt(); //2


        if (firstNum > senNum) {
           if (firstNum > thirdNum) {
               System.out.println("first is Big");
           } else {
               System.out.println("third is big");
           }
        } else if (senNum > firstNum) {
            if (senNum > thirdNum) {
                System.out.println("second is Big");
            } else {
                System.out.println("third is big");
            }
        }*/

        //WAP find factorial number
/*
        int num = 5;
        int result = 1;

        for (int i=num; i>=1; i--) {
            result = result * i;
        }
        System.out.println("Facotria is " + result);*/

        int x = 1234;
        int count = 0;
        while (x > 0) {
             x = x/10;
             count ++;
        }
        System.out.println(count);


       List<Integer> numList = Arrays.asList(1,2,3,6,5,4);

        List<Integer> collect1 = numList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect1);


        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("EmpId",101);

        System.out.println(hashMap1.get("EmpId"));



    }
}
