package Month;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		Ask user to enter the number of month.
//		Read the value and write the amount of days in this month 
//		(create array with amount days of each month)

		Month[] m = new Month[12];
		m[0] = new Month(31, "January");
		m[1] = new Month(28, "February");
		m[2] = new Month(31, "March");
		m[3] = new Month(30, "April");
		m[4] = new Month(31, "May");
		m[5] = new Month(30, "June");
		m[6] = new Month(31, "July");
		m[7] = new Month(31, "August");
		m[8] = new Month(30, "September");
		m[9] = new Month(31, "October");
		m[10] = new Month(30, "November");
		m[11] = new Month(31, "December");

		System.out.println("Enter the number of month");
		int month = input.nextInt();

		for (int i = 0; i < m.length; i++) {
			if (i == (month - 1))
				System.out.println(m[i]);
		}

		input.close();
	}

}
