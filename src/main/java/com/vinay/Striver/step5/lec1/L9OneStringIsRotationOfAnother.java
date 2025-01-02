package com.vinay.Striver.step5.lec1;
//https://leetcode.com/problems/rotate-string/description/
public class L9OneStringIsRotationOfAnother {
    public static void main(String[] args) {
        String str = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(str, goal));
    }
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
}
