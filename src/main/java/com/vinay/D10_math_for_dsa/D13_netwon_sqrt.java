package com.vinay.D10_math_for_dsa;

public class D13_netwon_sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(double n){
        double x=n;
        double root;
        while (true){
            root = 0.5*(x+(n/x));
            if(Math.abs(root-x)<0.5){
                break;
            }
            x=root;
        }
        return root;
    }
}
