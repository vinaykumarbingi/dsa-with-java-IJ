package com.vinay.D10_math_for_dsa;

public class D10_prime {
    public static void main(String[] args) {
//        System.out.println(isPrime(19));
        int n=20;
        for (int i=2;i<=n;i++){
            System.out.println(i+" "+isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
