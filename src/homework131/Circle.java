package homework131;

public class Circle implements Calculable {
    double pi;
    int radius;

    public Circle(double pi, int radius) {
        this.pi = Math.PI;
        this.radius = radius;

    }

    @Override
    public double calculateSquare() {
        return pi * (radius * radius);
    }
}
