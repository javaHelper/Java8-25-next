package com.pluralsight.streamslambdas.exercises;

import java.util.List;
import java.util.function.Consumer;

/**
 * Exercise 2: Pass a lambda expressions as data.
 * <p>
 * Lambda expressions are functions that can be treated like a piece of data. For example, you can store them in
 * a variable and pass them to or return them from methods.
 * <p>
 * Assignment: The {@code printWithPrefix} method in the code below acts as a factory method that creates and returns
 * an instance of interface {@link Consumer}. Implement this method by making it return a lambda expression that
 * prints a name with a prefix in front of it.
 * <p>
 * Run the corresponding unit test to check if your solution works correctly.
 */
public class Exercise02 {

    static Consumer<String> printWithPrefix(String prefix) {
        // TODO: Return a lambda expression that takes a name as an argument and prints the name
        //  with the given prefix in front of it.
        return name -> System.out.println(prefix + name);
    }

    public void printGreetings(List<String> names) {
        names.forEach(printWithPrefix("Hello "));
        names.forEach(printWithPrefix("Thanks "));
    }
}