package homework111;

public class PersonData {
    public static void main(String[] args) {
        System.out.println("----- 1st -----");

        Person firstPerson = new Person("Matt", 37, "lawyer");
        firstPerson.printPersonData();

        Person secondPerson = new Person("Allison", 32, "doctor");
        secondPerson.printPersonData();

        Person thirdPerson = new Person("Michael", 45, "policeman");
        thirdPerson.printPersonData();

        System.out.println("----- 2nd -----");

        Person fourPerson = new Person("Emma", 29, "journalist");
        fourPerson.printPersonData();
        fourPerson.changeProfession();

    }
}
