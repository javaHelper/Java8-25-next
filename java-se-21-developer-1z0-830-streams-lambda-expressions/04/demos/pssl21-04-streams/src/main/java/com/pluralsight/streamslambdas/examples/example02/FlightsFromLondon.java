package com.pluralsight.streamslambdas.examples.example02;

import com.pluralsight.streamslambdas.examples.ExampleData;

public class FlightsFromLondon {

    public static void main(String[] args) {
        var flights = ExampleData.FLIGHTS;

        // filter() takes a Predicate and returns a stream that contains only the elements
        // for which the predicate returns true.
        flights.stream()
                .filter(flight -> flight.origin().equals("London"))
                .forEach(flight -> System.out.printf("%s from London to %s%n", flight.code(), flight.destination()));
    }
}
