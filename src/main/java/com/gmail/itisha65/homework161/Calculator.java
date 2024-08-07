package com.gmail.itisha65.homework161;

public class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double dividing(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Invalid operation");
        }
        return a / b;
    }
}
