package com.vinay.D9_recursion;


//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class D11_steps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    static int numberOfSteps(int num){
        return helper(num,0);
    }

    static int helper(int num, int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}
