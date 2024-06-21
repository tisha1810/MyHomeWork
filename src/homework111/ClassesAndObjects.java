package homework111;

import java.util.Scanner;

public class ClassesAndObjects {
    public static void main(String[] args) {
        System.out.println("---- 1 st ----");

        Person firstPerson = new Person("John", 45, "doctor");
        Person secondPerson = new Person("Anna", 37, "designer");
        Person thirdPerson = new Person("Matt", 55, "policeman");

        System.out.println("---- 2 nd ----");
        Person fourPerson = new Person("Tom", 53, "teacher");
        Person changeProfession = new Person("Tom", 53);
    }
}

class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        System.out.println("Name: " + name + ", age " + age + ", work: " + profession);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", age " + age + ", work: " + changeProfession(profession));

    }


    public static String changeProfession(String profession) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new profession:");
        profession = scanner.nextLine();
        return profession;
    }
}



