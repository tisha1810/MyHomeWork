package homework131;

public class Circle extends Figures implements Calculable {
    private final double PI;
    private final int RADIUS;

    public Circle(double PI, int RADIUS){
        this.PI = PI;
        this.RADIUS = RADIUS;
    }

    @Override
    public double calculate() {
        return PI * (RADIUS * RADIUS);
    }
}
