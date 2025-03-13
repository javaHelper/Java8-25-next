package com.pluralsight.streamslambdas.examples.example03;

import com.pluralsight.streamslambdas.examples.ExampleData;

public class FaresFromLondonToStockholm {

    public static void main(String[] args) {
        var flights = ExampleData.FLIGHTS;

        // flatMap() does a zero-to-many transformation. The function that you pass to flatMap() must return a stream.
        flights.stream()
                .filter(flight -> flight.isFromTo("London", "Stockholm"))
                .flatMap(flight -> flight.fares().stream())
                .forEach(System.out::println);
    }
}
