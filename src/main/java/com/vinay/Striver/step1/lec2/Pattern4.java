package com.vinay.Striver.step1.lec2;
//https://takeuforward.org/pattern/pattern-4-right-angled-number-pyramid-ii/
public class Pattern4 {
    public static void main(String[] args) {
        int N=5;
        for (int i = 1; i <= N; i++)
        {
            // This is the inner loop which loops for the columns
            // no. of columns = row number for each line here.
            // Here, we print numbers equal to the row number
            // instead of stars in each row.
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }

            // As soon as numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }
    }
}
