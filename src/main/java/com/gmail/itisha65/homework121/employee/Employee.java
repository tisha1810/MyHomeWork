package com.gmail.itisha65.homework121.employee;

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

    public String toString() {
        return "[Name: " + name + ", position: " + position + ", email: " + email + ", phone number: " + phone +
                " age: " + age + "]";
    }
}

class EmployeeRun {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom Jones", "doctor", "doc@email.com",
                "+1-855-355-45-25", 35);
        System.out.println(employee);


    }


}


