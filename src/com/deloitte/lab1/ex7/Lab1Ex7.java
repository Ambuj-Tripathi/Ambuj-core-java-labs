package com.deloitte.lab1.ex7;

import java.util.function.Predicate;

public class Lab1Ex7 {

    // Predicate to check if a number is an increasing number
    public static Predicate<Integer> isIncreasingNumber = (number) -> {
        String numStr = Integer.toString(number);
        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    };

    public static void main(String[] args) {
        int number = 134468; // Example input
        System.out.println("Is the number increasing? " + isIncreasingNumber.test(number));
    }
}
