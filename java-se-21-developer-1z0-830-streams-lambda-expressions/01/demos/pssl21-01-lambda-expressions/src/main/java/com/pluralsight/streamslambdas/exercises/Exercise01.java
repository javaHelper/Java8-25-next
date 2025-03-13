package com.pluralsight.streamslambdas.exercises;

import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Exercise 1: Write a lambda expression.
 * <p>
 * In the code below, the method {@code makeUpperCase} receives a list of names and makes each name upper-case.
 * Currently, this is done by passing an anonymous inner class to the method {@code replaceAll}.
 * <p>
 * Assignment: Replace the anonymous inner class by a lambda expression.
 * <p>
 * Run the corresponding unit test to check if your solution works correctly.
 */
public class Exercise01 {

    public void makeUpperCase(List<String> names) {
        // TODO: Replace the anonymous inner class by a lambda expression.
        names.replaceAll(String::toUpperCase);
    }
}