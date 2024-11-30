package com.vinay.D1_basic;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //1
        int max = a;
        if(b > max)
            max = b;
        if(c> max)
            max=c;
        System.out.println(max);

        //2
        int m = Math.max(c,Math.max(a,b));
        System.out.println(m);
    }

}
