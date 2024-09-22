package com.deloitte.lab9.ex3;

@FunctionalInterface
interface Authenticator {
    boolean authenticate(String username, String password);
}

public class Lab9Ex3 {
    public static void main(String[] args) {
        Authenticator authenticator = (username, password) -> 
            username.equals("admin") && password.equals("password123");

        boolean isAuthenticated = authenticator.authenticate("admin", "password123");
        System.out.println("Authentication success: " + isAuthenticated);
    }
}
