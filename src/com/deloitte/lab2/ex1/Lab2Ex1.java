package com.deloitte.lab2.ex1;

import java.util.Arrays;

public class Lab2Ex1 {

    // Method to get the second smallest element
    public static int getSecondSmallest(int[] arr) {
        return Arrays.stream(arr) // Convert array to stream
                .sorted() // Sort the array
                .distinct() // Remove duplicates
                .skip(1) // Skip the first (smallest) element
                .findFirst() // Get the second smallest
                .orElseThrow(() -> new IllegalArgumentException("Array should have at least two distinct elements"));
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 9, 2, 6};
        int secondSmallest = getSecondSmallest(numbers);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}
