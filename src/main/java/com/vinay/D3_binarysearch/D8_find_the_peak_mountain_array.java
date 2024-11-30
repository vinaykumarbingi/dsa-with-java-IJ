package com.vinay.D3_binarysearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/
public class D8_find_the_peak_mountain_array {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,10,5,2}));
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
}
