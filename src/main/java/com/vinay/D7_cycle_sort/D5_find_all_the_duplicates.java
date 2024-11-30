package com.vinay.D7_cycle_sort;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class D5_find_all_the_duplicates {
    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] arr){
        int i = 0;
        List<Integer> list = new ArrayList<>();
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
                list.add(arr[index]);
            }
        }
        return list;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
