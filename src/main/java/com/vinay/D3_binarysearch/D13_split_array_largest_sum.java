package com.vinay.D3_binarysearch;

public class D13_split_array_largest_sum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k =2;
        System.out.println(splitArray(nums,k));
    }

    public static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;
        for(int i=0;i<nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        //binary search
        while (start < end){
            //try for mid for potiential ans
            int mid = start + (end-start)/2;

            //calculate how many pieces can divide with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum +num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces >m){
                start = mid+1;
            }else{
                end = mid;
            }
        }

        return end; //here start = end
    }
}
