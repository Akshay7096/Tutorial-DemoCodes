package JavaBasicCode.String;

import java.util.Arrays;

public class ReverseString {


    public static void main(String[] args) {

        String str = "Akshay";

        char [] chars = str.toUpperCase().toCharArray();

       int left = 0; int right = chars.length - 1;

       while (left < right) {
           char temp = chars[left];
           chars[left] = chars[right];
           chars[right] = temp;
           left++;
           right--;
       }
        System.out.println(chars);

    }
}
