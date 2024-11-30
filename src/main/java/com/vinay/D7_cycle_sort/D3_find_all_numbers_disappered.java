package com.vinay.D7_cycle_sort;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class D3_find_all_numbers_disappered {
    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));

    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i<arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //search for missing numbers
        List<Integer> list=  new ArrayList<>();
        for (int index=0;index<arr.length;index++){
            if(arr[index] != index+1){
                list.add(index+1);
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
