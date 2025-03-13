package com.pluralsight.streamslambdas.exercises;

import com.pluralsight.streamslambdas.examples.Fare;
import com.pluralsight.streamslambdas.examples.Flight;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Exercise 2: Find the cheapest flight and print flight and fare details.
 * <p>
 * Fill in the blanks in the exercise below.
 * <p>
 * Run the corresponding unit test to check if your solution works correctly.
 */
public class Exercise02 {

    public void printCheapestFlightAndFare(List<Flight> flights, String origin, String destination) {
        // TODO: Filter by origin and destination.
        // TODO: Search for the flight with the cheapest fare. Use compareByFare()
        //  and uncomment the code below.

        flights.stream()
                .filter(flight -> flight.origin().equalsIgnoreCase(origin) &&
                        flight.destination().equalsIgnoreCase(destination))
                .min(Exercise02::compareByFare)
                .ifPresent(flight -> {
                    Fare fare = findCheapestFareWithAvailability(flight).get();
                    System.out.printf("Flight %s, price %s, availability %d", flight.code(), fare.price(), fare.availability());
                });
    }

    private static int compareByFare(Flight flight1, Flight flight2) {
        Optional<Fare> fare1Opt = findCheapestFareWithAvailability(flight1);
        Optional<Fare> fare2Opt = findCheapestFareWithAvailability(flight2);

        if (fare1Opt.isPresent() && fare2Opt.isPresent()) {
            return fare1Opt.get().price().compareTo(fare2Opt.get().price());
        } else {
            return fare1Opt.isPresent() ? -1 : 1;
        }
    }

    private static Optional<Fare> findCheapestFareWithAvailability(Flight flight) {
        // TODO: Look at the fares of the given flight, find the cheapest one with availability greater than zero.
        return flight.fares().stream()
                .filter(fare -> fare.availability() > 0)
                .min(Comparator.comparing(Fare::price));
    }
}