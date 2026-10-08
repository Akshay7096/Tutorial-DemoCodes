package com.tutorial.leetcodes.StringExamples;

public class ExampleNo_58 {
    public static void main(String[] args) {
        //Example Leet Code 58 Given Example return the count hows last string count

        String s = " Hello World ";

        String str = s.trim();

        int count = 0;

       /* Note
        for (int i = str.length()-1; i >=0; i--) {
            if (str.charAt(i) != "") its "" or '' because char ' ' (extra spance need to gives) not working ne {*/

        for (int i = str.length()-1; i >=0; i--) {
            if (str.charAt(i) != ' ') {
                count ++ ;
            } else {
                break;
            }
        }
        System.out.println("result "+count);
    }
}
