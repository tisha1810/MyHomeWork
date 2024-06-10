package homework81;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Algorithm {
    public static void main(String[] args) {

        int[] numbers = new int[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(100);

        }
        System.out.println("----Usorted array----");
        printArray(numbers);

        System.out.println("-----Sorted array-----");
        bubbleSort(numbers);
        printArray(numbers);

        System.out.println("Input your number: ");

        Scanner scanner = new Scanner(System.in);
        int searchNumber = scanner.nextInt();

        int search = binarySearch(numbers, searchNumber);


        System.out.println("Index of your number is: " + search);


    }

    public static void printArray(int[] array) {
        System.out.print("[ ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

    }

    public static void bubbleSort(int[] array) {
        int temp = 0;
        boolean sort = false;

        while (!sort) {
            sort = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sort = false;

                }

            }
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

}

