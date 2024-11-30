package com.vinay.D3_binarysearch;

public class D1_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,12,23,44};
        int target = 12;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            int mid = start + (end-start)/2;

            if(target< arr[mid] )
                end = mid -1;
            else if (target > arr[mid])
                start = mid +1;
            else if (target == arr[mid])
                return mid;
        }
        return -1;
    }
}
