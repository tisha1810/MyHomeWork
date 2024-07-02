package homework131;

public class Figure implements Calculable {

    @Override
    public double calculate() {
        return 0;
    }

    public static void main(String[] args) {
        Figure[] figures = {
                new Circle(Math.PI, 2),
                new Square(4, 4),
                new Triangle(4, 7)
        };
        System.out.printf("Sum of all areas = %.2f", sumAllAreas(figures));
    }

    public static double sumAllAreas(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.calculate();
        }
        return sum;
    }
}