package com.edu.homework5;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Car car[] = new Car[4];
		car[0] = new Car("Cadillac", 1959, 6400);
		car[1] = new Car("GMC", 1995, 4800);
		car[2] = new Car("Chevrolet", 2005, 2500);
		car[3] = new Car("VAZ", 1970, 1200);
		
		Car tmp;
		
		System.out.print("Enter year of the car: ");
		int year = sc.nextInt();
		
		for (int i = 0; i < car.length; i++) {
			if(year == car[i].getYear()) {
				System.out.println(car[i]);
			}
		}
		
		
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].getYear() < car[j].getYear()) {
					tmp = car[i];
                    car[i] = car[j];
                    car[j] = tmp;
					
				}
			}
		}
		

		System.out.println();
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
		
		sc.close();
		
	}
	
	private String type;
	private int year;
	private int engineCapacity;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public Car(String type, int year, int engineCapacity) {
		this.type = type;
		this.year = year;
		this.engineCapacity = engineCapacity;
	}
	public Car() {
	}
	@Override
	public String toString() {
		return "Model: " + type + ", year: " + year + ", engine capacity: " + engineCapacity;
	}
	

	
}
