package com.gmail.itisha65.homework161;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        this.calculator = new Calculator();
    }

    @Test
    void additionTest() {
        double result = calculator.addition(5, 5);

        assertEquals(10, result);
    }

    @Test
    void subtractionTest() {
        double result = calculator.subtraction(5, 5);

        assertEquals(0, result);
    }

    @Test
    void multiplyTest() {
        double result = calculator.multiplication(5, 2);

        assertEquals(10, result);
    }

    @Test
    void dividingTest() {
        double result = calculator.dividing(2, 2);

        assertEquals(1, result);
    }

    @Test
    void dividingZeroTest() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.dividing(10, 0);
        });
        assertEquals("Invalid operation", exception.getMessage());
    }
}