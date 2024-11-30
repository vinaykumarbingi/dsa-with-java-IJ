package com.vinay.D3_binarysearch;

public class D3_CeilingOfNumber {
    public static void main(String[] args) {
        // find the smallest greater than or equal to target
        // is called celiing number
        // if target is 15 , but not pesent so 16 is answer
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceilingbinarySearch(arr,target));
        System.out.println(arr[ceilingbinarySearch(arr,target)]);
    }
    static int ceilingbinarySearch(int[] arr, int target){

        if(target > arr[arr.length-1])
            return -1;

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
        return start;
    }
}
