package com.pluralsight.streamslambdas.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.pluralsight.streamslambdas.exercises.TestUtil.captureSystemOut;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for exercise 2.
 */
class Exercise02Test {

    @Test
    @DisplayName("printGreetings() prints the expected greetings")
    void printGreetings() {
        String output = captureSystemOut(() ->
                new Exercise02().printGreetings(List.of("Susan", "John", "Michael", "Michelle")));

        assertThat(output)
                .as("Your solution did not return the expected result")
                .isEqualTo("""
                        Hello Susan
                        Hello John
                        Hello Michael
                        Hello Michelle
                        Thanks Susan
                        Thanks John
                        Thanks Michael
                        Thanks Michelle
                        """);
    }
}
