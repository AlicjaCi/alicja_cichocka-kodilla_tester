package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource({
            "user75, true",
            "user_1, true",
            "user.2, true",
            "USER.2, true",
            "UseR.2, true",
            "u-22, true",
            "us, false",
            "user!, false",
            "'', false",
            "us@er, false",
            "user%, false"
    })
    public void testValidateUsername(String username, boolean expected) {
        assertEquals(expected, userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource({
            "test@domain.com, true",
            "user.name@domain.co, true",
            "user123@sub.domain.com, true",
            "user@domain, false",
            "user_name@domain.com, true",
            "user@domain.com, true",
            "user@domain..com, false",
            "user@@domain.com, false",
            "user@.com, false",
            "user@domain.c, true",
            "user@user@domain.com, false",
            "\\', false",
            ", false"
    })
    public void testValidateEmail(String email, boolean expected) {
        assertEquals(expected, userValidator.validateEmail(email));
    }
}
