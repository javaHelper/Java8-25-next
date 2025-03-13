package com.pluralsight.streamslambdas.exercises;

import java.util.List;

/**
 * Exercise 1: Method references.
 * <p>
 * Replace the lambda expression in the code below by a method reference.
 * <p>
 * Run the corresponding unit test to check if your solution works correctly.
 */
public class Exercise01 {

    public void filterNames(List<String> names) {
        // TODO: Replace the lambda expression by a method reference.
        //  Which of the four types of method references is this?
        names.removeIf(name -> Exercise01.isShortNameAndDoesNotContainE(name));
    }

    static boolean isShortNameAndDoesNotContainE(String name) {
        return name.length() < 5 && !name.toLowerCase().contains("e");
    }
}
