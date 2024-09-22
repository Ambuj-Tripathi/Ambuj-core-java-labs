package com.deloitte.lab2.ex2;

import java.util.Arrays;

public class Lab2Ex2 {

    // Method to sort the strings and format them as required
    public static String[] sortStrings(String[] arr) {
        Arrays.sort(arr, String::compareToIgnoreCase); // Sort the array alphabetically

        int midpoint = (arr.length % 2 == 0) ? arr.length / 2 : arr.length / 2 + 1; // Find the midpoint

        for (int i = 0; i < arr.length; i++) {
            if (i < midpoint) {
                arr[i] = arr[i].toUpperCase(); // Convert first half to uppercase
            } else {
                arr[i] = arr[i].toLowerCase(); // Convert second half to lowercase
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        String[] strings = {"apple", "Banana", "grape", "cherry", "Date"};
        String[] result = sortStrings(strings);
        System.out.println("Sorted and formatted array: " + Arrays.toString(result));
    }
}

