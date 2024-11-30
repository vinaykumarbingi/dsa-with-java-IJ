package com.vinay.D9_recursion;

public class D7_product_of_digits {
    public static void main(String[] args) {
        System.out.println(productOfDigit(1342));
    }

    static int productOfDigit(int n){
        if(n%10 == n){
            return n;
        }
        return productOfDigit(n/10)*(n%10);
    }
}
