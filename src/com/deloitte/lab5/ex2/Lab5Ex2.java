package com.deloitte.lab5.ex2;

// User Defined Exception for Name Validation
class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
}

public class Lab5Ex2 {

    public static void validateFullName(String firstName, String lastName) throws NameException {
        if (firstName == null || firstName.trim().isEmpty() || lastName == null || lastName.trim().isEmpty()) {
            throw new NameException("First name or Last name cannot be blank.");
        } else {
            System.out.println("Full Name is valid: " + firstName + " " + lastName);
        }
    }

    public static void main(String[] args) {
        try {
            validateFullName("", "Smith");
        } catch (NameException e) {
            System.out.println(e.getMessage());
        }
    }
}

