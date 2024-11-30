package com.vinay.D9_recursion;

public class D1_Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(6));
        System.out.println(fiboFormula(50));
    }
    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }

    static long fiboFormula(int n){
        return (long)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
