package com.deloitte.lab6.ex7;

import java.util.*;

public class Lab6Ex7 {

    public static int[] getSorted(int[] arr) {
        List<Integer> reversedList = new ArrayList<>();
        for (int num : arr) {
            StringBuilder sb = new StringBuilder(String.valueOf(num));
            int reversedNum = Integer.parseInt(sb.reverse().toString());
            reversedList.add(reversedNum);
        }
        Collections.sort(reversedList);
        return reversedList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {123, 456, 789};
        int[] sortedReversed = getSorted(numbers);
        System.out.println("Sorted Reversed Numbers: " + Arrays.toString(sortedReversed));
    }
}
