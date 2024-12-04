package com.vinay.Striver.step3.lec1;

import java.util.ArrayList;
import java.util.List;

public class L14MoveAllZerosEndBF {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int n = 10;
        int[] ans = moveZeros(n,arr);
        for(int i=0;i<n;i++){
            System.out.printf(ans[i]+" ");
        }
        System.out.printf("");
    }

    public static  int[] moveZeros(int n, int[] a){
        //temporary array:
        List<Integer> temp = new ArrayList<>();
        //copy non-zero elements
        //from original -> temp array:
        for(int  i=0;i<n;i++){
            if(a[i] != 0)
                temp.add(a[i]);
        }
        // number of non-zero elements.
        int  nz = temp.size();

        //copy elements from temp
        //fill first nz fields of
        //original array:
        for (int i = 0; i < nz; i++) {
            a[i] = temp.get(i);
        }

        //fill rest of the cells with 0:
        for (int i = nz; i < n; i++) {
            a[i] = 0;
        }

        return a;
    }
}
