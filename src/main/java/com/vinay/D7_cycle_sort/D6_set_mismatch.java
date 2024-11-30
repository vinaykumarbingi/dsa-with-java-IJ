package com.vinay.D7_cycle_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/set-mismatch/
public class D6_set_mismatch {
    public static void main(String[] args) {

        int[] arr = {1,2,2,4};
//        int[] arr = {1,1};
        System.out.println(Arrays.toString(setMismatch(arr)));
    }

    static int[] setMismatch(int[] arr){
        int i = 0;
        while (i<arr.length){

            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index] != index+1){
                return new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
