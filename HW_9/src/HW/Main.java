package HW;

import java.util.Scanner;

/**
 * Created by Evey on 09.07.2017.
 */
public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double a, b;

		Main m = new Main();
		try {
			System.out.println("1");
			a = input.nextDouble();
			System.out.println("2");
			b = input.nextDouble();
			m.div(a, b);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			input.close();
		}

	}

	void div(double a, double b) {
		if (b == 0 || a == 0) {
			throw new ArithmeticException();
		}
		System.out.println("Result of " + a + " divided by " + b + " is : " + a / b);
	}

}
