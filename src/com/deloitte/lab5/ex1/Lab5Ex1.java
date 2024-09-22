package com.deloitte.lab5.ex1;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Lab5Ex1 {

    public static void validateAge(int age) throws AgeException {
        if (age <= 15) {
            throw new AgeException("Age must be above 15.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(14);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
