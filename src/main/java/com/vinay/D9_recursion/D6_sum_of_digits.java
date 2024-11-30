package com.vinay.D9_recursion;

public class D6_sum_of_digits {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(1111));
    }

    static int sumOfDigit(int n){
        if(n<= 0){
            return 0;
        }
        return sumOfDigit(n/10)+(n%10);
    }
}
