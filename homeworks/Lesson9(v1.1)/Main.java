package tasks;

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
		arrOfNums[0] = 1;
		while(i<10) {
			try {
				if(i == 0) {
					arrOfNums[i] = met.readNumber(1, 100, in);
					i++;
				}
					arrOfNums[i] = met.readNumber(arrOfNums[i-1], 100, in);
					i++;
			} catch(NumberFormatException e) {
				System.out.println(" That is NOT a number!");
			} catch(OutOfRangeException e) {
				System.out.println(e);
			}
		}
		
		System.out.println();
		for (int j=0; j<arrOfNums.length; j++) {
			System.out.print(arrOfNums[j]);
			if(j<9) { System.out.print(" < "); }
		}
	}
}
