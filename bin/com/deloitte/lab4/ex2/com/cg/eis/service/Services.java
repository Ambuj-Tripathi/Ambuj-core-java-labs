package com.deloitte.lab4.ex2.com.cg.eis.service;

import java.util.Scanner;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;

interface employeeService
{
	void getEmployeeDetails(Employee employee);
    String findInsuranceScheme(double salary, String designation);
    void displayEmployeeDetails(Employee employee);
}
	
public class Services implements employeeService {
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void getEmployeeDetails(Employee employee) {
		
		System.out.println("Enter Employee id");
		employee.setId(sc.nextInt());
		
		
		System.out.println("Enter Employee name");
		employee.setName(sc.next());
		
		
		System.out.println("Enter Employee salary");
		employee.setSalary(sc.nextDouble());
		
		
		System.out.println("Enter Employee designation");
		employee.setDesignation(sc.next());
		
		employee.setInsuranceScheme(findInsuranceScheme(employee.getSalary(), employee.getDesignation()));
	}

	@Override
	public String findInsuranceScheme(double salary, String designation) {
		
		if(salary > 15000.0 && designation.equals("C")) {
	        return "Scheme 3";
	    } 
		else if(salary > 10000.0 && designation.equals("B")) {
	        return "Scheme 2";
	    } 
		else if(salary > 5000.0 && designation.equals("A")) {
	        return "Scheme 1";
	    } 
		else {
	        return "No scheme can be applied";
		}
	}

	@Override
	public void displayEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Employee Details: ");
		System.out.println("Id: "+employee.getId());
		System.out.println("Name: "+employee.getName());
		System.out.println("Salary: "+employee.getSalary());
		System.out.println("Designation: "+employee.getDesignation());
		System.out.println("Insurance scheme: "+employee.getInsuranceScheme());
	}	

}
