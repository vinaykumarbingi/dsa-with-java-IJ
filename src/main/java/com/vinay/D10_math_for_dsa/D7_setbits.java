package com.vinay.D10_math_for_dsa;

// n= 45, in binary = 101101 , so no of 1 count is 4 = ans

public class D7_setbits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;
        while (n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
