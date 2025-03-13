package com.pluralsight.streamslambdas.examples.example01;

import java.util.List;

public class PrintNames {

    public static void main(String[] args) {
        var names = List.of("Susan", "John", "Michael", "Michelle");

        // Print each name in the list using a lambda expression.
        names.forEach(name -> System.out.println(name));

        // Print each name in the list using a method reference.
        // We're telling forEach() to call the println() method on the object that System.out refers to.
        names.forEach(System.out::println);
    }
}
