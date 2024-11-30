package com.vinay.Striver.step1.lec2;
//https://takeuforward.org/pattern/pattern-1-rectangular-star-pattern/
public class Pattern1 {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 0; i < N; i++) {
            // This is the inner loop which here, loops for the columns
            // as we have to print a rectangular pattern.
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }

            // As soon as N stars are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }
}
