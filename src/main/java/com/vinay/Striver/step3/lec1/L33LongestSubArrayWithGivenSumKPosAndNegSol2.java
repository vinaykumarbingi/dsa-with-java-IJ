package com.vinay.Striver.step3.lec1;

public class L33LongestSubArrayWithGivenSumKPosAndNegSol2 {
    public static int getLongestSubarray(int []a, int k) {
        int n = a.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            int s = 0;
            for (int j = i; j < n; j++) { // ending index
                // add the current element to
                // the subarray a[i...j-1]:
                s += a[j];

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] a = { -1, 1, 1};
        int k = 1;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
