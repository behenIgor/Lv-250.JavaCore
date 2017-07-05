package com.edu.classwork6;

public class Teacher extends Staff{

	final String TYPE_PERSON = this.getClass().getSimpleName();
	
	public void print() {
		System.out.println("I am a " + TYPE_PERSON.toLowerCase());
	}
	
	public int salary() {
		return 6000;
	}

	public String getTYPE_PERSON() {
		return TYPE_PERSON;
	}

	public Teacher(String name) {
		super(name);
		System.out.println(TYPE_PERSON);
	}
	
}
