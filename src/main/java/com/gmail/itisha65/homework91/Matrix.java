package com.gmail.itisha65.homework91;

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

            System.out.println("------");
            int initialRow = 0;
            System.out.println("Sum of even rows " + sumRows(matrix, initialRow));

            System.out.println("------");
            initialRow = 1;
            System.out.println("Sum of odd rows " + sumRows(matrix, initialRow));

            System.out.println("------");
            initialRow = 0;
            System.out.println("Product of even columns " + productColumns(matrix, initialRow));

            System.out.println("------");
            initialRow = 1;
            System.out.println("Product of odd columns " + productColumns(matrix, initialRow));
        }
        boolean checkMagicSquare = isMagicSquare(matrix);
        System.out.println("------");
        if (!checkMagicSquare) {
            System.out.println("Is not magic square.");
        } else {
            System.out.println("Bingo it's magic square!!!");
        }
        System.out.println("-- The End --");
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
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
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
        for (int[] ints : array) {
            for (int j = initialRow; j < array.length; j += 2) {
                product *= ints[j];
            }
        }
        return product;
    }

    public static boolean isMagicSquare(int[][] array) {
        int magicSum = 0;
        for (int j = 0; j < array.length; j++) {
            magicSum += array[0][j];
        }
        for (int i = 1; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array.length; j++) {
                rowSum += array[i][j];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }
        for (int j = 0; j < array.length; j++) {
            int colSum = 0;
            for (int[] ints : array) {
                colSum += ints[j];
            }
            if (colSum != magicSum) {
                return false;
            }
            int mainDiagonalSum = 0;
            for (int i = 0; i < array.length; i++) {
                mainDiagonalSum += array[i][i];
            }
            if (mainDiagonalSum != magicSum) {
                return false;
            }
            int secDiagonalSum = 0;
            for (int i = 0; i < array.length; i++) {
                secDiagonalSum += array[i][array.length - 1 - i];
            }
            if (secDiagonalSum != magicSum) {
                return false;
            }
        }
        return true;
    }
}
