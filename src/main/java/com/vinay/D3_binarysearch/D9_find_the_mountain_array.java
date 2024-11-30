package com.vinay.D3_binarysearch;

//https://leetcode.com/problems/find-in-mountain-array/
public class D9_find_the_mountain_array {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5,3,1},3));
    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry  = binarySearch(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }else {
            return binarySearch(arr,target,peak+1,arr.length-1);
        }
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;


        while (start < end){
            int mid = start + (end- start)/2;
            if(arr[mid]> arr[mid+1]){
                // we are in decrease part of arr
                //this maybe ans but check left
                end = mid;
            }else if(arr[mid]< arr[mid+1]){
                //we are in ascending part of arr
                // this may be ans but check right
                start = mid+1;

            }
        }
        //in the end start and end pointing to largest elemet
        return  start; //or return  end;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        boolean ascendingorder = arr[0] <arr[arr.length-1];
        while (start<=end){
            int mid = start + (end-start)/2;

            if(target == arr[mid])
                return mid;
            if(ascendingorder){
                if(target< arr[mid] )
                    end = mid -1;
                else if (target > arr[mid] )
                    start = mid +1;
            }else {
                if(target> arr[mid] )
                    end = mid -1;
                else if (target < arr[mid] )
                    start = mid +1;
            }


        }
        return -1;
    }
}
