package com.vinay.Striver.step1.lec2;
//https://takeuforward.org/pattern/pattern-13-increasing-number-triangle-pattern/
public class Pattern13 {
    public static void main(String[] args) {
        int N= 5;
        // starting number.
        int num =1;

        // Outer loop for the number of rows.
        for(int i=1;i<=N;i++){

            // Inner loop will loop for i times and
            // print numbers increasing by 1 each time.
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num =num+1;
            }
            // As soon as the numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();

        }
    }
}
