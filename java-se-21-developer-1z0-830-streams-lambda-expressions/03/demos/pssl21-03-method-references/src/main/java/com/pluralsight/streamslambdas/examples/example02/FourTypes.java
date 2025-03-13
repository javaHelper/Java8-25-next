package com.pluralsight.streamslambdas.examples.example02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class FourTypes {

    public static void main(String[] args) {
        var names = new ArrayList<>(List.of("Susan", "John", "Michael", "Michelle"));

        // A method reference to a static method has the class name before the ::.
        names.sort(FourTypes::compareByLength);

        // It would look like this when written as a lambda expression.
        names.sort((s1, s2) -> FourTypes.compareByLength(s1, s2));

        // A method reference to an instance method of a specific object has an object reference before the ::.
        names.forEach(System.out::println);

        // It would look like this when written as a lambda expression.
        names.forEach(name -> System.out.println(name));

        // A method reference to an instance method not for a specific object has the class name before the ::
        // and the name of the instance method after it.
        // It will be called on the first argument of the functional interface.
        Function<String, String> transformer = String::toUpperCase;
        System.out.println(transformer.apply("Susan"));

        // It would look like this when written as a lambda expression.
        transformer = name -> name.toUpperCase();

        // A method reference to a constructor has the class name before the :: and "new" after it.
        Supplier<List<String>> listFactory = ArrayList::new;
        var list = listFactory.get();

        // It would look like this when written as a lambda expression.
        listFactory = () -> new ArrayList<>();
    }

    public static int compareByLength(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
