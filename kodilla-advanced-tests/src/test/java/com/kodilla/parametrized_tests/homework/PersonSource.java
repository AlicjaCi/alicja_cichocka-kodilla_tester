package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    public static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(1.67, 40, "Very severely underweight"),
                Arguments.of(1.67, 42, "Severely underweight"),
                Arguments.of(1.67, 47, "Underweight"),
                Arguments.of(1.67, 60, "Normal (healthy weight)"),
                Arguments.of(1.67, 75, "Overweight"),
                Arguments.of(1.67, 90, "Obese Class I (Moderately obese)"),
                Arguments.of(1.67, 100, "Obese Class II (Severely obese)"),
                Arguments.of(1.67, 115, "Obese Class III (Very severely obese)"),
                Arguments.of(1.67, 130, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.67, 150, "Obese Class V (Super Obese)"),
                Arguments.of(1.67, 170, "Obese Class VI (Hyper Obese)")
        );
    }
}
