package homework111;

public class PersonData {
    public static void main(String[] args) {
        System.out.println("----- 1st -----");

        Person firstPerson = new Person("Matt", 37, "lawyer");
        Person.printPersonData(firstPerson.name, firstPerson.age, firstPerson.profession);

        Person secondPerson = new Person("Allison", 32, "doctor");
        Person.printPersonData(secondPerson.name, secondPerson.age, secondPerson.profession);

        Person thirdPerson = new Person("Michael", 45, "policeman");
        Person.printPersonData(thirdPerson.name, thirdPerson.age, thirdPerson.profession);

        System.out.println("----- 2nd -----");

        Person fourPerson = new Person("Emma", 29, "journalist");
        Person.printPersonData(fourPerson.name, fourPerson.age, fourPerson.profession);
        Person.printPersonData(fourPerson.name, fourPerson.age, Person.changeProfession());

    }
}
