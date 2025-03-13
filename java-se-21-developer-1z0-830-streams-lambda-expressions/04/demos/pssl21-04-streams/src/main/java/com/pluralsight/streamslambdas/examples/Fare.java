package com.pluralsight.streamslambdas.examples;

import java.math.BigDecimal;

public record Fare(ComfortLevel comfortLevel, BigDecimal price, int availability) {
}
