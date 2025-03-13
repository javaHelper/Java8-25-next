package com.pluralsight.streamslambdas.exercises;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Exercise 1: You can print the entries in a {@code Map} by iterating over the entries in the map,
 * getting the key and value of the entry and printing them.
 * <p>
 * Another way to do this is by calling {@code forEach} on the map.
 * <p>
 * Assignment: What functional interface does the method {@code forEach} on a {@code Map} take?
 * Rewrite the code below and implement that functional interface with a lambda expression.
 * <p>
 * Run the corresponding unit test to check if your solution works correctly.
 */
public class Exercise01 {

    public void printEntries(Map<Integer, String> map) {
        // TODO: Replace this by a call to forEach on the map:
        Map<Integer, String> orderedMap = new LinkedHashMap<>(map);
        orderedMap.forEach((key, value) -> System.out.println(key + ": " + value));

//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
    }
}