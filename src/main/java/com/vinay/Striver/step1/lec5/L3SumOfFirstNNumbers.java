package com.vinay.Striver.step1.lec5;
//https://takeuforward.org/data-structure/sum-of-first-n-natural-numbers/
public class L3SumOfFirstNNumbers {
    public static void main(String[] args) {
        solve(5);
        solveUsingFormula(6);

    }
    public static void solve(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }

    public static void solveUsingFormula(int N) {
        int sum = N * (N + 1) / 2;
        System.out.println("The sum of the first " + N + " numbers is: " + sum);
    }
}
