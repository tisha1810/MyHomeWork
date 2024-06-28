package homework121.employee;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int age;

    Employee(String name, String position, String email, String phone, int age) {
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
}

class EmployeeRun {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom Jones", "doctor", "doc@email.com",
                "+1-855-355-45-25", 35);
        employee.printData();

    }

}


