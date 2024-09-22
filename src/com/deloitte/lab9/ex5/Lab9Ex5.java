package com.deloitte.lab9.ex5;

@FunctionalInterface
interface Factorial {
    int compute(int n);
}

public class Lab9Ex5 {

    public static int calculateFactorial(int n) {
        if (n == 0) return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = Lab9Ex5::calculateFactorial;

        int result = factorial.compute(5);
        System.out.println("Factorial of 5: " + result);
    }
}
