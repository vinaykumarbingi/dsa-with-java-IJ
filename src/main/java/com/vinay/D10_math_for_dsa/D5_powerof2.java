package com.vinay.D10_math_for_dsa;

public class D5_powerof2 {
    public static void main(String[] args) {
        int n = 16; // if n = 0 then preint false , check it
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
