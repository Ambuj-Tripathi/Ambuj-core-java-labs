package com.deloitte.lab1.ex5;

import java.util.function.Predicate;

public class Lab1Ex5 {

    // Predicate to check if a number is divisible by 3 or 5
    public static Predicate<Integer> divisibleBy3or5 = (num) -> num % 3 == 0 || num % 5 == 0;

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (divisibleBy3or5.test(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Sum of numbers divisible by 3 or 5 up to " + n + ": " + calculateSum(n));
    }
}
