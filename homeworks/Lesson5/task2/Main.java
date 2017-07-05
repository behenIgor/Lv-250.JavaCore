package task2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Random rand = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(16) - 5;
			System.out.print(arr[i] + " ");
		}
		
		boolean j = true;
		
		for(int i=0; i<5; i++) {
			if(arr[i]<0)
				j = false;
		}
	
		if(j) {
			int sum = 0;
			for(int i=0; i<5; i++) {
				sum += arr[i];
			}
		System.out.println("\nSum = " + sum);
		}
		else {
			int prod = 1;
			for(int i=arr.length-1; i> arr.length-6; i--) {
				prod *=arr[i];
			}
		System.out.println("\nproduct = " + prod);
		}	
	}
}
