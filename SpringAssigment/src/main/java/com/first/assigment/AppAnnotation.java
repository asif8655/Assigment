package com.first.assigment;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.first.assigment.entity.Employee;

@Configuration
@ComponentScan
public class AppAnnotation {
	
	
	
	private static Logger logger = Logger.getLogger(AppAnnotation.class);
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppAnnotation.class);
		
		logger.info("Main method Started");
		logger.warn("Something went wrong");
		Employee employee=context.getBean(Employee.class);
		logger.info(employee);
		System.out.println(employee);
		double totalSalary=employee.salaryIncrement()+employee.getSalary();
		System.out.println("Before Increment     :"+employee.getSalary());
		System.out.println("After Increment      :"+totalSalary);
		
	}
	
	
	

}
