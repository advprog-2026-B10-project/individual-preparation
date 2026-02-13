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

    @Test
    @DisplayName("Should subtract two positive numbers correctly")
    void subtract_PositiveNumbers_Success() {
        double a = 10.5;
        double b = 4.2;
        double expectedResult = 6.3;

        double actualResult = arithmeticUtility.subtract(a, b);

        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    @DisplayName("Should subtract negative numbers correctly")
    void subtract_NegativeNumbers_Success() {
        double a = -5.0;
        double b = -3.0;
        double expectedResult = -2.0;

        double actualResult = arithmeticUtility.subtract(a, b);

        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    @DisplayName("Should add positive numbers correctly")
    void add_Positive_Success() {
        double x = 3.4;
        double y = 9.1;
        double expectedResult = 12.5;

        double actualResult = arithmeticUtility.add(x, y);

        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    @DisplayName("Should add negative numbers correctly")
    void add_Negative_Success() {
        double x = -2.5;
        double y = -7.4;
        double expectedResult = -9.9;

        double actualResult = arithmeticUtility.add(x, y);

        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    @DisplayName("Should add zero correctly")
    void add_Zero_Success() {
        double x = 12345.67;
        double y = 0.0;
        double expectedResult = 12345.67;

        double actualResult = arithmeticUtility.add(x, y);

        assertEquals(expectedResult, actualResult, 0.0001);
    }
}
