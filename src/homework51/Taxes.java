package homework51;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your salary:");

        int salary = scanner.nextInt();
        double percent = 2.5;
        double tax = salary * percent / 100;


        if (salary > 0 && salary <= 10000) {
            System.out.println("Your tax is: " + tax);
        } else if (salary > 10000 && salary <= 25000) {
            percent = 4.3;
            tax = salary * percent / 100;
            System.out.println("Your tax is: " + tax);
        } else if (salary > 25000) {
            percent = 6.7;
            tax = salary * percent / 100;
            System.out.println("Yor tax is: " + tax);
        } else {
            System.out.println("Not calculated!");
        }
        scanner.close();
    }
}
