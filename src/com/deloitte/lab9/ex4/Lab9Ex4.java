package com.deloitte.lab9.ex4;

class Employee {
    private String name;
    private int age;
    
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

@FunctionalInterface
interface EmployeeFactory {
    Employee create(String name, int age);
}

public class Lab9Ex4 {
    public static void main(String[] args) {
        EmployeeFactory empFactory = Employee::new;

        Employee emp = empFactory.create("John", 30);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
    }
}
