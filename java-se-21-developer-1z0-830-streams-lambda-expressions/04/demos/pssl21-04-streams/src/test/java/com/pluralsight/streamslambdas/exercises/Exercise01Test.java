package com.pluralsight.streamslambdas.exercises;

import com.pluralsight.streamslambdas.examples.ExampleData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.pluralsight.streamslambdas.exercises.TestUtil.captureSystemOut;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for exercise 1.
 */
class Exercise01Test {

    @Test
    @DisplayName("printFaresFromLondonToStockholm() prints the expected output")
    void printFaresFromLondonToStockholm() {
        String output = captureSystemOut(() ->
                new Exercise01().printFaresFromLondonToStockholm(ExampleData.FLIGHTS));

        assertThat(output)
                .as("Your solution did not print the expected output")
                .isEqualTo("""
                        Fare[comfortLevel=ECONOMY, price=295.58, availability=41]
                        Fare[comfortLevel=ECONOMY, price=315.36, availability=60]
                        Fare[comfortLevel=FIRST, price=1744.87, availability=57]
                        Fare[comfortLevel=BUSINESS, price=678.12, availability=56]
                        Fare[comfortLevel=ECONOMY, price=152.52, availability=20]
                        """);
    }
}
