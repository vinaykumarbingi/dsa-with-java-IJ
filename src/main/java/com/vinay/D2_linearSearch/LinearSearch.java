package com.vinay.D2_linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-3,-4,-5,45,45,56,4,5};
        int target = 56;
        int result = linearSearch(arr,target);
        if(result == -1)
            System.out.println("not found");
        else
            System.out.println("index: "+result+" value: "+arr[result]);
    }

    //serach in the array
    static int linearSearch(int arr[], int target){
        if(arr.length == 0)
            return -1;

        for(int index=0; index<arr.length; index++){
            if(target==arr[index])
                return index;
        }

        return -1;
    }
}
