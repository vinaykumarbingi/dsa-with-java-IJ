package com.vinay.Striver.step1.lec2;

//https://takeuforward.org/pattern/pattern-3-right-angled-number-pyramid/
public class Pattern3 {
    public static void main(String[] args) {
        int N=5;
        for (int i = 1; i <= N; i++)
        {
            // This is the inner loop which loops for the columns
            // no. of columns = row number for each line here.
            // Here, we print numbers from 1 to the row number
            // instead of stars in each row.
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }

            // As soon as numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }
    }
}
