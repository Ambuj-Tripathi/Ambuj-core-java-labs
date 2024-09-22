package com.deloitte.lab3.ex8;

public class Lab3Ex8 {
    public static boolean isPositiveString(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "ANT";
        boolean result = isPositiveString(input);
        System.out.println("Is Positive String: " + result);
    }
}
