package homework131;

public class Triangle implements CalculableFigure {
    private int base;
    private int highest;

    public Triangle(int base, int highest) {
        this.base = base;
        this.highest = highest;
    }

    @Override
    public double calculateArea() {
        return (double) (base * highest) / 2;
    }
}
