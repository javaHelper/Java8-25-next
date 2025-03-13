package com.pluralsight.streamslambdas.exercises;

import com.pluralsight.streamslambdas.examples.Flight;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Exercise 3: Grouping stream elements.
 * <p>
 * In this exercise, you will use one of the more sophisticated {@code groupingBy} collectors.
 * Study the API documentation of {@link Collectors#groupingBy(Function, Supplier, Collector)};
 * the version that takes three parameters.
 * <p>
 * The first parameter is a function that returns the category to group stream elements in.
 * We want to group flights by departure date. You can get the departure date of a flight this way:
 * {@code flight.departureTime().toLocalDate()}.
 * <p>
 * The second parameter is a {@link Supplier} to create a {@link Map} in which to store the results.
 * We want to keep the result sorted by departure date. {@link TreeMap} is a good type of map to use,
 * as it keeps its elements sorted by key.
 * Pass a method reference as the second parameter to the constructor of {@code TreeMap}.
 * <p>
 * The third parameter is another {@link Collector} to collect the elements in each category.
 * We simply want to get a {@link List} for each category, so you can use a familiar method from
 * class {@link Collectors} here to collect elements into a {@link List}.
 */
public class Exercise03 {

    public Map<LocalDate, List<Flight>> flightsByDate(List<Flight> flights) {
        // TODO: Fill in the three parameters for groupingBy() as described above.
        return flights.stream()
                .collect(Collectors.groupingBy(
                        flight -> flight.departureTime().toLocalDate(),
                        TreeMap::new,
                        Collectors.toList()
                ));
    }
}