package com.example.individualprep.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class ArithmeticUtilityTests {
    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    @DisplayName("Should calculate positive power correctly")
    void exponent_Positive_Success() {
        double base = 5.0;
        int power = 3;
        double expectedResult = 125.0;

        double actualResult = arithmeticUtility.exponent(base, power);

        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    @DisplayName("Should return 1.0 when power is zero")
    void exponent_Zero_Success() {
        double base = 12345.0;
        int power = 0;
        double expectedResult = 1.0;

        double actualResult = arithmeticUtility.exponent(base, power);

        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    @DisplayName("Should handle negative power correctly (inverse)")
    void exponent_Negative_Success() {
        double base = 2.0;
        int power = -3;
        double expectedResult = 0.125;

        double actualResult = arithmeticUtility.exponent(base, power);

        assertEquals(expectedResult, actualResult, 0.0001);
    }
}
