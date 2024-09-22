package com.deloitte.lab6.ex4;

import java.util.*;

public class Lab6Ex4 {

    public static Map<String, String> getStudents(Map<String, Integer> marksMap) {
        Map<String, String> medalMap = new HashMap<>();
        marksMap.forEach((id, marks) -> {
            if (marks >= 90) {
                medalMap.put(id, "Gold");
            } else if (marks >= 80) {
                medalMap.put(id, "Silver");
            } else if (marks >= 70) {
                medalMap.put(id, "Bronze");
            }
        });
        return medalMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("101", 85);
        studentMarks.put("102", 92);
        studentMarks.put("103", 75);

        Map<String, String> medals = getStudents(studentMarks);
        medals.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
