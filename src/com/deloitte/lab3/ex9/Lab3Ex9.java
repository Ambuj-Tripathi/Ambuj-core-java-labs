package com.deloitte.lab3.ex9;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab3Ex9 {
    public static void calculateDuration(LocalDate inputDate) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(inputDate, currentDate);
        System.out.println("Years: " + period.getYears() + ", Months: " + period.getMonths() + ", Days: " + period.getDays());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year, month, and day:");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        LocalDate inputDate = LocalDate.of(year, month, day);
        calculateDuration(inputDate);
        sc.close();
    }
}

