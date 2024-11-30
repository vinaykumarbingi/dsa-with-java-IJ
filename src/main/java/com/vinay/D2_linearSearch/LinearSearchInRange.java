package com.vinay.D2_linearSearch;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-3,-4,-5,45,45,56,4,5};
        int target = 4;
        boolean result = linearSearch(arr,target,1,6);
        System.out.println(result);
    }

    //serach in the array
    static boolean linearSearch(int arr[], int target, int start,int end){
        if(arr.length == 0)
            return false;

        for(int index=start; index<=end; index++){
            if(target==arr[index]){
                System.out.println(index);
                return true;
            }

        }

        return false;
    }
}
