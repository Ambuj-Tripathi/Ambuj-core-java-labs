package com.deloitte.lab9.streamAPI;

import java.time.LocalDate;

public class Employee {

	int EmployeeId;
	String fname;
	String lname;
	String email;
	String phoneNumber;
	LocalDate hireDate;
	String designation;
	double salary;
	int managerId;
	Department department;
	
	public Employee(int employeeId, String fname, String lname, String email, String phoneNumber, LocalDate hireDate,
			String designation, double slary, int managerId, Department department) {
		EmployeeId = employeeId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.designation = designation;
		this.salary = slary;
		this.managerId = managerId;
		this.department = department;
	}
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double slary) {
		this.salary = slary;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", designation=" + designation
				+ ", salary=" + salary + ", managerId=" + managerId + ", department=" + department + "]";
	}
	
	
}
