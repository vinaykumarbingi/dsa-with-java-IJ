package com.vinay.Striver.step1.lec5;
//https://takeuforward.org/recursion/print-name-n-times-using-recursion/
public class L1PrintNameRecursion {
    public static void main(String[] args) {
        // Here, let’s take the value of n to be 4.
        int n = 4;
        func(1,n);
    }
    static void func(int i, int n){

        // Base Condition.
        if(i>n) return;
        System.out.println(i+"Vinay");

        // Function call to print till i increments.
        func(i+1,n);

//        System.out.println(i+"Vinay");

    }
}
