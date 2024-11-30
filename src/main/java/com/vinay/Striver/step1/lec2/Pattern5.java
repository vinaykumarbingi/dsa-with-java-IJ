package com.vinay.Striver.step1.lec2;
//https://takeuforward.org/pattern/pattern-5-inverted-right-pyramid/
public class Pattern5 {
    public static void main(String[] args) {
        int N=5;
        for (int i = 0; i < N; i++)
        {
            // This is the inner loop which loops for the columns
            // no. of columns = (N - row index) for each line here.
            for (int j = N; j > i; j--)
            {
                System.out.print("* ");
            }

            // As soon as stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }
}
