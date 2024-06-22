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

    public void printPersonData() {
        System.out.printf("Name: %s, age %d work: %s \n", name, age, profession);
    }

    public void printUpdateData() {
        System.out.printf("Name: %s, age %d work: %s \n", name, age, changeProfession());
    }

    public String changeProfession() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your new profession:");
        String newProfession = scanner.nextLine();
        System.out.println("- After update profession -");
        return newProfession;
    }

}
