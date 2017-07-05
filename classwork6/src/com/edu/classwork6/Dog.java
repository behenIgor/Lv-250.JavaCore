package com.edu.classwork6;

public class Dog implements Animal {

	@Override
	public String voice() {
		return "woof";
	}
	
	@Override
	public String feed() {
		return "meat";
	}
	
}
