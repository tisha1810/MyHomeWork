package homework111;

public class Person {
    String name;
    int age;
    String profession;
    String newProfession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void printPersonData() {
        System.out.printf("Name: %s, age %d work: %s \n", name, age, profession);
    }

    public void changeProfession(String profession) {
        System.out.println("-  After update profession  -");
        this.profession = profession;

    }
}
