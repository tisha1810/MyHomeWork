package com.gmail.itisha65.homework131;

public class Triangle implements CalculableFigure {
    private final int base;
    private final int highest;

    public Triangle(int base, int highest) {
        this.base = base;
        this.highest = highest;
    }

    @Override
    public double calculateArea() {
        return (double) (base * highest) / 2;
    }
}
