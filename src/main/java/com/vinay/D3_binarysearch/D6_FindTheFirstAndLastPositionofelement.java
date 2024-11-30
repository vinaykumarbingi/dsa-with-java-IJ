package com.vinay.D3_binarysearch;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class D6_FindTheFirstAndLastPositionofelement {
    public static void main(String[] args) {

    }

    static int[] binarySearch(int[] nums, int target){

        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] =end;
        return ans;
    }

    //this fun is to return index of target what we want to search
    static  int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while (start<=end){
            int mid = start + (end-start)/2;

            if(target< nums[mid] )
                end = mid -1;
            else if (target > nums[mid])
                start = mid +1;
            else if (target == nums[mid]){
                ans = mid;
                if(findStartIndex == true){
                    end = mid-1;
                }else {
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
