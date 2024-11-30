package com.vinay.D10_math_for_dsa;

public class D2_find_unique {
    public static void main(String[] args) {
        int arr[]={2,3,3,4,2,6,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n:arr){
            unique ^= n;
        }
        return unique;
    }
}
