package homework131;

public class Figures implements Calculable {
    public static void main(String[] args) {
        Figures[] figures = {
                new Circle(Math.PI, 2),
                new Square(4, 4),
                new Triangle(4, 7)
        };
        System.out.printf("Sum all squares = %.2f", sumAllSquares(figures));
    }


    @Override
    public double calculate() {
        return 0;
    }

    public static double sumAllSquares(Figures[] figures) {
        double sum = 0;
        for (Figures figure : figures) {
            sum += figure.calculate();

        }
        return sum;

    }

}