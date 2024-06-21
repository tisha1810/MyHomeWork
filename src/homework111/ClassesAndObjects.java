package homework111;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person firstPerson = new Person("John", 45, "doctor");
        Person secondPerson = new Person("Anna", 37, "journalist");
        Person thirdPerson = new Person("Matt", 55, "designer");


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
}



