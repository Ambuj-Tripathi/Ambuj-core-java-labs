package com.deloitte.lab1.ex1;

public class Lab1Ex1 {

    public static int sumOfCubes(int number) {
        String numStr = Integer.toString(number);
        int sum = 0;

        for (char c : numStr.toCharArray()) {
            int digit = Character.getNumericValue(c);
            sum += Math.pow(digit, 3);
        }

        return sum;
    }

    public static void main(String[] args) {
        int number = 123; // Example number
        System.out.println("Sum of cubes of digits: " + sumOfCubes(number));
    }
}
