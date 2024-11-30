package com.vinay.D2_linearSearch;
//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] allpeopleaccounts = {
                                        {1,5}, //person 1 accounts & amount
                                        {7,3}, //person 2 accounts & amount
                                        {3,5}  //person 3 accounts & amount
                                    };
        System.out.println(maximumWealth(allpeopleaccounts));
    }
    static int maximumWealth(int[][] allpeopleAccounts){
        int max = 0;
        for(int[] accounts: allpeopleAccounts){
            int sum =0 ;
            for(int amount:accounts){
                sum +=amount;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
