package com.vinay.Striver.step1.lec2;
//https://takeuforward.org/pattern/pattern-6-inverted-numbered-right-pyramid/
public class Pattern6 {
    public static void main(String[] args) {
        int N=5;
        for (int i = 0; i < N; i++)
        {
            // This is the inner loop which loops for the columns
            // no. of columns = (N - row index) for each line here
            // as we have to print an inverted pyramid.
            // (N-j) will give us the numbers in a row starting from 1 to N-i.
            for (int j = N; j > i; j--)
            {
                System.out.print(N-j+1+" ");
            }

            // As soon as numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }
    }
}
