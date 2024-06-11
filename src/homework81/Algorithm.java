package homework81;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Algorithm {
    public static void main(String[] args) {

        int[] numbers = new int[15];

        System.out.println("----Usorted array----");
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
            System.out.println("Incorrect data!");

        }
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
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
    public static void generateArray(int[]array){
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(100);

        }
    }

}

