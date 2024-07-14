package homework161;

import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("input 'a' variable: ");
        double a = scanner.nextDouble();

        System.out.println("input operator:");
        char operator = scanner.next().charAt(0);

        System.out.println("input 'b' variable:");
        double b = scanner.nextDouble();

        if (operator == '+') {
            System.out.println("= " + calculator.addition(a, b));
        } else if (operator == '-') {
            System.out.println("= " + calculator.subtraction(a, b));
        } else if (operator == '*') {
            System.out.println("= " + calculator.multiplication(a, b));
        } else if (operator == '/') {
            System.out.println("= " + calculator.dividing(a, b));
        } else {
            System.out.println("Invalid operation!");
        }

    }
}
