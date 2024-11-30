package com.vinay.D9_recursion;

import java.util.ArrayList;

public class D14_find_all_indexes {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        System.out.println(findAllIndex(arr,4,0,new ArrayList<>()));
        System.out.println(findAllIndexWithoutParam(arr,4,0));
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }

    static ArrayList<Integer> findAllIndexWithoutParam(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        //it will contains answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> answerFromBelowCalls = findAllIndexWithoutParam(arr,target,index+1);
        list.addAll(answerFromBelowCalls);
        return list;
    }
}
