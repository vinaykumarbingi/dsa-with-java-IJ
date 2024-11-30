package com.vinay.D8_patterns;

//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *

public class D2_pattern {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
