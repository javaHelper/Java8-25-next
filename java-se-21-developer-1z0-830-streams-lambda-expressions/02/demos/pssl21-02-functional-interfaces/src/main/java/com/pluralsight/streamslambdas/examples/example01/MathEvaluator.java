package com.pluralsight.streamslambdas.examples.example01;

// A functional interface is an interface with a single abstract method.
// The @FunctionalInterface annotation tells the compiler to check if this is really a functional interface.
@FunctionalInterface
interface MathFunction {
    double evaluate(double x);
}

public class MathEvaluator {

    public static void main(String[] args) {
        // The lambda expression matches the functional interface (same parameter list and return type).
        MathFunction f = x -> 2.0 * x + 1.0;

        // To call the lambda expression, you simply call the method of the interface.
        double x = 3.0;
        double y = f.evaluate(x);

        System.out.printf("f(%f) = %f%n", x, y);
    }
}
