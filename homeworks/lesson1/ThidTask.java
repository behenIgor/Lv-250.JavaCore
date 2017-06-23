package first.homework;

import javax.imageio.IIOException;
import java.util.Scanner;

public class ThidTask {
	private static Scanner in;
	public static void main(String[] args) throws IIOException {
		in = new Scanner(System.in);
		System.out.println("Input the first call duration in minutes");
		double time1 = in.nextDouble();
		System.out.println("Input the standard units per minute of the first call");
		double price1 = in.nextDouble();
		System.out.println("Input the second call duration in minutes");
		double time2 = in.nextDouble();
		System.out.println("Input the standard units per minute of the second call");
		double price2 = in.nextDouble();
		System.out.println("Input the third call duration in minutes");
		double time3 = in.nextDouble();
		System.out.println("Input the standard units per minute of the third call");
		double price3 = in.nextDouble();
		
		double cost1 = time1*price1;
		double cost2 = time2*price2;
		double cost3 = time3*price3;
		double allCost = cost1+cost2+cost3;
		
		System.out.printf("%nThe cost of the first call is \t %.2f\ts.u.",cost1);	
		System.out.printf("%nThe cost of the second call is \t %.2f\ts.u.",cost2);
		System.out.printf("%nThe cost of the third call is \t %.2f\ts.u.",cost3);
		System.out.printf("%n%nThe cost of the all calls is \t %.2f\ts.u.",allCost);
	}
}
