package com.gmail.itisha65.homework131;

public class Circle implements CalculableFigure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
}
