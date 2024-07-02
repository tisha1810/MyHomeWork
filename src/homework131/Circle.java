package homework131;

public class Circle extends Figure implements Calculable {
    double pi;
    int radius;

    public Circle(double pi, int radius) {
        this.pi = pi;
        this.radius = radius;
    }

    @Override
    public double calculate() {
        return pi * (radius * radius);
    }
}
