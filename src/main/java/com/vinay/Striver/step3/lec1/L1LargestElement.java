package com.vinay.Striver.step3.lec1;

import java.util.Arrays;

//https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/
public class L1LargestElement {
    public static void main(String args[]) {

        int arr1[] =  {2,5,1,3,0};
        System.out.println("The Largest element in the array is: " + sort(arr1));

        int arr2[] =  {8,10,5,7,9};
        System.out.println("The Largest element in the array is: " + sort(arr2));
    }
    static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
