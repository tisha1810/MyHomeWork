package homework131;

public class Square extends Figure {
    private int side;
    double area;

    public Square(int side) {
        this.side = side;
        area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
