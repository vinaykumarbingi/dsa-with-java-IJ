package com.vinay.Striver.step3.lec1;
//https://takeuforward.org/data-structure/rotate-array-by-k-elements/
public class L12RotateArrayByKApproach1 {
    public static void Rotatetoright(int[] arr, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
    public static void Rotatetoleft(int[] arr, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }
    public static void main(String args[]) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        Rotatetoright(arr, n, k);
//        Rotatetoleft(arr, n, k);
        System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
