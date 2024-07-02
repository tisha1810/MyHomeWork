package homework131;

public class Triangle extends Figures implements Calculable {
    private final int BASE;
    private final int HIGHEST;

    public Triangle(int BASE, int HIGHEST) {
        this.BASE = BASE;
        this.HIGHEST = HIGHEST;
    }

    @Override
    public double calculate() {
        return (double) (BASE * HIGHEST) / 2;

    }
}
