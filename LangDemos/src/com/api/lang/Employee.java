package com.api.lang;
//Domain Model -- java bean : is a public class with a private instance variable,public getter and setter methods.
public class Employee {
	
	private String employeeName;
	private Integer employeeId;
	private double salary;
	public Employee(String employeeName, Integer employeeId, double salary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}
	
	//setter using set+employeeName
//setter method takes parameters
	
	//always frameworkd need default construster
	//parameter constructer
	
}
