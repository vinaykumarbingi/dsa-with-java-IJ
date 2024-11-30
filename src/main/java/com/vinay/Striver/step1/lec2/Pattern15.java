package com.vinay.Striver.step1.lec2;
//https://takeuforward.org/pattern/pattern-15-reverse-letter-triangle-pattern/
public class Pattern15 {
    public static void main(String[] args) {
        int N=5;
        // Outer loop for the number of rows.
        for(int i=0;i<N;i++){

            // Inner loop will loop for i times and
            // print alphabets from A to A + (N-i-1).
            for(char ch = 'A'; ch<='A'+(N-i-1);ch++){
                System.out.print(ch + " ");

            }
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();

        }
    }
}
