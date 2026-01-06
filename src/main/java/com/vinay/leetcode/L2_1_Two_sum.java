package com.vinay.leetcode;

public class L2_1_Two_sum {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{1, 2},3);
        System.out.println(result[0]+" "+result[1]);
    }
}

//https://leetcode.com/problems/two-sum/description/
