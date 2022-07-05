package com.example1;

import com.example.domain.Employee;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		Employee emp= new Employee();
		emp.setEmpId(110);
		emp.setName("Василий Фёдоров");
		emp.setSalary(1203432.7);
		emp.setSsn("+374-44-452-000-4");
		System.out.println("Employee ID: "+emp.getEmpId());
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Employee Soc Sec # "+emp.getSsn());
		System.out.println("Employee salary: "+emp.getSalary());
	}

}
