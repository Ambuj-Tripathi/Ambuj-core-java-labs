package com.deloitte.lab9.streamAPI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

	  public static List<Employee> getEmployees() {
		  
	        Department department1 = new Department(101, "Human Resources", 201);
	        Department department2 = new Department(102, "Finance", 202);
	        Department department3 = new Department(103, "IT", 203);
	        Department department4 = new Department(104, "Marketing", 204);
	        Department department5 = new Department(105, "Sales", 205);

	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(1, "Alice", "Johnson", "alice.johnson@example.com", "123-456-7890",
	            LocalDate.of(2020, 5, 15), "HR Manager", 75000.00, 201, department1));
	        employees.add(new Employee(2, "Bob", "Smith", "bob.smith@example.com", "123-555-7890",
	            LocalDate.of(2018, 3, 22), "Financial Analyst", 65000.00, 202, department2));
	        employees.add(new Employee(3, "Charlie", "Brown", "charlie.brown@example.com", "123-666-7890",
	            LocalDate.of(2019, 7, 11), "Software Engineer", 80000.00, 203, department3));
	        employees.add(new Employee(4, "David", "Williams", "david.williams@example.com", "123-777-7890",
	            LocalDate.of(2021, 1, 5), "Marketing Specialist", 60000.00, 204, department4));
	        employees.add(new Employee(5, "Eva", "Miller", "eva.miller@example.com", "123-888-7890",
	            LocalDate.of(2022, 10, 13), "Sales Executive", 55000.00, 205, department5));

	        return employees;
	    }
}
