package com.deloitte.lab1.ex6;

public class Lab1Ex6 {

    public static int calculateDifference(int n) {
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            sum += i;
        }

        int squareOfSum = sum * sum;

        return Math.abs(sumOfSquares - squareOfSum);
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Difference between sum of squares and square of sum: " + calculateDifference(n));
    }
}
