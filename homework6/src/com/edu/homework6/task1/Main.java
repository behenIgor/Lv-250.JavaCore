package com.edu.homework6.task1;

public class Main {

	public static void main(String[] args) {
		Bird bird[] = new Bird[4];
		bird[0] = new Eagle("black", 5);
		bird[1] = new Swallow("black and white", 3);
		bird[2] = new Penguin("black and white", 2);
		bird[3] = new Chicken("brown", 50);
		
		for (int i = 0; i < bird.length; i++) {
			System.out.println(bird[i].getClass().getSimpleName() + " has " + 
					bird[i].getFeathers() + " feathers and lay " + bird[i].getLayEggs() + 
					" eggs.");
			System.out.println("It is a " + bird[i].fly() + " bird.");
			System.out.println();
		}
		
		
	}

}
