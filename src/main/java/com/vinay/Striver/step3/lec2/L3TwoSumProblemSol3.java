package com.vinay.Striver.step3.lec2;

import java.util.HashMap;

//https://takeuforward.org/data-structure/two-sum-check-if-a-pair-with-given-sum-exists-in-array/
public class L3TwoSumProblemSol3 {
    public static String twoSum(int n, int []arr, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return "YES";
            }

            mpp.put(arr[i], i);
        }
        return "NO";
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }

}
