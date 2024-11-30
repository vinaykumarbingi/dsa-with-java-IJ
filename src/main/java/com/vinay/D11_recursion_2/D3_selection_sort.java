package com.vinay.D11_recursion_2;

import java.util.Arrays;

public class D3_selection_sort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int r, int c, int max){
        if(r==0){
            return;
        }
        //find max and swap with last element
        if(c<r){
            if(arr[c]>arr[max]){
                selectionSort(arr,r,c+1,c);
            }else{
                selectionSort(arr,r,c+1,max);
            }

        }else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr,r-1,0,0);
        }
    }
}
