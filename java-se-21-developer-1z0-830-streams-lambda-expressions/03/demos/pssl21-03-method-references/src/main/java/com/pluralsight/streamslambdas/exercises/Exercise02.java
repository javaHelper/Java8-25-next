package com.pluralsight.streamslambdas.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

/**
 * Exercise 2: Method references.
 * <p>
 * The method {@link Comparator#comparing(Function)} is a factory method for creating comparators.
 * <p>
 * It takes a function that extracts a key from the objects to compare, and then it creates a comparator that compares
 * objects by this key. It can be used, for example, to sort objects by that key.
 * <p>
 * Take a look at the code below and pass a method reference to sort a list of people by last name.
 * <p>
 * Run the corresponding unit test to check if your solution works correctly.
 */
public class Exercise02 {

    public void sortPeopleByLastName(List<Person> people) {
        // TODO: Pass a method reference to Comparator.comparing(...) to sort the list of people by lastName.
        //  Hint: Which type of objects are being sorted here? The method reference refers to one of the methods
        //  of that type.
         people.sort(Comparator.comparing(Person::getLastName));
    }

    public static class Person {
        private final String firstName;
        private final String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public boolean equals(Object o) {
            return o instanceof Person p &&
                    Objects.equals(firstName, p.firstName) && Objects.equals(lastName, p.lastName);
        }

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }
}