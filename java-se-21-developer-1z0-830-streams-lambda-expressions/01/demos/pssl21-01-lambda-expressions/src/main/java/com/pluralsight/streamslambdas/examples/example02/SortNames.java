package com.pluralsight.streamslambdas.examples.example02;

import java.util.ArrayList;
import java.util.List;

public class SortNames {

    public static void main(String[] args) {
        var names = new ArrayList<>(List.of("Susan", "John", "Michael", "Michelle"));

        // Full lambda expression syntax: the parameter list and body look exactly the same as when you define a method.
        names.sort((String s1, String s2) -> {
            return s1.length() - s2.length();
        });

        // Type inference: You can omit the types of the parameters. The compiler figures out the types automatically.
        // Note that you cannot mix explicitly typed parameters with parameters with inferred types.
        names.sort((s1, s2) -> {
            return s1.length() - s2.length();
        });

        // You can use "var" if you want to, although there is not really a good reason to do so.
        // If you use "var", you must use it on all parameters.
        names.sort((var s1, var s2) -> {
            return s1.length() - s2.length();
        });

        // You can use modifiers like "final", but only on explicitly typed parameters.
        names.sort((final String s1, String s2) -> {
            return s1.length() - s2.length();
        });

        // When the lambda expression has a single parameter with an inferred type, you can leave out the parentheses.
        names.forEach(name -> System.out.println(name));

        // If the body of the lambda expression is a single expression or statement,
        // you can write it without the braces and return statement.
        names.sort((s1, s2) -> s1.length() - s2.length());
    }
}
