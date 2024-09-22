package com.deloitte.lab5.ex3;

// User Defined Exception for Salary Validation
class EmployeeException extends Exception {
    public EmployeeException(String message) {
        super(message);
    }
}

public class Lab5Ex3 {

    public static void validateSalary(double salary) throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary must be above 3000.");
        } else {
            System.out.println("Salary is valid: " + salary);
        }
    }

    public static void main(String[] args) {
        try {
            validateSalary(2500);
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}

