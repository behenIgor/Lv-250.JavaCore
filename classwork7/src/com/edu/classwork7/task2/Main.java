package com.edu.classwork7.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		employeeMap.put(1, "Wolfgang Mozart");
		employeeMap.put(2, "Giordano Bruno");
		employeeMap.put(3, "Rene Descartes");
		employeeMap.put(4, "Ivan Sechenov");
		employeeMap.put(5, "Erich Fromm");
		employeeMap.put(6, "Rafael Sabatini");
		employeeMap.put(7, "Johann Gauss");
		
		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ". Name: " +
					entry.getValue());
		}

		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease, enter employee's ID:");
		int employeeId = Integer.parseInt(sc.nextLine());
		
		if (employeeMap.containsKey(employeeId)) {
			System.out.println("Name: " + employeeMap.get(employeeId));
		} else {
			System.out.println("There is no such ID of employee.");
		}
		
		System.out.println("\nPlease, enter employee's name:");
		String employeeName = sc.nextLine();
		
		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			
			if (!employeeMap.containsValue(employeeName)) {
				System.out.println("There is no such name of employee.");
				break;
			}
			
			if(entry.getValue().contains(employeeName)) {
				System.out.println("Employee's ID: " + entry.getKey());
			}
			
		}
		
		sc.close();
		
	}

}
