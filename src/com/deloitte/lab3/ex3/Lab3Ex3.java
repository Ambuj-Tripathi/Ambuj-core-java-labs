package com.deloitte.lab3.ex3;

public class Lab3Ex3 {
    public static String alterString(String input) {
        StringBuilder result = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (isConsonant(c)) {
                result.append((char) (c + 1)); // Replace consonant with next character
            } else {
                result.append(c); // Keep vowels unchanged
            }
        }
        return result.toString();
    }

    public static boolean isConsonant(char c) {
        return !"AEIOUaeiou".contains(String.valueOf(c));
    }

    public static void main(String[] args) {
        String input = "JAVA";
        System.out.println("Modified String: " + alterString(input));
    }
}
