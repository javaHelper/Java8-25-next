package com.pluralsight.streamslambdas.examples.example05;

import com.pluralsight.streamslambdas.examples.ExampleData;
import com.pluralsight.streamslambdas.examples.Fare;
import com.pluralsight.streamslambdas.examples.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectingAndReducing {

    public static void main(String[] args) {
        var flights = ExampleData.FLIGHTS;

        // One way you could store elements of a stream in a list is like this.
        // This is however not how you should do this.
        // This will not work, for example, if the stream is a parallel stream in which multiple threads
        // are processing the elements concurrently.
        // A principle to keep in mind is that stream operations should not have side effects.
        // Adding an element to a list that's outside the operation is an example of a side effect.
        List<Flight> result1 = new ArrayList<>();
        flights.stream()
                .filter(flight -> flight.isFromTo("London", "Stockholm"))
                .forEach(result1::add);

        // Collect elements of a stream into a list by calling toList() on the stream.
        // Note: .toList() is shorthand for .collect(Collectors.toList())
        List<Flight> result2 = flights.stream()
                .filter(flight -> flight.isFromTo("London", "Stockholm"))
                .toList();

        // The collect() method expects a Collector. A Collector is an object that knows
        // how to create a result container and how to combine the elements of a stream into this container.
        // It is a general concept that can be used to collect the elements of a stream in many different ways.
        // Class Collectors contains factory methods for creating collectors.
        Set<String> flightCodes = flights.stream()
                .filter(flight -> flight.isFromTo("London", "Stockholm"))
                .map(Flight::code)
                .collect(Collectors.toSet());
        System.out.println(flightCodes);
    }
}
