package com.pluralsight.streamslambdas.examples.example04;

import com.pluralsight.streamslambdas.examples.ExampleData;
import com.pluralsight.streamslambdas.examples.Fare;

import java.util.Comparator;

public class SortedFaresFromLondonToStockholm {

    public static void main(String[] args) {
        var flights = ExampleData.FLIGHTS;

        // sorted() takes a Comparator and sorts the elements of the stream by the criteria defined by the comparator.
        // This is a stateful operation that will not work on an infinite stream.
        flights.stream()
                .filter(flight -> flight.isFromTo("London", "Stockholm"))
                .flatMap(flight -> flight.fares().stream())
                .sorted((fare1, fare2) -> fare1.price().compareTo(fare2.price()))
                .forEach(System.out::println);

        // Interface Comparator has useful factory methods for creating comparators.
        flights.stream()
                .filter(flight -> flight.isFromTo("London", "Stockholm"))
                .flatMap(flight -> flight.fares().stream())
                .sorted(Comparator.comparing(Fare::price))
                .forEach(System.out::println);

        // Terminal operations min() and max() return an Optional containing the minimum or maximum element
        // according to a comparator.
        flights.stream()
                .filter(flight -> flight.isFromTo("London", "Stockholm"))
                .flatMap(flight -> flight.fares().stream())
                .min(Comparator.comparing(Fare::price))
                .ifPresent(System.out::println);
    }
}
