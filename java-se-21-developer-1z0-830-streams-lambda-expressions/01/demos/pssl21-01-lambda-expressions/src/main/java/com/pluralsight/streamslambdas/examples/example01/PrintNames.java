package com.pluralsight.streamslambdas.examples.example01;

import java.util.List;
import java.util.function.Consumer;

public class PrintNames {

    public static void main(String[] args) {
        var names = List.of("Susan", "John", "Michael", "Michelle");

        // Print each name in the list using a for loop.
        for (String name : names) {
            System.out.println(name);
        }

        // Print each name in the list using an anonymous inner class that implements interface Consumer.
        names.forEach(new Consumer<>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

        // Print each name in the list using a lambda expression.
        names.forEach(name -> System.out.println(name));

        // A lambda expression is a function that is treated as data.
        // For example, you can assign it to a variable and then pass it to forEach().
        Consumer<String> print = name -> System.out.println(name);
        names.forEach(print);
    }
}
