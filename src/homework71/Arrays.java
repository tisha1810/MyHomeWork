package homework71;

import java.util.concurrent.ThreadLocalRandom;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(-100, 100);

        }
        printArray(numbers);


        int sum = 0;
        System.out.println("----- First task -----");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Sum of even numbers is: " + sum);
        System.out.println("----- Second task ----");

        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Number of odd numbers is: " + counter);
        System.out.println("----- Third task ----");

        sum = numbers.length - counter;

        System.out.println("Number of unpaired numbers is: " + sum);
        System.out.println("----- Four task ----");

        int min = 0;
        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                counter = i;
            }
        }
        System.out.println("Minimal number is: " + min + " (index is " + counter + ")");
        System.out.println("----- Five task ----");

        int max = 0;
        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                counter = i;
            }
        }
        System.out.println("Maximal number is: " + max + " (index is " + counter + ")");
        System.out.println("----- Sixth task ----");

        sum = 0;
        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            counter = i;
            if (numbers[i] < 0) {
                break;
            }
        }
        for (int i = counter + 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double result = 0;

        result = (double) sum / (numbers.length - (counter + 1));
        System.out.printf("Avarage sum is %.2f \n", result);
        System.out.println("----- The End -----");
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();


    }
}


