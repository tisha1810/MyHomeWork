package homework51;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your salary:");

        int salary = scanner.nextInt();

        double lowPercent = 2.5;
        double midPercent = 4.3;
        double highPercent = 6.7;

        double lowTax = salary * lowPercent / 100;
        double midTax = salary * midPercent / 100;
        double highTax = salary * highPercent / 100;

        if (salary > 0 & salary <=10000) {
            System.out.println("Your tax is: " + lowTax);
        } else if (salary > 10000 & salary <= 25000) {
            System.out.println("Your tax is: " + midTax);
        } else if (salary > 25000) {
            System.out.println("Your tax is: " + highTax);
        } else {
            System.out.println("Not calculated!");
        }
        scanner.close();
    }
}
