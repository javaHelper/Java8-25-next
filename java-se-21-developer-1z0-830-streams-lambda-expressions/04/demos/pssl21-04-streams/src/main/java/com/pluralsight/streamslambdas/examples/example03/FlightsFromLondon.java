package com.pluralsight.streamslambdas.examples.example03;

import com.pluralsight.streamslambdas.examples.ExampleData;

public class FlightsFromLondon {

    public static void main(String[] args) {
        var flights = ExampleData.FLIGHTS;

        // map() does a one-to-one transformation of elements from the input stream to the output stream.
        flights.stream()
                .filter(flight -> flight.origin().equals("London"))
                .map(flight -> String.format("%s from London to %s", flight.code(), flight.destination()))
                .forEach(System.out::println);
    }
}
