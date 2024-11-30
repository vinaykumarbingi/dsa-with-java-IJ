package com.vinay.D9_recursion;

public class D10_countZeros {
    public static void main(String[] args) {
        System.out.println(count(30210,0));
    }

    static int count(int n , int c){
        if(n==0){
            return c;
        }

        int rem=n%10;
        if(rem==0){
            return count(n/10,c+1);
        }
        return count(n/10,c);
    }
}
