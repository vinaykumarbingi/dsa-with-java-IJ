package com.vinay.D3_binarysearch;


public class D11_rotated_binary_search_duplicate {
    public static void main(String[] args) {
        int[] arr  = {4,5,6,7,0,1,2};
        System.out.println(findPivotDuplicateArr(arr));
        int target = 0;
        System.out.println(search(arr,target));

    }
    //this will work for duplicate values
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

    static int search(int[] arr, int target){
        int pivot = findPivotDuplicateArr(arr);

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
