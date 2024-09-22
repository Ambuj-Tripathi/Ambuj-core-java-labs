package com.deloitte.lab1.ex8;

import java.util.function.Function;

public class Lab1Ex8 {

    // Function to check if a number is a power of two
    public static Function<Integer, Boolean> isPowerOfTwo = (n) -> n > 0 && (n & (n - 1)) == 0;

    public static void main(String[] args) {
        int number = 8; // Example input
        System.out.println("Is the number a power of two? " + isPowerOfTwo.apply(number));
    }
}
