package homework71;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {-22, 3, 41, 56, -15, 2, -55, -9, 97, 11, -10, -8, 5, 20, 10, 4, -71, -19, -48, -25};

        int sum = 0;
        double result = 0;

        System.out.println("----- First task -----");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Sum of negativ numbers is: " + sum);
        System.out.println("----- Second task ----");

        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                counter = counter + 1;
            }
        }
        System.out.println("Number of paired numbers is: " + counter);
        System.out.println("----- Third task ----");

        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                counter = counter + 1;
            }
        }
        System.out.println("Number of unpaired numbers is: " + counter);
        System.out.println("----- Four task ----");

        int minMax = 0;
        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minMax) {
                minMax = numbers[i];
                counter = i;
            }
        }
        System.out.println("Minimal number is: " + minMax + " (index is " + counter + ")");
        System.out.println("----- Five task ----");

        minMax = 0;
        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > minMax) {
                minMax = numbers[i];
                counter = i;
            }
        }
        System.out.println("Maximal number is: " + minMax + " (index is " + counter + ")");
        System.out.println("----- Sixth task ----");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sum += numbers[i];
                result = (double) sum / i;
            }
        }
        System.out.printf("Avarage sum is %.2f \n", result);
        System.out.println("----- The End -----");
    }
}

