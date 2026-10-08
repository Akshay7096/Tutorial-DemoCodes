package com.tutorial.leetcodes.StringExamples;

public class ExampleNo_28 {
    public static void main(String[] args) {
      Solution s = new Solution();
      //s.strStr("strbutstr", "str");
        System.out.println(s.strStr("strbutstr", "str"));
        System.out.println(s.strStr("leetcode", "leeto"));
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        for (int i=0; i<haystack.length()-needle.length()+1; i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {

                if (haystack.substring(i, needle.length()+i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
