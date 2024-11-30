package com.vinay.D2_linearSearch;

public class FindMax2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,55,6},
                {7,8,9}
        };
        System.out.println(max(arr));
    }
    public static int max(int arr[][]){
        if(arr.length == 0)
            return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
