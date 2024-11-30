package com.vinay.Striver.step1.lec5;
//https://takeuforward.org/data-structure/factorial-of-a-number-iterative-and-recursive/
public class L5FactorialNumberRecursion {
    public static void main(String[] args) {
        int X = 5;
        int result = factorial(X);
        System.out.println("The factorial of " + X + " is " + result);

        int result1 = factorialRecursive(X);
        System.out.println("The factorial of " + X + " is " + result1);
    }

    static int factorial(int X) {
        int ans = 1;
        for (int i = 1; i <= X; i++) {
            ans = ans * i;
        }
        return ans;
    }

    static int factorialRecursive(int n)
    {
        if(n == 0)
        {
            return 1;
        }

        return n * factorial(n-1);

    }
}
