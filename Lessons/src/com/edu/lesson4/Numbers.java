package com.edu.lesson4;

public class Numbers {

	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		numbers.checkParity(0);
		numbers.checkParity(1);
		numbers.checkParity(2);

	}
	
	private void checkParity(int number) {
		if (number % 2 == 0) {
			System.out.println("Number " + number + " is pair.");
		} else System.out.println("Number " + number + " is odd.");;
	}

}
