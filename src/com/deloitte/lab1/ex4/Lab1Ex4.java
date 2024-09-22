package com.deloitte.lab1.ex4;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lab1Ex4 {

    // Predicate for checking if a number is prime
    public static Predicate<Integer> isPrime = (num) -> {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    };

    // Consumer to print a number
    public static Consumer<Integer> printNumber = (num) -> System.out.print(num + " ");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int maxNumber = scanner.nextInt();

        System.out.println("Prime numbers up to " + maxNumber + ":");
        for (int i = 2; i <= maxNumber; i++) {
            if (isPrime.test(i)) {
                printNumber.accept(i);
            }
        }
        scanner.close();
    }
}
