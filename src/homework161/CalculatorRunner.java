package homework161;

import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println(" in : ");
        double a = scanner.nextDouble();
        char operation = scanner.next().charAt(0);
        double b = scanner.nextDouble();

        if (operation == '+') {
            System.out.println("= " + calculator.addition(a, b));
        } else if (operation == '-') {
            System.out.println("= " + calculator.subtraction(a, b));
        } else if (operation == '*') {
            System.out.println("= " + calculator.multiplication(a, b));
        } else if (operation == '/') {
            System.out.println("= " + calculator.dividing(a, b));
        } else {
            System.out.println("Invalid operation!");
        }
    }
}
