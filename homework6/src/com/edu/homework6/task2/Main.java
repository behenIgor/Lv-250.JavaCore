package com.edu.homework6.task2;

public class Main {

	public static void main(String[] args) {

		Employee employee[] = new Employee[4];
		employee[0] = new SalariedEmployee("Charles Bronson", "235-98", 642465596, 1500);
		employee[1] = new SalariedEmployee("Jack Sparrow", "687-89", 549721387, 2000);
		employee[2] = new ContractEmployee("Ramzan Kadyrov", "59487-01", 768921037, 25, 150);
		employee[3] = new ContractEmployee("Alexandr Lukashenko", "65248-56", 231759872, 
				50, 100);
		
		Employee tmp;
		
		for (int i = 0; i < employee.length - 1; i++) {
			for (int j = i + 1; j < employee.length; j++) {
					if (employee[i].calculatePay() < employee[j].calculatePay()) {
						tmp = employee[i];
	                    employee[i] = employee[j];
	                    employee[j] = tmp;
					}
			}
		}
		
		for (int i = 0; i < employee.length; i++) {
			System.out.println("Employee ID: " + employee[i].getEmployeeId() + ". Name: " + 
		employee[i].getName() + ". Average monthly salary: " + employee[i].calculatePay());
		}
	
	}
	
}
