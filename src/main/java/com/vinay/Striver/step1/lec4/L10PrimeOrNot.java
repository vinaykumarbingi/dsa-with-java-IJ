package com.vinay.Striver.step1.lec4;
//https://takeuforward.org/data-structure/check-if-a-number-is-prime-or-not/
public class L10PrimeOrNot {
    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = checkPrime(n);
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    static boolean checkPrime(int n) {
        // Initialize a counter variable to
        // count the number of factors.
        int cnt = 0;
        // Loop through numbers from 1 to n.
        for (int i = 1; i <= n; i++) {
            // If n is divisible by i
            // without any remainder.
            if (n % i == 0) {
                // Increment the counter.
                cnt = cnt + 1;
            }
        }

        // If the number of
        // factors is exactly 2
        if (cnt == 2) {
            // Return true, indicating
            // that the number is prime.
            return true;
        }
        // If the number of
        // factors is not 2.
        else {
            // Return false, indicating
            // that the number is not prime.
            return false;
        }
    }
}
