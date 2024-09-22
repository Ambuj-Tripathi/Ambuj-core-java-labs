package com.deloitte.lab4.ex2.com.cg.eis.pl;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;
import com.deloitte.lab4.ex2.com.cg.eis.service.Services;

public class Lab2Ex4 {

	public static void main(String[] args) {

	      Employee employee = new Employee(0, "", 0.0, "");
	      Services empServices = new Services();
	      
	      empServices.getEmployeeDetails(employee);
	      empServices.displayEmployeeDetails(employee);
	      
	      
	      
	}
}
