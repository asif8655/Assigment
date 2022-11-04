package com.first.assigment.entity;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("1")
	private String employeeId;
	@Value("Asif")
	private String employeeName;
	@Value("Mumbra")
	private String employeeAdd;
	@Value("300000")
	private double salary;
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAdd=" + employeeAdd
				+ "]";
	}
	
	
	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeAdd() {
		return employeeAdd;
	}


	public void setEmployeeAdd(String employeeAdd) {
		this.employeeAdd = employeeAdd;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	//Calculate Salary increment 
	public Double salaryIncrement() {
		int years;
		double increment;
		System.out.println("How many years bond");
		Scanner scanYear = new Scanner(System.in);
		years = scanYear.nextInt();
		System.out.println("Average increment in percent");
		Scanner scanIncrement = new Scanner(System.in);
		increment = scanIncrement.nextDouble();
		
//		3000/100*20
		
		double totalSalary=this.salary;
//		per year=this.salary/100*increment;
//		per year =600+this.salary
//		per year real salary=per year //3600
		for(int i = 0;i<years;i++) {
		 double incrementSalary=(totalSalary/100)*increment;
		 totalSalary= incrementSalary+totalSalary;
		}
		return totalSalary;
	}
	
	
	

}
