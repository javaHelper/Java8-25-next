package com.pluralsight.streamslambdas.examples.example01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {
        var names1 = List.of("Susan", "John", "Michael", "Michelle");
        String[] names2 = {"Susan", "John", "Michael", "Michelle"};

        // Create a stream from a collection by calling the stream() method on it.
        Stream<String> stream1 = names1.stream();

        // Create a stream from an array by calling Arrays.stream().
        Stream<String> stream2 = Arrays.stream(names2);

        // Use Stream.of() to create a stream from a small, fixed number of elements.
        Stream<String> stream3 = Stream.of("Susan", "John", "Michael", "Michelle");

        // Use Stream.ofNullable() to create a stream with a single element, or an empty stream if the value
        // that you pass to this method is null.
        Stream<String> stream4 = Stream.ofNullable("Susan"); // Single-element stream
        Stream<String> stream5 = Stream.ofNullable(null); // Empty stream

        // There might be cases where you deliberately want to create an empty Stream.
        Stream<String> stream6 = Stream.empty();

        // Use Stream.builder() to return a builder which you can use to build a stream
        // from an arbitrary number of elements.
        Stream<String> stream7 = Stream.<String>builder()
                .add("Susan")
                .add("John")
                .add("Michael")
                .add("Michelle")
                .build();

        // There are more stream factory methods; see the API documentation.
    }
}
