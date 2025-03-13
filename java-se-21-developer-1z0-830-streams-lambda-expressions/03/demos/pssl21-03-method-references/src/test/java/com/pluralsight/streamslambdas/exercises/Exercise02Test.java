package com.pluralsight.streamslambdas.exercises;

import com.pluralsight.streamslambdas.exercises.Exercise02.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Exercise02Test {

    @Test
    void sortPeople() {
        var people = new ArrayList<>(List.of(
                new Person("Joe", "Smith"),
                new Person("Bob", "Ayers"),
                new Person("Susan", "Jones"),
                new Person("Zack", "Alberts")));

        new Exercise02().sortPeopleByLastName(people);

        assertThat(people)
                .as("Your solution did not return the expected result")
                .containsExactly(
                        new Person("Zack", "Alberts"),
                        new Person("Bob", "Ayers"),
                        new Person("Susan", "Jones"),
                        new Person("Joe", "Smith"));
    }
}
