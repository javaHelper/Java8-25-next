package com.pluralsight.streamslambdas.examples.example06;

import com.pluralsight.streamslambdas.examples.ExampleData;
import com.pluralsight.streamslambdas.examples.Fare;
import com.pluralsight.streamslambdas.examples.Flight;

import java.util.Comparator;
import java.util.Optional;

public class Searching {

    public static void main(String[] args) {
        var flights = ExampleData.FLIGHTS;

        // The findFirst() operation returns an Optional containing the first element of the stream or
        // an empty Optional if the stream is empty.
        // Note: There's also findAny(), which works similarly but returns an arbitrary element
        // (instead of the first element) if the stream is not empty.
        Optional<Flight> flightOpt = flights.stream()
                .filter(flight -> flight.isFromTo("Amsterdam", "Berlin"))
                .findFirst();
        if (flightOpt.isPresent()) {
            var flight = flightOpt.get();
            System.out.println("Flight found: " + flight);

            // The anyMatch() method returns true if the predicate returns true for at least one element.
            // Likewise, the allMatch() method returns true only if the predicate returns true for all elements,
            // and the noneMatch() method returns true only if the predicate returns false for all elements.
            if (flight.fares().stream().anyMatch(fare -> fare.availability() > 0)) {
                System.out.println("There are seats available on this flight");
            } else {
                System.out.println("This flight is fully booked");
            }

            // The min() method returns an Optional with the minimum element according to the comparator
            // that you pass to it, or an empty Optional if the stream is empty. Likewise, there is a max() method.
            Optional<Fare> cheapestPriceOpt = flight.fares().stream()
                    .filter(fare -> fare.availability() > 0)
                    .min(Comparator.comparing(Fare::price));
            if (cheapestPriceOpt.isPresent()) {
                var cheapestPrice = cheapestPriceOpt.get();
                System.out.println("Cheapest fare with available seats: " + cheapestPrice);
            } else {
                System.out.println("This flight is fully booked");
            }
        } else {
            System.out.println("No flight found");
        }
    }
}
