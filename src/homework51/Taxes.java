package homework51;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your salary:");

        int salary = scanner.nextInt();
        double percent = 2.5;
        double result = salary * percent / 100;

    }
}
