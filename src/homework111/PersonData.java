package homework111;

public class PersonData {
    public static void main(String[] args) {
        System.out.println("----- 1st -----");

        Person firstPerson = new Person("Matt", 37, "lawyer");
        System.out.printf("1) Name %s, age %d work: %s \n", firstPerson.name, firstPerson.age, firstPerson.profession);

        Person secondPerson = new Person("Allison", 32, "doctor");
        System.out.printf("2) Name %s, age %d work: %s \n", secondPerson.name, secondPerson.age, secondPerson.profession);


        Person thirdPerson = new Person("Michael", 45, "policeman");
        System.out.printf("3) Name %s, age %d work: %s \n", thirdPerson.name, thirdPerson.age, thirdPerson.profession);

        System.out.println("----- 2nd -----");

        Person fourPerson = new Person("Emma", 29, "journalist");
        System.out.printf("4) Name %s, age %d work: %s \n", fourPerson.name, fourPerson.age, fourPerson.profession);
    }
}
