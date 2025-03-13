package com.pluralsight.streamslambdas.examples.example08;

import com.pluralsight.streamslambdas.examples.ExampleData;
import com.pluralsight.streamslambdas.examples.Flight;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class ParallelStreams {

    public static void main(String[] args) {
        var flights = ExampleData.FLIGHTS;

        // By creating a stream with parallelStream() instead of stream(), you will get a stream that is possibly (!) parallel.
        // You can also call parallel() on an existing stream.
        // Note that this is not a magic bullet that will always make your program run faster!
        Set<String> flightCodes = flights.parallelStream()
                .filter(flight -> flight.isFromTo("London", "Stockholm"))
                .map(Flight::code)
                .collect(Collectors.toSet());
        System.out.println(flightCodes);

        // If you are grouping or partitioning on a parallel stream, use groupingByConcurrent() or partitioningByConcurrent()
        // which return collectors that are more efficient with parallel streams.
        Map<String, List<Flight>> flightsByOrigin = flights.parallelStream()
                .collect(Collectors.groupingByConcurrent(Flight::origin));
        for (Map.Entry<String, List<Flight>> entry : flightsByOrigin.entrySet()) {
            System.out.println("Flights from: " + entry.getKey());
            for (Flight flight : entry.getValue()) {
                System.out.println("  " + flight);
            }
        }
    }
}
