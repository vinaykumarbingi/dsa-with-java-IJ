package com.vinay.D3_binarysearch;

public class D12_rotation_count {
    //find the how many times the array is rotated
    // ans always pivot +1
    public static void main(String[] args) {
        int[] arr  = {4,5,6,7,0,1,2};
//        int[] arr  = {0,1,2,4,5,6}; no rotation
        if(findPivot(arr) == -1)
            System.out.println("no rotation");
        else
            System.out.println(findPivot(arr)+1);
    }

    // use this for non dupliacates
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

    // use this for dupliacates
    static int findPivotDuplicateArr(int[] arr){
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
            // if elements ot middle, start and end are equal then skip duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                //check if end is pivot
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted so pivot be right
            else if (arr[start] <arr[mid] || (arr[start] == arr[mid] && arr[mid] >arr[end])){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
