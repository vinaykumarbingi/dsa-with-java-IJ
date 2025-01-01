package com.vinay.Striver.step4.lec1;

import java.util.ArrayList;
import java.util.Arrays;

//https://takeuforward.org/data-structure/search-single-element-in-a-sorted-array/
public class L23SearchSingleElementSol2 {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int n = arr.size(); //size of the array.
        int ans = 0;
        // XOR all the elements:
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr =
                new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6));
        int ans = singleNonDuplicate(arr);
        System.out.println("The single element is: " + ans);
    }
}
