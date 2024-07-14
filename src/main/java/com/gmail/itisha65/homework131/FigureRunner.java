package com.gmail.itisha65.homework131;

public class FigureRunner {
    public static void main(String[] args) {
        CalculableFigure[] figures = {
                new Circle(7),
                new Triangle(19, 25),
                new Square(18)
        };
        System.out.printf("Sum of all areas = %.2f", calculateAllArea(figures));
    }

    public static double calculateAllArea(CalculableFigure[] figures) {
        double sum = 0;
        for (CalculableFigure figure : figures) {
            sum += figure.calculateArea();
        }
        return sum;
    }
}
