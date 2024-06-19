package homework101;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value:");

        int value = scanner.nextInt();
        System.out.println("Square of your value: " + valueSquare(value));

        System.out.println("Input your radius:");
        double radius = scanner.nextDouble();
        System.out.println("Input your high: ");
        double high = scanner.nextDouble();
        System.out.println("Volume of your cylinder: " + volume(radius, high) + " liters");

        System.out.println("Input array size: ");
        value = scanner.nextInt();

        int[] array = generateArray(value);
        printArray(array);

        System.out.println("Sum of your array: " + arraySum(array));

        Scanner scannerLine = new Scanner(System.in);

        System.out.println("Enter line to Revers:");
        String string = scannerLine.nextLine();
        System.out.println("Reverse string: " + reverse(string));

        System.out.println("Input value a:");
        int a = scanner.nextInt();
        System.out.println("Input value b:");
        int b = scanner.nextInt();
        System.out.println("Power of values: " + degreeOfValues(a, b));

        System.out.println("Enter line to print:");
        String line = scannerLine.nextLine();
        System.out.println("Input number of print lines:");
        int n = scanner.nextInt();
        printLines(line, n);
        System.out.println();
        System.out.println("--The End!--");

    }

    public static int valueSquare(int value) {
        int result = value * value;
        return result;
    }

    public static double volume(double radius, double high) {
        double volume = Math.PI * (radius * radius) * high;
        return volume;
    }

    public static int[] generateArray(int value) {
        int[] array = new int[value];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 50);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static String reverse(String string) {
        if (string.length() <= 1) {
            return string;
        }
        return reverse(string.substring(1)) + string.charAt(0);
    }

    public static int degreeOfValues(int a, int b) {
        int result = (int) Math.pow(a, b);
        return result;
    }

    public static void printLines(String line, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(line);

        }
    }
}
