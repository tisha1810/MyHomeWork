package homework131;

public class Triangle extends Figure {
    private int base;
    private int highest;
    private double area;

    public Triangle(int base, int highest) {
        this.base = base;
        this.highest = highest;
        area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return (double) (base * highest) / 2;
    }
}
