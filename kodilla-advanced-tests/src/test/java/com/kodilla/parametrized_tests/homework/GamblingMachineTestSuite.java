package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv", numLinesToSkip = 1)
    public void testHowManyWins_InvalidNumbers(String numbers) {
        Set<Integer> userNumbers = parseNumbers(numbers);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    private Set<Integer> parseNumbers(String numbers) {
        Set<Integer> numberSet = new HashSet<>();
        String[] numArray = numbers.split(", ");
        for (String num : numArray) {
            numberSet.add(Integer.parseInt(num));
        }
        return numberSet;
    }

}
