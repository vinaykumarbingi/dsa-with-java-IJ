package com.vinay.Striver.step3.lec1;
//https://takeuforward.org/data-structure/check-if-an-array-is-sorted/
public class L6CheckIfArraySortedBF {
    static boolean isSorted(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5}, n = 5;

        System.out.println(isSorted(arr, n));
    }
}
