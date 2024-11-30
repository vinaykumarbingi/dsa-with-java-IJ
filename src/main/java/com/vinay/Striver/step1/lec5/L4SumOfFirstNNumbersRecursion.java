package com.vinay.Striver.step1.lec5;
//https://takeuforward.org/data-structure/sum-of-first-n-natural-numbers/
public class L4SumOfFirstNNumbersRecursion {
    public static void main(String[] args) {
        // Here, let’s take the value of n to be 3.
        int n = 3;
//        func(n,0);

        System.out.println(func2(3));
    }
    static void func(int i, int sum){

        // Base Condition.
        if(i<1){

            System.out.println(sum);
            return;
        }

        // Function call to increment sum by i till i decrements to 1.
        func(i-1,sum+i);


    }

    static int func2(int n){

        // Base Condition.
        if(n == 0){

            return 0;
        }

        // Problem broken down into 2 parts and then combined.
        return n + func2(n-1);


    }
}
