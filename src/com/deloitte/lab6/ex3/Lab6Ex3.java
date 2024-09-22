package com.deloitte.lab6.ex3;

import java.util.*;

public class Lab6Ex3 {

    public static Map<Integer, Integer> getSquares(int[] numbers) {
        Map<Integer, Integer> squareMap = new HashMap<>();
        Arrays.stream(numbers).forEach(num -> squareMap.put(num, num * num));
        return squareMap;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Map<Integer, Integer> squares = getSquares(numbers);
        squares.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
