package com.edu.homework6.task1;

public class NonFlyingBird extends Bird {

	public String fly() {
		return "walking";
	}

	public NonFlyingBird() {
		super();
	}

	public NonFlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
	}
	
	
	
}
