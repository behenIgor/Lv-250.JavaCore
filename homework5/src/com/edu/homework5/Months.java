package com.edu.homework5;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of month: ");
		
		int numberOfMonth = sc.nextInt();
		int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int tenIntegers [] = {-5, -25, -10, -2, -8, 1, 47, 6, 9, 7};
		int sumOfFirstFive = 0;
		int productOfNegative = 1;
		boolean negativityOfFirstFive = true;
		boolean positivityOfLastFive = true;
		int fiveIntegers [] = {5, -5, 0, 2, 9};
		int count = 0;
		int minNumber = 0;
		int positionOfMin = 0;
		int productOfEntered = 1;
		
		if (numberOfMonth > 0 && numberOfMonth <= 12) {
			System.out.println("This month has " + month[numberOfMonth - 1] + " days.");
		} else {
			System.out.println("Wrong number! It must belong to the range from 1 to 12.");
		}
		
		for (int i = 0; i < tenIntegers.length / 2; i++) {
			if (tenIntegers[i] >= 0) {
				negativityOfFirstFive = false;
			}
		}
		
		for (int i = tenIntegers.length / 2; i < tenIntegers.length; i++) {
			if (tenIntegers[i] < 0) {
				positivityOfLastFive = false;
			}
		}
		
		if (negativityOfFirstFive == true) {
			for (int i = 0; i < tenIntegers.length / 2; i++) {
				sumOfFirstFive += tenIntegers[i];
			}
			System.out.println();
			System.out.println("Sum of first five elements in in ten integers array: " +
			sumOfFirstFive);
		}
		
		if (positivityOfLastFive == true) {
			for (int i = tenIntegers.length / 2; i < tenIntegers.length; i++) {
				productOfNegative *= tenIntegers[i];
			}
			
			System.out.println("Product of last five elements in ten integers array: " + 
			productOfNegative);
		}
		
		for (int i = 0; i < fiveIntegers.length; i++) {
			if (fiveIntegers[i] > 0) {
				count++;
			}
			
			if (fiveIntegers[i] <= minNumber) {
				minNumber = fiveIntegers[i];
				positionOfMin = (i + 1);
			}
			
			if (count == 2) {
				System.out.println();
				System.out.println("Position of second positive number in five "
						+ "integers array: " + (i + 1));
			}
		}
		
		System.out.println("Min number in five integers array is " + minNumber + 
				". It's position is " + positionOfMin);
		
		System.out.println();
		
		while (true) {
			System.out.print("Enter integer: ");
			int number = sc.nextInt();
			if (number < 0) {
				sc.close();
				break;
			}
			productOfEntered *= number;
		}
		
		System.out.println();
		System.out.println("Product of entered integers: " + productOfEntered);
		
		sc.close();
		
	}
		

}
