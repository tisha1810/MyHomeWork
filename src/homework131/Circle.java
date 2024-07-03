package homework131;

public class Circle implements CalculableFigure {
    private final double PI;
    private int radius;
    private double area;

    public Circle(int radius) {
        this.radius = radius;
        PI = Math.PI;
        area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return PI * (radius * radius);
    }
}
