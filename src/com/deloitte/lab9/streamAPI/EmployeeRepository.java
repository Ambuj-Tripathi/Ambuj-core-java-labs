package com.deloitte.lab9.streamAPI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    public static List<Employee> getEmployees() {

        Department department1 = new Department(101, "Engineering", 301);
        Department department2 = new Department(102, "Legal", 302);
        Department department3 = new Department(103, "Operations", 303);
        Department department4 = new Department(104, "Research & Development", 304);
        Department department5 = new Department(105, "Customer Service", 305);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Jake", "Manson", "jake.manson@example.com", "111-222-3333",
            LocalDate.of(2015, 9, 28), "Senior Engineer", 95000.00, 301, department1));
        employees.add(new Employee(2, "Jane", "Adams", "jane.adams@example.com", "111-333-4444",
            LocalDate.of(2017, 2, 18), "Legal Advisor", 78000.00, 302, department2));
        employees.add(new Employee(3, "Mike", "Johnson", "mike.johnson@example.com", "111-444-5555",
            LocalDate.of(2016, 11, 5), "Operations Manager", 85000.00, 303, department3));
        employees.add(new Employee(4, "Sara", "Parker", "sara.parker@example.com", "111-555-6666",
            LocalDate.of(2019, 4, 1), "Research Analyst", 72000.00, 304, department4));
        employees.add(new Employee(5, "Ryan", "Anderson", "ryan.anderson@example.com", "111-666-7777",
            LocalDate.of(2020, 6, 10), "Customer Support Manager", 68000.00, 305, department5));

        return employees;
    }
}
