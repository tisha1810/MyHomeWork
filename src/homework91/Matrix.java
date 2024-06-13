package homework91;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the desired matrix size: ");

        int maxSize = scanner.nextInt();
        int[][] matrix = new int[maxSize][maxSize];

        System.out.println("---Random MATRIX---");

        generateMatrix(matrix);
        printMatrix(matrix);

        int sum = sumMatrixEven(matrix);
        System.out.println("Sum of even rows " + sum);

        sum = sumMatrixObb(matrix);
        System.out.println("Sum of obb rows " + sum);

        long product = productEvenColumns(matrix);
        System.out.println("Product of even columns " + product);

        product = productObbColumns(matrix);
        System.out.println("Product of obb columns " + product);

        sum = magicSquare(matrix);
        if (sum > 0) {
            System.out.println("Bingo! Magical square!");
        } else {
            System.out.println("It's not magical square.");
        }
    }

    public static void generateMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(1,50);
            }
        }
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumMatrixEven(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static int sumMatrixObb(int[][] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i += 2) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static long productEvenColumns(int[][] array) {
        long product = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j += 2) {
                product *= array[i][j];
            }
        }
        return product;
    }

    public static long productObbColumns(int[][] array) {
        long product = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j += 2) {
                product *= array[i][j];
            }
        }
        return product;
    }

    public static int magicSquare(int[][] array) {
        int inchSum = 0;
        int rowSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    inchSum += array[i][j];
                }
            }
        }
        for (int i = 0; i == 0; i++) {
            for (int j = 0; j < array.length; j++) {
                rowSum += array[i][j];
            }
        }
        int columnSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j == 0; j++) {
                columnSum += array[i][j];
                if (inchSum == rowSum && rowSum == columnSum) {
                    return 1;
                }
            }
        }
        return -1;
    }
}
