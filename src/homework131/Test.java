package homework131;

public class Test {
    public static void main(String[] args) {

        Figure triangle = new Triangle(4, 7);
        triangle.calculate();
        System.out.println("Area of a triangle = " + triangle.calculate());

        Figure circle = new Circle(Math.PI, 2);
        circle.calculate();
        System.out.printf("Area of a circle = %.2f \n", circle.calculate());

        Figure square = new Square(4, 4);
        square.calculate();
        System.out.println("Area of the square = " + square.calculate());

        double sum = triangle.calculate() + circle.calculate() + square.calculate();
        System.out.printf("Sum of areas = %.2f", sum);

    }
}
