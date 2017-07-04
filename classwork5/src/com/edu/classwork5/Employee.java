package com.edu.classwork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Employee employee[] = new Employee[6];
		employee[0] = new Employee("Olexander", 1, 5000);
		employee[1] = new Employee("Andrii", 1, 6000);
		employee[2] = new Employee("Oleg", 2, 4000);
		employee[3] = new Employee("Nastia", 2, 6000);
		employee[4] = new Employee("Mykhailo", 1, 1500);
		
		System.out.println("Enter number of department: ");
		int departmentNumberFromConsole = Integer.parseInt(br.readLine());
		Employee tmp;
		
		for (int i = 0; i < employee.length - 1; i++) {
			for (int j = i + 1; j < employee.length; j++) {
				if (employee[i].getSalary() < employee[j].getSalary()) {
					tmp = employee[i];
                    employee[i] = employee[j];
                    employee[j] = tmp;
					
				}
			}
		}
		
		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getDepartmentNumber() == departmentNumberFromConsole) {
				System.out.println(employee[i]);
			}
		}

	}
	
	private String name;
	private int departmentNumber;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int departmentNumber, int salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}
	public Employee() {
	}
	@Override
	public String toString() {
		return "Name: " + this.name + ". Salary: " + this.salary;
	}
	
}
