package com.vinay.D10_math_for_dsa;


//decimal
//if 6 base 10 , the no of digits is 1
//for 15 no of digits is 2
//123 no of digits is 3
//
//        binary
//if 6 base 2 , no of digits is 3
//if 16 base 2, no of digits is 5
//if 15 base 2, no of digits is 4


public class D4_number_of_digits {
    public static void main(String[] args) {
        int n = 15;
        int base = 2;
        int ans = (int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
    }
}
