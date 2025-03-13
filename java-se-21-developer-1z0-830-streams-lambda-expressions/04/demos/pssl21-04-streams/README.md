# Java SE 21 Developer (Exam 1Z0-830): Streams and Lambda Expressions

These examples and exercises are part of the course "Java SE 21 Developer (Exam 1Z0-830): Streams and Lambda Expressions" by Jesper de Jong
at [Pluralsight](https://www.pluralsight.com/).

## Streams

In this module, you'll learn:

* What streams are
* The differences between collections and streams
* What intermediate and terminal operations are
* Creating streams
* Filtering, mapping and sorting stream elements (intermediate operations)
* Collecting, searching, grouping and partitioning stream elements (terminal operations)
* Parallel streams

### Examples

You can find the examples that have been discussed in the videos for this module in the package
`com.pluralsight.streamslambdas.examples`.

### Exercises

You can find the exercises for this module in the package `com.pluralsight.streamslambdas.exercises`.

Use your favorite IDE or editor to work with the exercises.

Run the included unit test for each exercise to check that your solution works. The unit tests are written using
[JUnit](http://junit.org/). You can run the test from your IDE or from the command line.

This project is a [Maven](http://maven.apache.org/) project, which most Java IDEs will understand.
To build the project and run the tests on the command line or in a terminal window, use the following commands.

Windows:

    mvnw.cmd clean package

macOS or Linux:

    ./mvnw clean package

This will compile the source code in the project and run the unit tests. If there is a compile error or if there are
failures while running the tests, you'll get a message that says "BUILD FAILED".

To just compile the code and not run the unit tests, use the following commands.

Windows:

    mvnw.cmd clean package -DskipTests

macOS or Linux:

    ./mvnw clean package -DskipTests
