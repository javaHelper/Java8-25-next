package com.pluralsight.streamslambdas.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for exercise 1.
 */
class Exercise01Test {

    @Test
    @DisplayName("printEntries() prints the keys and values in the map")
    void printEntries() {
        var map = Map.of(1, "one", 2, "two", 3, "three");

        String output = TestUtil.captureSystemOut(() ->
                new Exercise01().printEntries(map));

        assertThat(output)
                .as("Your solution did not print the expected output")
                .isEqualTo("""
                        1: one
                        2: two
                        3: three
                        """);
    }
}
