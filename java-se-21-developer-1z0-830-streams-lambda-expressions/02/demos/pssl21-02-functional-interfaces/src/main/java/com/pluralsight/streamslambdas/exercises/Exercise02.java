package com.pluralsight.streamslambdas.exercises;

import java.util.List;
import java.util.function.Predicate;

/**
 * Exercise 2: Composing functions with the interfaces in package {@code java.util.function}.
 * <p>
 * Take a look at the code below and follow the instructions.
 * <p>
 * Run the corresponding unit test to check if your solution works correctly.
 */
public class Exercise02 {

    public void filterNames(List<String> names) {
        Predicate<String> isShortName = s -> s.length() < 5;
        Predicate<String> doesNotContainE = s -> !s.toLowerCase().contains("e");

        // TODO: Combine the two predicates defined above to remove elements from the list of names
        //  that are short names and that do not contain the letter "e".
        //  Hint: What method of interface Predicate can you use to combine the two predicates?
        names.removeIf(isShortName.and(doesNotContainE));
    }
}