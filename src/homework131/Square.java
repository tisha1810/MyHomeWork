package homework131;

public class Square implements CalculableFigure {
    private int side;
    private double area;

    public Square(int side) {
        this.side = side;
        area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
