package com.pluralsight.streamslambdas.exercises;

import com.pluralsight.streamslambdas.examples.ExampleData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.pluralsight.streamslambdas.exercises.TestUtil.captureSystemOut;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for exercise 2.
 */
class Exercise02Test {

    @Test
    @DisplayName("printCheapestFlightAndFare() prints the expected output")
    void printCheapestFlightAndFare() {
        String output = captureSystemOut(() ->
                new Exercise02().printCheapestFlightAndFare(ExampleData.FLIGHTS, "London", "Stockholm"));

        assertThat(output)
                .as("Your solution did not print the expected output")
                .isEqualTo("Flight RL866, price 152.52, availability 20");
    }
}
