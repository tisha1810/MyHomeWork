package com.gmail.itisha65.homework131;

public class Square implements CalculableFigure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
