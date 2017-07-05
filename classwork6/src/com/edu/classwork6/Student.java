package com.edu.classwork6;

public class Student extends Person {

	final String TYPE_PERSON = this.getClass().getSimpleName();
	
	public void print() {
		System.out.println("I am a " + TYPE_PERSON.toLowerCase());
	}

	public String getTYPE_PERSON() {
		return TYPE_PERSON;
	}

	public Student(String name) {
		super(name);
		System.out.println(TYPE_PERSON);
	}
	
}
