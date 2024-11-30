package com.vinay.D10_math_for_dsa;

public class D1_odd_or_even {
    public static void main(String[] args) {
        int n=67;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n) {
        return (n&1)==1;
    }
}
