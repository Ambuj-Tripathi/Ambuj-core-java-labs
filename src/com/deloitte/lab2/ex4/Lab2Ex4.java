package com.deloitte.lab2.ex4;

import java.util.Arrays;
import java.util.Comparator;

public class Lab2Ex4 {

    // Method to remove duplicates and return the array sorted in descending order
    public static int[] modifyArray(int[] arr) {
        return Arrays.stream(arr)
                .distinct() // Remove duplicates
                .boxed() // Convert to Integer object for reverse sorting
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .mapToInt(Integer::intValue) // Convert back to primitive int array
                .toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 30, 40, 10, 50};
        int[] result = modifyArray(numbers);
        System.out.println("Modified array (unique and sorted in descending order): " + Arrays.toString(result));
    }
}
