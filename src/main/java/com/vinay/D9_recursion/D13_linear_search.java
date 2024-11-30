package com.vinay.D9_recursion;

public class D13_linear_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target=5;
        System.out.println(linearSearch(arr,target,0));
        System.out.println(linearSearchReturnIndex(arr,target,0));
        System.out.println(linearSearchReturnIndexFromLast(arr,target,arr.length-1));
    }

    static boolean linearSearch(int[] arr, int target, int index){

        if(index == arr.length){
            return false;
        }

        return arr[index] == target || linearSearch(arr,target,index+1);
    }

    static int linearSearchReturnIndex(int[] arr, int target, int index){

        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
        return  linearSearchReturnIndex(arr,target,index+1);
        }
    }

    static int linearSearchReturnIndexFromLast(int[] arr, int target, int index){

        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return  linearSearchReturnIndexFromLast(arr,target,index-1);
        }
    }
}
