package com.deloitte.lab2.ex3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Lab2Ex3 {

    // Method to reverse the numbers and return the sorted array
    public static int[] getSorted(int[] arr) {
        return Arrays.stream(arr)
                .map(num -> Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString())) // Reverse the numbers
                .sorted() // Sort the reversed numbers
                .toArray(); // Convert stream back to array
    }

    public static void main(String[] args) {
        int[] numbers = {123, 456, 789, 321};
        int[] sortedReversedArray = getSorted(numbers);
        System.out.println("Reversed and sorted array: " + Arrays.toString(sortedReversedArray));
    }
}
