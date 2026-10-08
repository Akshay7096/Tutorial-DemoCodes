package JavaBasicCode.String;

import java.nio.Buffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TocheckPelindrome {


    public static void main(String[] args) {
        String str = "Programming";

        String result = new StringBuilder(str).reverse().toString();

        if (str.equals(result)) {
            System.out.println("Given String is pelindrome");
        } else {
            System.out.println("Given String is Not pelindrome");
        }

        //How to reverse the String

        String string = "Hello";
        StringBuilder sb = new StringBuilder(string);

        String rev = sb.reverse().toString();
        System.out.println(rev);

       //Give str length()

        String str1 = "Hello";
        int count = 0;
        //String [] strArray =
        for (int i = 1; i <= str1.length(); i++) {
            count = i;
        }
        System.out.println(" " +  count);
        System.out.println(" " +  str1.length());

        //Given String count of character

        String pro = "Programmming";

        Map<Character, Integer> hashmap = new HashMap<>();

        for (char ch : pro.toCharArray()) {
         hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
        }
        System.out.println(hashmap);

        //Using Stream API
        Map<Character, Long> map = str.chars()
                                    .mapToObj(c -> (char) c)
                                    .collect(Collectors.groupingBy(
                                            Function.identity(),
                                            Collectors.counting()
                                    ));

        System.out.println(map);

        //Swap the numer withou using 3rd variable


        int a = 5;
        int b = 10;

        a = a + b;  //15
        b = a-b;  //15 -10 = 5
        a = a-b; //15- 5 = 10

        System.out.println(a +"  "+b);


        //WAP to count the number of words in a string using HashMap

        String input = "Hello My Name is Akshay";
        Map<String, Integer> wordCount = new HashMap<>();
        String [] strAtt = input.split("\\s+");
        for (String i :  strAtt) {
            wordCount.put(i, wordCount.getOrDefault(i, 0) + 1);
        }
        System.out.println(wordCount);


        String str2 = "Programming";

        System.out.println(str2.substring(1,11));

        //Q12. How do you convert a string to an integer in Java?

        String strNum = "1234";

        int i = Integer.parseInt(strNum);

        System.out.println(i+10);

        //Q13.  How do you reverse a string in Java?
        String reverseString = "Hello";

        StringBuilder sc = new StringBuilder(reverseString).reverse();
        System.out.println(sc);

        //How to check String is empty or not

        String colur = "";
        String colur1 = null;
        String colur2 = "Red";
        //colur1.isEmpty()  if colur1 is null and well chec isEmpty() because of Exception (NullPointerException) occured
        System.out.println(colur.isEmpty()+ " " +colur1.isEmpty() +" "+ colur2.isEmpty());




    }
}
