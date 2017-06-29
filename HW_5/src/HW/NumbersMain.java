package HW;

import java.util.Scanner;

public class NumbersMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
//		Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive 
//		or product of last 5 element in the other case.

		System.out.println("Enter 10 integer numbers");

		int[] numbs = new int[10];
		for (int i = 0; i < numbs.length; i++) {
			numbs[i] = input.nextInt();
		}
		int sum = 0;
		int num = 1;
		int n = 0;

		for (int i = 0; i < numbs.length; i++) {
			if (numbs[i] > 0 && i < 5) {
				sum += numbs[i];
				n++;
				if (n == 5)
					break;
			} else {
				sum = 0;
				if (i >= 5) {
					num *= numbs[i];
				}
			}
		}
		System.out.println("First five " + sum + " Last five " + num);
		
//		Ente9r 5 integer numbers. Find 
//		position of second positive number;
//		minimum and its position in the array.

		int m = 0;
		int p = 0;
		int min = 0;
		int[] arr = { 2, 5, 7, -94, -98 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				++m;
				if (m == 2) {
					System.out.println("second positive numbe " + arr[i] + " position " + i);
				}
			}
			if (arr[i] < min) {
				min = arr[i];
				p = i;
			}
		}
		System.out.println("min " + min + " position " + p);
		
//		Organize entering integers until the first negative number. 
//		Count the product of all entered even numbers.
		
		int sumN = 1;
		int numbr = 1;
		while (numbr > 0){
			sumN*=numbr;
			numbr = input.nextInt();
		} 
		System.out.println(sumN);

		input.close();
	}

}
