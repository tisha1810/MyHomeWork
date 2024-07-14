package com.gmail.itisha65.homework61;

import java.util.Scanner;

public class CycleCalculationNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your num:");
        int limit = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= limit; i++) {
            result += i;
            System.out.println(i + ")num is, " + i + " sum is: " + result);

        }
        System.out.println(" ");
        System.out.println("Total sum is: " + result);
    }
}
