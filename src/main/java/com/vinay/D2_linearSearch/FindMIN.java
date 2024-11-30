package com.vinay.D2_linearSearch;

public class FindMIN {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-3,-4,-5,45,45,56,4,5};
        System.out.println(min(arr));
    }

    public static  int min(int arr[]){
        if(arr.length == 0)
            return -1;

        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
