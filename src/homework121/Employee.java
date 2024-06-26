package homework121;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Employee(String name, String position, String email, String phone, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;


    }

    public void printData() {
        System.out.printf("Name: %s, position: %s, email: %s, phone number: %s, age %d\n", name, position, email,
                phone, age);
    }

    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Tom Jones", "doctor", "ds@email.com",
                "+1-855-235-45-55", 35);
        firstEmployee.printData();
    }

}


