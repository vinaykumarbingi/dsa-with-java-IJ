package com.vinay.D4_bubble_sort;

import java.util.Arrays;

public class D1_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the seteps n-1 times
        for(int i=0;i<arr.length;i++){
            swapped = false;
            //for each step, max item will come at the last repective index
            for(int j=1;j<arr.length-i;j++){
                //swap if the item is smaller than the previous item
                if(arr[j]< arr[j-1]){
                    //swap
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            //if you did not swapped for particular i , it means array is sorted
            //hence stop the program
            if(!swapped){ // or swapped == false;
                break;
            }
        }
    }
}
