package com.deloitte.lab3.ex5;

import java.util.Scanner;

public class Lab3Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text:");
        String input = sc.nextLine();
        
        int charCount = input.length();
        String[] words = input.split("\\s+");
        int wordCount = words.length;
        int lineCount = input.split("\n").length;

        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
        sc.close();
    }

}
