package com.edu.homework3;

import java.util.Calendar;

public class Person {

	public static void main(String[] args) {
		
		Person person1 = new Person("Robb", 1998);
		Person person2 = new Person("Sansa", 2002);
		Person person3 = new Person("Arya", 2004);
		Person person4 = new Person("Bran", 2005);
		Person person5 = new Person();
		
		person5.input("Rickon", 2009);
		
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();

		System.out.println();
		
		person1.changeName("Robb2");
		person2.changeName("Sansa2");
		person3.changeName("Arya2");
		person4.changeName("Bran2");
		person5.changeName("Rickon2");
		
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();
	}
	
	private String name;
	private int birthYear = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public Person() {
		
	}
	
	private int age() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR) - this.birthYear;
	}
	
	private void input(String name, int birthYear) {
		setName(name);
		setBirthYear(birthYear);
	}
	
	private void output() {
		System.out.println("Name - " + getName() + ". Year of birth - " + getBirthYear() + ". Age - " + age() + " years.");
	}
	
	private void changeName(String name) {
		setName(name);
	}
}