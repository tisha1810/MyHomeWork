package homework101;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your value:");
        int value = scanner.nextInt();
        System.out.println("Square of your value: " + valueSquare(value));

        System.out.println();
        System.out.println("Input your radius:");
        double radius = scanner.nextDouble();
        System.out.println("Input your high: ");
        double high = scanner.nextDouble();
        System.out.println("Volume of your cylinder: " + volume(radius, high) + " liters");

        System.out.println();
        System.out.println("Input array size: ");
        int size = scanner.nextInt();

        System.out.println();
        int[] array = generateArray(size);
        printArray(array);
        System.out.println("Sum of your array: " + arraySum(array));

        Scanner scannerLine = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter line to Revers:");
        String line = scannerLine.nextLine();
        System.out.println("Reverse string: " + reverse(line));

        System.out.println();
        System.out.println("Input base:");
        int base = scanner.nextInt();
        System.out.println("Input power:");
        int power = scanner.nextInt();
        System.out.println("Power of values: " + degreeOfValues(base, power));

        System.out.println();
        System.out.println("Enter line to print:");
        line = scannerLine.nextLine();
        System.out.println("Input number of print lines:");
        int n = scanner.nextInt();
        printLines(line, n);
        System.out.println();
        System.out.println("--The End!--");

    }

    public static int valueSquare(int value) {
        return value * value;
    }

    public static double volume(double radius, double high) {
        return Math.PI * (radius * radius) * high;
    }

    public static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 50);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("]");
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static String reverse(String line) {
        StringBuilder reverseLine = new StringBuilder(line);
        return reverseLine.reverse().toString();
    }

    public static int degreeOfValues(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void printLines(String line, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(line);

        }
    }
}
