package com.employee.managemen;

public class Emp {
	private int empId;
	private String name;
	private String city;
	private double salary;

	Emp(int empId, String name, String city,  double salary ){
		this.empId = empId;
		this.name= name;
		this.city=city;
		this.salary=salary;
	}
	public int getEmpId() {
		return empId;
		
	}
	public String getName() {
		return name;
		
	}
	public String getCity() {
		return city;
		
	}
	public double getSalary() {
		return salary;
		
	}
	
	public String toString() {
		return empId+" "+name+" "+salary;
		
	}
}
