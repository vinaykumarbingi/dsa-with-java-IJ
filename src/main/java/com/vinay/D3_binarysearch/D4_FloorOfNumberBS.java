package com.vinay.D3_binarysearch;

public class D4_FloorOfNumberBS {
    public static void main(String[] args) {
        // find the greatest less than or equal to target
        // is called floor number
        // if target is 15 , but not pesent so 14 is answer
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(floorbinarySearch(arr,target));
        System.out.println(arr[floorbinarySearch(arr,target)]);
    }
    static int floorbinarySearch(int[] arr, int target){

        if(target < arr[0])
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
        return end;
    }
}
