package com.pluralsight.streamslambdas.exercises;

import com.pluralsight.streamslambdas.examples.ExampleData;
import com.pluralsight.streamslambdas.examples.Flight;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for exercise 3.
 */
class Exercise03Test {

    @Test
    @DisplayName("flightsByDate() returns the expected result")
    void flightsByDate() {
        Map<LocalDate, List<Flight>> result = new Exercise03().flightsByDate(
                ExampleData.FLIGHTS.stream().filter(flight -> flight.origin().equals("Amsterdam")).toList());

        String text = result.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue().stream().map(Flight::code).sorted().collect(Collectors.joining(",")))
                .collect(Collectors.joining("\n"));
        System.out.println(text);

        assertThat(text)
                .as("Your solution did not return the expected result")
                .isEqualTo("""
                        2025-06-01:BA100,RL497
                        2025-06-02:BA887,QA147
                        2025-06-03:GF455,RL482
                        2025-06-05:BA674
                        2025-06-10:GF318
                        2025-06-12:RL575,RL702
                        2025-06-13:BA210,GF304
                        2025-06-14:GF478,GF699""");
    }
}
