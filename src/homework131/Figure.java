package homework131;

public abstract class Figure implements CalculableFigure {
}

class FigureDemo {
    public static void main(String[] args) {
        Figure[] figures = {new Square(7), new Circle(5), new Triangle(6, 7)};
        System.out.printf("Sum of all areas = %.2f", calculateAllAreas(figures));
    }


    public static double calculateAllAreas(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.calculateArea();
        }
        return sum;
    }
}
