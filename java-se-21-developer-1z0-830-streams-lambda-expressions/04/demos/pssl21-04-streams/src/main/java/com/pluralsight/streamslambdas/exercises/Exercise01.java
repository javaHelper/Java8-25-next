package com.pluralsight.streamslambdas.exercises;

import com.pluralsight.streamslambdas.examples.Flight;

import java.util.List;

/**
 * Exercise 1: Using mapMulti().
 * <p>
 * There are two intermediate operations that map a stream element to zero or more output elements: {@code flatMap}
 * and {@code mapMulti}.
 * <p>
 * Assignment: Below is the example from the course when we discussed {@code flatMap}. Study the method {@code mapMulti}
 * and rewrite this code using {@code mapMulti} instead of {@code flatMap}.
 * <p>
 * Run the corresponding unit test to check if your solution works correctly.
 */
public class Exercise01 {

    public void printFaresFromLondonToStockholm(List<Flight> flights) {
        // TODO: Replace flatMap below by mapMulti. Study the API documentation to learn how mapMulti differs from
        //  flatMap. What parameters does mapMulti take and what should you do with them?
        flights.stream()
                .filter(flight -> flight.isFromTo("London", "Stockholm"))
                .flatMap(flight -> flight.fares().stream())
                .forEach(System.out::println);
    }
}
