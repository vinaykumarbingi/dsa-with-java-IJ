package com.vinay.Striver.step3.lec1;

import java.util.ArrayList;

//https://takeuforward.org/data-structure/union-of-two-sorted-arrays/
public class L19UnionOfTwoSortedArraySol3 {
    public static void main(String[] args) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = findUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }

    static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m){
        int i = 0, j = 0; // pointers
        ArrayList<Integer > union=new ArrayList<>();

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (union.size() == 0 || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (union.size() == 0 || union.get(union.size()-1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }

        while (i < n) // IF any element left in arr1
        {
            if (union.get(union.size()-1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }

        while (j < m) // If any elements left in arr2
        {
            if (union.get(union.size()-1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
        return union;
    }
}
