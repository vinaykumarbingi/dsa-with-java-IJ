package com.vinay.D3_binarysearch;

public class D2_OrderAgnasticBS {
    public static void main(String[] args) {
        int[] arrAsc = {2,3,4,5,6,12,23,44};
        int target1 = 12;
        int[] arrDesc = {44,34,31,30,8,7,6,5};
        int target2 = 31;
        System.out.println(binarySearch(arrAsc,target1));
        System.out.println(binarySearch(arrDesc,target2));
    }
    static int binarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length -1;
        boolean ascendingorder = arr[0] <arr[arr.length-1];
        int start = 0;
        int end = arr.length -1;
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
