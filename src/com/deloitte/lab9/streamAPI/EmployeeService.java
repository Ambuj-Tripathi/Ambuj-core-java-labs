package com.deloitte.lab9.streamAPI;

import java.time.*;
import java.util.*;
import java.util.stream.Collectors;


public class EmployeeService {

	static List<Employee> employee = EmployeeRepository.getEmployees();
	
	public static void addSalary() {
		
		double totalSalary = employee.stream().mapToDouble(emp -> emp.getSalary()).sum();
		System.out.println("Total Salary: "+ totalSalary);
	}
	
	public static void noOfEmployee() {
		Map<String, Long> employeeCount = employee.stream().collect(
												Collectors.groupingBy(emp -> emp.getDepartment().getDepartmentName(),
														Collectors.counting()
														));
		
		employeeCount.forEach((deparment, count) -> System.out.println(deparment +" "+ count));
							
	}
	
	public static void seniorEmployee() {
		 Optional<Employee> seniorMostEmployee = employee.stream().min(
				 								(emp1, emp2) -> emp1.getHireDate().compareTo(emp2.getHireDate()));
		 
		 seniorMostEmployee.ifPresent(emp -> 
		    System.out.println("Senior-most Employee: " + emp.fname));
	}
	
	public static void ServiceDuration() {
		
        LocalDate currentDate = LocalDate.now();

        for (Employee emp : employee) {
            LocalDate hireDate = emp.hireDate; 
            Period serviceDuration = Period.between(hireDate, currentDate);

            int months = serviceDuration.getYears() * 12 + serviceDuration.getMonths();
            int days = serviceDuration.getDays();

            System.out.printf("Employee: %s %s, Service Duration: %d months and %d days%n", 
                              emp.fname, emp.lname, months, days);
        }
	}
        
        public static void withoutDepartment() {
        	
        	 List<Employee> employeesWithoutDepartment = employee.stream().filter(
        			 										(emp) -> emp.department == null).toList();
        	 
        	 if (employeesWithoutDepartment.isEmpty())
        		 System.out.println("No employee without department");
        	 else
        		 employeesWithoutDepartment.forEach(emp -> System.out.println(emp.fname +" "+ emp.lname));
        }
        
        public static void maxEmployee() {
        	
            Map<Department, Long> employeeCount = employee.stream()
                    .collect(Collectors.groupingBy(emp -> emp.department, Collectors.counting()));
            
            
            System.out.println("Max employee department: "+ Collections.max(employeeCount.values()));
        }
        
        public static void joinDateandDay() {
        	
        	employee.forEach( (emp) -> {
        		
        		System.out.println("Date of joining: "+ emp.getHireDate());
        		System.out.println("Day of joining: "+ emp.getHireDate().getDayOfWeek());
        	});
        }
        
        public static void joiningDay() {
        	
        	String day = "FRIDAY";
        	DayOfWeek dayofweek = DayOfWeek.valueOf(day);
        	
        	employee.stream().filter(emp -> emp.getHireDate().getDayOfWeek() == dayofweek).
        								forEach(emp -> System.out.println(emp.toString()));
        								
        }
        
        public static void reportingTo() {
        	
        	employee.stream().forEach(emp -> System.out.printf("Employee %s %s reports to %d\n",
        								emp.getFname(), emp.getLname(), emp.getManagerId()));
        }
        
        public static void increasedSalary() {
        	
        	employee.forEach(emp -> {
        							double incSalary = emp.getSalary() * 1.15;
        							System.out.printf("%s %s salary increased to %f\n",
        									emp.getFname(), emp.getLname(), incSalary);
        	});
        }
        
        public static void withoutManager() {
        	
        	employee.forEach(emp -> {
        		
        		if(emp.getManagerId() == 0)
        			System.out.printf("%s %s without manager", emp.getFname(), emp.getLname());
        	});
        }
        
        public static void sortingEmployee() {
        	
        	System.out.println("Sorting by employee id: ");
        	
        	employee.stream().sorted((emp1, emp2) -> Integer.compare(emp1.getEmployeeId(), emp2.getEmployeeId())).
        								forEach(emp -> System.out.println(emp.toString()));
        	
        	System.out.println("Sorting by department id: ");
        	
        	employee.stream().sorted((emp1, emp2) -> Integer.compare(emp1.getDepartment().getDepartmentId(), emp2.getDepartment().getDepartmentId())).
        								forEach(emp -> System.out.println(emp.toString()));
        	
        	System.out.println("Sorting by First name: ");
        	
        	employee.stream().sorted((emp1, emp2) -> emp1.getFname().compareTo(emp2.getFname())).
        								forEach(emp -> System.out.println(emp.toString()));
        }
        
      
	
}
