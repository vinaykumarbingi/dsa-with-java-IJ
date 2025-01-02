package com.vinay.Striver.step5.lec1;
//https://leetcode.com/problems/largest-odd-number-in-string/description/
public class L6LargestOddNumberInString {
    public static String largestOddNumber(String num) {
        int i=num.length()-1;
        while(i>=0){
            int n=num.charAt(i);
            if(n%2==1) return num.substring(0,i+1);
            i--;
        }
        return "";
    }

    public static void main(String[] args) {
        String str = "52";
        System.out.println(largestOddNumber(str));
        String str1 = "4206";
        System.out.println(largestOddNumber(str1));
        String str2= "35427";
        System.out.println(largestOddNumber(str2));
    }
}
