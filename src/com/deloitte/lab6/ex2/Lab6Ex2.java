package com.deloitte.lab6.ex2;

import java.util.*;

public class Lab6Ex2 {

    public static Map<Character, Integer> countChars(char[] arr) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : arr) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        return charCountMap;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'a', 'c', 'b', 'a'};
        Map<Character, Integer> result = countChars(chars);
        result.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
