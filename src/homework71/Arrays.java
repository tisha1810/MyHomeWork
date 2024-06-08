package homework71;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {22, 3, 41, 56, -15, 2, -55, -9, 97, 65, -10, -8, 35, 20, -71, 4, 71, -19, 48, -25};

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

        int minOrMax = 0;
        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minOrMax) {
                minOrMax = numbers[i];
                counter = i;
            }
        }
        System.out.println("Minimal number is: " + minOrMax + " (index is " + counter + ")");
        System.out.println("----- Five task ----");

        minOrMax = 0;
        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > minOrMax) {
                minOrMax = numbers[i];
                counter = i;
            }
        }
        System.out.println("Maximal number is: " + minOrMax + " (index is " + counter + ")");
        System.out.println("----- Sixth task ----");

        sum = 0;
        result = 0;
        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            counter = i;
            if (numbers[i] < 0) {
                break;
            }
        }
        for (int i = counter; i < numbers.length; i++) {
            sum += numbers[i];
        }
        result = (double) sum / (numbers.length - counter);
        System.out.printf("Avarage sum is %.2f \n", result);
        System.out.println("----- The End -----");
    }
}

