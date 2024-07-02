package homework131;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(Math.PI, 2);
        System.out.printf("Square of circle is: %.2f \n", circle.calculate());

        Square square = new Square(4, 4);
        System.out.println("Square of square: " + square.calculate());

        Triangle triangle = new Triangle(4, 7);
        System.out.println("Square of triangle: " + triangle.calculate());

        double sum = circle.calculate() + triangle.calculate() + square.calculate();
        System.out.printf("%.2f", sum);
    }

}
