package com.example.domain;

public class Employee 
{
	public int empId;
	public String name;
	public String ssn;
	public double salary;
	
	public Employee() {}
	
	public int getEmpId() 
	{
		return empId;
	}
	public void setEmpId(int val) 
	{
		this.empId=val;	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String val1) 
	{
		this.name=val1;
	}
	
	public String getSsn() 
	{
		return ssn;
	}
	public void setSsn(String val2) 
	{
		this.ssn=val2;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double val3) 
	{
		this.salary=val3;
	}
}
