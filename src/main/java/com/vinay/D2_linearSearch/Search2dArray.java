package com.vinay.D2_linearSearch;

import java.util.Arrays;

public class Search2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 8;
        System.out.println(Arrays.toString(search(arr,target)));
        //prints row,column
    }
    public static int[] search(int arr[][], int target){
        if(arr.length == 0)
            return new int[]{-1,-1};

        for(int row = 0;row<arr.length ;row++){
            for(int column=0;column<arr[row].length;column++){
                if(target == arr[row][column]){
                    return new int[]{row,column};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
