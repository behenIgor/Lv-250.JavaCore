package com.edu.classwork5;

public class TenIntegers {

	public static void main(String[] args) {
		
		int numbers [] = {-8, 2, 0, 11, 0, 100, -25, 100, -8, 10};
		int maxNumber = 0;
		int sumOfPositiveNumbers = 0;
		int amountOfNegativeNumbers = 0;
		int amountOfPositiveNumbers = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= maxNumber) {
				maxNumber = numbers[i];
			}
			
			if (numbers[i] < 0) {
				amountOfNegativeNumbers++;
			}
			
			if (numbers[i] > 0) {
				amountOfPositiveNumbers++;
			}
			
			if (numbers[i] > 0) {
				sumOfPositiveNumbers += numbers[i];
			}
		}
		
		System.out.println("Max number: " + maxNumber);
		System.out.println("Sum of positive numbers: " + sumOfPositiveNumbers);
		System.out.println("Amount of negative numbers: " + amountOfNegativeNumbers);
		
		if (amountOfNegativeNumbers > amountOfPositiveNumbers) {
			System.out.println("Negative numbers are more than positive");
		}
		
		if (amountOfNegativeNumbers < amountOfPositiveNumbers) {
			System.out.println("Positive numbers are more than negative");
		}
		

	}

}
