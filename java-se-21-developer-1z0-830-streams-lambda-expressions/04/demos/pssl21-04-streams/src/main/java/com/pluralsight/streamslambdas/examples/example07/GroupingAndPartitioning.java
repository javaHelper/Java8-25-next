package com.pluralsight.streamslambdas.examples.example07;

import com.pluralsight.streamslambdas.examples.ExampleData;
import com.pluralsight.streamslambdas.examples.Flight;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndPartitioning {

    public static void main(String[] args) {
        var flights = ExampleData.FLIGHTS;

        // With groupingBy(), you create a Collector that classifies the elements into groups
        // defined by the function that you specify.
        Map<String, List<Flight>> flightsByOrigin = flights.stream()
                .collect(Collectors.groupingBy(Flight::origin));
        for (Map.Entry<String, List<Flight>> entry : flightsByOrigin.entrySet()) {
            System.out.println("Flights from: " + entry.getKey());
            for (Flight flight : entry.getValue()) {
                System.out.println("  " + flight);
            }
        }

        // Partitioning is a special case of grouping, where the function you specify is a Predicate.
        // The result is a Map with two entries, containing the elements that satisfied and
        // that did not satisfy the predicate.
        Map<Boolean, List<Flight>> flightsPartitioned = flights.stream()
                .collect(Collectors.partitioningBy(flight -> flight.distance() < 1000));
        int countShortDistance = flightsPartitioned.get(true).size();
        int countLongDistance = flightsPartitioned.get(false).size();
        System.out.printf("Found %d short distance and %d long distance flights%n", countShortDistance, countLongDistance);
    }
}
