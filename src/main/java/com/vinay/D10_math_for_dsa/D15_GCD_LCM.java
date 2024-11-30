package com.vinay.D10_math_for_dsa;

public class D15_GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4,8));
        System.out.println(lcm(3,7));
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
