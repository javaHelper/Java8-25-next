package com.pluralsight.streamslambdas.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for exercise 2.
 */
class Exercise02Test {

    @Test
    @DisplayName("filterNames() removes short names that do not contain the letter e")
    void filterNames() {
        var names = new ArrayList<>(List.of("John", "Michael", "Seth", "Michelle"));

        new Exercise02().filterNames(names);

        assertThat(names)
                .as("Your solution did not return the expected result")
                .containsExactly("Michael", "Seth", "Michelle");
    }
}
