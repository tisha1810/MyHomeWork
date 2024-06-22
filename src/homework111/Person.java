package homework111;

import java.util.Scanner;

public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public static String changeProfession() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your new profession:");
        String newProfession = scanner.nextLine();
        return newProfession;
    }
}
