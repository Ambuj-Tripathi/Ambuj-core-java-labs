package com.deloitte.lab3.ex1;

import java.util.StringTokenizer;

public class Lab3Ex1 {
    public static void main(String[] args) {
        String numbers = "10 20 30 40 50"; // Example input line of integers
        StringTokenizer st = new StringTokenizer(numbers);
        
        int sum = 0;
        System.out.println("Individual numbers:");
        
        while (st.hasMoreTokens()) {
            String numStr = st.nextToken();
            int num = Integer.parseInt(numStr);
            sum += num;
            System.out.println(num);
        }
        
        System.out.println("Sum of all numbers: " + sum);
    }
}
