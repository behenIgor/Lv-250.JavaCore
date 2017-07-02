package com.edu.classwork3;

public class Employee {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setName("Bill");
		employee1.setRate(100);
		employee1.setHours(50);
		
		Employee employee2 = new Employee("John", 150);
		employee2.setHours(35);
		
		Employee employee3 = new Employee("Emily", 150, 20);
		employee3.changeRate(160);
		
		System.out.println("10% from " + employee3.getName() + "'s salary are " + employee3.bonuses() + "$.");
		System.out.println("Total time of all workers is " + totalSum + " hours.");
	}

	private String name;
	private int rate = 0;
	private int hours = 0;
	private static int totalSum = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		totalSum = totalSum - this.hours;
		this.hours = hours;
		totalSum = totalSum + hours;
	}
	public static int getTotalSum() {
		return totalSum;
	}
	public static void setTotalSum(int totalSum) {
		Employee.totalSum = totalSum;
	}
	
	public Employee() {
		
	}
	
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + this.hours;
	}
	
	private int salary() {
		return this.rate * this.hours;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + ". Rate: " + this.rate + "$. Hours: " + this.hours + " hours.";
	}
	
	private void changeRate(int rate) {
		this.rate = rate;
	}
	
	private float bonuses() {
		return (float) salary() * 0.1f;
	}
}
