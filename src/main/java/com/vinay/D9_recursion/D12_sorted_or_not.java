package com.vinay.D9_recursion;

public class D12_sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8};
        System.out.println(sortedOrNot(arr,0));
    }

    static boolean sortedOrNot(int[] arr, int index){
        //base condition
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1]  && sortedOrNot(arr,index+1);
    }
}
