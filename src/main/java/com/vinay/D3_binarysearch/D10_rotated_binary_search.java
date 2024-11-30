package com.vinay.D3_binarysearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class D10_rotated_binary_search {
    public static void main(String[] args) {
        int[] arr  = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
        int target = 0;
        System.out.println(search(arr,target));

    }
    //this will not work for duplicate values
    static int findPivot(int[] arr){
        int start =  0;
        int end = arr.length-1;
        while (start<= end){
            int mid= start + (end-start)/2;
            //4 cases over here
            if(mid < end && arr[mid] > arr[mid+1]){
                return  mid;
            }
            if(mid > start && arr[mid]< arr[mid-1]){
                    return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else {
                start  = mid+1;
            }
        }
        return -1;
    }

    static int search(int[] arr, int target){
        int pivot = findPivot(arr);

        //if pivot not found then it is not rotated arr
        if(pivot == -1){
            //just do normal binary search
            return binarySearch(arr,target,0,arr.length-1);
        }

        //if we found pivot then we have two ascending parts
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
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
