package com.vinay.Striver.step3.lec1;

public class L16LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int num = 4;
        int n = arr.length;
        int val = search(arr,n,num);
        System.out.printf("index of val "+val);
    }
    public static int search(int[] arr, int n, int num){
        for(int i=0;i<n;i++){
            if(arr[i] == num){
                return i;
            }
        }

        return -1;
    }
}
