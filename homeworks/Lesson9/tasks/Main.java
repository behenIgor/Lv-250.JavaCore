package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Methods met = new Methods();

		double num1 = 12;
		double num2 = 0;
		double res = 0;
		try{
			res = met.div(num1, num2);
		} 
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println(res);
		
		
		int[] arrOfNums = new int[10];
		Scanner in = new Scanner(System.in);
		int i = 0;
		
		while(i<10) {
			try {
				arrOfNums[i] = met.readNumber(1, 100, in);
				i++;
			} catch(NumberFormatException e) {
				System.out.println(" That is NOT a number!");
			} catch(OutOfRangeException e) {
				System.out.println(e);
			}
		}
		System.out.println();
		for (int j : arrOfNums) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		for (int j = 0; j < arrOfNums.length; j++) {
			for (int k = 0; k < arrOfNums.length-j-1; k++) {
				if(arrOfNums[k] > arrOfNums[k+1]) {
					arrOfNums[k] = arrOfNums[k]^arrOfNums[k+1];
					arrOfNums[k+1] = arrOfNums[k+1]^arrOfNums[k];
					arrOfNums[k] = arrOfNums[k]^arrOfNums[k+1];
				}	
			}	
		}
		
		for (int j=0; j<arrOfNums.length; j++) {
			System.out.print(arrOfNums[j]);
			if(j<9) { System.out.print(" < "); }
		}
	}

}
