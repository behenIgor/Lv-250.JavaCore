package tasks;

import java.util.Scanner;

public class Methods {
	private double resDive;
	private int resInInt;
	
	
	public double div(double num1, double num2) throws NumberFormatException  {
		resDive = num1/num2;
		if(Double.isFinite(resDive)) {
			return resDive;
		}
		throw new NumberFormatException("Resault  is infinite");
	}
	
	
	public int readNumber(int start, int end, Scanner in) throws NumberFormatException, OutOfRangeException {
		System.out.printf("Input integer number in the range [%d,%d]%n",start,end);
		
		resInInt = Integer.parseInt(in.nextLine());
		if(resInInt < end + 1 && resInInt > start - 1) { return resInInt; }
		else { throw new OutOfRangeException("number is out of range!"); }
	}
}
