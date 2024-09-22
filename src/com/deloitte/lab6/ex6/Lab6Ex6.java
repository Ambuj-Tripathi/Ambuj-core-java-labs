package com.deloitte.lab6.ex6;

import java.util.*;

public class Lab6Ex6 {

    public static List<String> votersList(Map<String, Integer> ageMap) {
        List<String> eligibleVoters = new ArrayList<>();
        ageMap.forEach((id, age) -> {
            if (age >= 18) {
                eligibleVoters.add(id);
            }
        });
        return eligibleVoters;
    }

    public static void main(String[] args) {
        Map<String, Integer> peopleAges = new HashMap<>();
        peopleAges.put("ID1", 25);
        peopleAges.put("ID2", 16);
        peopleAges.put("ID3", 30);

        List<String> voters = votersList(peopleAges);
        System.out.println("Eligible Voters: " + voters);
    }
}
