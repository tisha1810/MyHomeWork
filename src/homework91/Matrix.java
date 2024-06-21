package homework91;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the desired matrix size: ");
        int maxSize = scanner.nextInt();
        int[][] matrix = generateMatrix(maxSize);

        if (maxSize < 2) {
            System.out.println("Can't build the matrix!");
        } else {
            System.out.println("---Random MATRIX---");

            printMatrix(matrix);

            int initialRow = 0;
            System.out.println("Sum of even rows " + sumRows(matrix, initialRow));

            initialRow = 1;
            System.out.println("Sum of odd rows " + sumRows(matrix, initialRow));

            initialRow = 0;
            System.out.println("Product of even columns " + productColumns(matrix, initialRow));

            initialRow = 1;
            System.out.println("Product of odd columns " + productColumns(matrix, initialRow));
        }
    }

    public static int[][] generateMatrix(int maxSize) {
        int[][] matrix = new int[maxSize][maxSize];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(1, 50);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumRows(int[][] array, int initialRow) {
        int sum = 0;
        for (int i = initialRow; i < array.length; i += 2) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static long productColumns(int[][] array, int initialRow) {
        long product = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = initialRow; j < array.length; j += 2) {
                product *= array[i][j];
            }
        }
        return product;
    }

    public static boolean magicSquare(int[][] array) {
        int inchSum = 0;
        for (int i = 0; i < array.length; i++) {
            inchSum += array[i][i];

        }

        return false;

    }
}
