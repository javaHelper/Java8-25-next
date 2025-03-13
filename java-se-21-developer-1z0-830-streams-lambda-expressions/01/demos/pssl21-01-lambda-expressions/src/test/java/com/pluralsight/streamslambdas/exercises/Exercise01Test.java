package com.pluralsight.streamslambdas.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for exercise 1.
 */
class Exercise01Test {

    @Test
    @DisplayName("makeUpperCase() makes all names uppercase")
    void makeUpperCase() {
        var names = new ArrayList<>(List.of("Susan", "John", "Michael", "Michelle"));

        new Exercise01().makeUpperCase(names);

        assertThat(names)
                .as("Your solution did not return the expected result")
                .containsExactly("SUSAN", "JOHN", "MICHAEL", "MICHELLE");
    }
}
