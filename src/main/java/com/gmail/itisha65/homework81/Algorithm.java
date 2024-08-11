package com.gmail.itisha65.homework81;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Algorithm {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        System.out.println("----Unsorted array----");
        generateArray(numbers);
        printArray(numbers);

        System.out.println("-----Sorted array-----");
        insertionSort(numbers);
        printArray(numbers);

        System.out.println("Input your number: ");

        Scanner scanner = new Scanner(System.in);
        int searchNumber = scanner.nextInt();

        int index = binarySearch(numbers, searchNumber);

        if (index >= 0) {
            System.out.println("Index of your number is: " + index);
        } else {
            System.out.println("Incorrect element!");
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");

        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("]");
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void generateArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(100);
        }
    }
}

