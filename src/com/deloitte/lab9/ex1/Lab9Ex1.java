package com.deloitte.lab9.ex1;

@FunctionalInterface
interface Power {
    int compute(int x, int y);
}

public class Lab9Ex1 {
    public static void main(String[] args) {
        Power power = (x, y) -> (int) Math.pow(x, y);

        int result = power.compute(2, 3);
        System.out.println("Result of 2^3: " + result);
    }
}

