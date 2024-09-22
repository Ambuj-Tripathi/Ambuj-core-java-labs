package com.deloitte.lab1.ex3;

public class Lab1Ex3 {

    // Recursive Fibonacci
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Non-Recursive Fibonacci
    public static int fibonacciNonRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        int n = 10; // Example value

        // Recursive
        System.out.println("Recursive Fibonacci of " + n + ": " + fibonacciRecursive(n));

        // Non-Recursive
        System.out.println("Non-Recursive Fibonacci of " + n + ": " + fibonacciNonRecursive(n));
    }
}
