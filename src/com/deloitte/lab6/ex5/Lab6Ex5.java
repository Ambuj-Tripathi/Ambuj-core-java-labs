package com.deloitte.lab6.ex5;

import java.util.*;

public class Lab6Ex5 {

    public static int getSecondSmallest(int[] arr) {
        List<Integer> arrayList = new ArrayList<>();
        for (int num : arr) {
            arrayList.add(num);
        }
        Collections.sort(arrayList);
        return arrayList.get(1);
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 6, 1, 3};
        int secondSmallest = getSecondSmallest(numbers);
        System.out.println("Second Smallest Element: " + secondSmallest);
    }
}
