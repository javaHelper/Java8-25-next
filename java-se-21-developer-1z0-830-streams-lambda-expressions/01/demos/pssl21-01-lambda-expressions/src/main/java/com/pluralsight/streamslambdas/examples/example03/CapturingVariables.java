package com.pluralsight.streamslambdas.examples.example03;

import java.util.List;

public class CapturingVariables {

    public static void main(String[] args) {
        var names = List.of("Susan", "John", "Michael", "Michelle");

        // Local variable
        var greeting = "Hello, ";

        // The lambda expression can access the local variable from its enclosing method.
        names.forEach(name -> System.out.println(greeting + name));

        // Captured variables must be effectively final: the lambda expression,
        // nor code outside the lambda expression, is allowed to modify the value of such a variable.
        int count = 0;
        // names.forEach(name -> count++);
        System.out.println("Number of names: " + count);
    }
}
