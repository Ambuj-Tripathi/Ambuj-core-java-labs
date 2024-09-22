package com.deloitte.lab6.ex1;

import java.util.*;

public class Lab6Ex1 {

    public static List<Integer> getValues(Map<String, Integer> map) {
        List<Integer> values = new ArrayList<>(map.values());
        values.sort(Comparator.naturalOrder());
        return values;
    }

    public static void main(String[] args) {
        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("A", 10);
        sampleMap.put("B", 5);
        sampleMap.put("C", 15);

        List<Integer> sortedValues = getValues(sampleMap);
        System.out.println("Sorted Values: " + sortedValues);
    }
}
