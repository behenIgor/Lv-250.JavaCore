package task3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Random rand = new Random();
		int quantOfPositNums = 0;
		int indexOfSecPositive = 0;
		int min = 10;
		int indexOfmin = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(11) - 5;
			System.out.print(arr[i] + " ");
			if(arr[i]>=0) {
				quantOfPositNums += 1;
				if(quantOfPositNums == 2) {
					indexOfSecPositive = i;
				}
			}
			if(arr[i]<min) {
				min = arr[i];
				indexOfmin = i;
			}
		}
		if(quantOfPositNums >= 2) {
			System.out.println("\nposition of second positive number is "+(indexOfSecPositive+1));
		}
		else {
			System.out.println("\nwe have not two positive numbers");
		}
		System.out.println("\nminimum = "+min+ ", in position "+(indexOfmin+1));
	}

}
