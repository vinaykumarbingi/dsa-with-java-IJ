package com.vinay.Striver.step1.lec5;
//https://takeuforward.org/recursion/print-1-to-n-using-recursion/
public class L2PrintNumbersRecursion {
    public static void main(String[] args) {
        // Here, let’s take the value of n to be 4.
        int n = 4;
        func(1,n);

        funcNto1(n,n);
    }
    static void func(int i, int n){

        // Base Condition.
        if(i>n) return;
        System.out.println(i);

        // Function call to print i till i increments to n.
        func(i+1,n);

        System.out.println(i);

    }

    static void funcNto1(int i, int n){

        // Base Condition.
        if(i<1) return;

        System.out.println(i);

        // Function call to print i till i decrements to 1.
        funcNto1(i-1,n);

    }
}
