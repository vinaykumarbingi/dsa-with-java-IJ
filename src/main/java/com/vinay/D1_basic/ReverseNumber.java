package com.vinay.D1_basic;

public class ReverseNumber {
    public static void main(String[] args) {
//        number: 12345 , reverse: 54321
        int n  = 123456;
        int revNum = 0;
        while (n> 0)
        {
            revNum = (revNum*10 )+ (n %  10);
            n /= 10;
        }
        System.out.println(revNum);
    }
}
