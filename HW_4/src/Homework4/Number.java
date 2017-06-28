package Homework4;
import java.util.Scanner;
import java.util.Arrays;

public class Number {

	public static void main(String[] args) {
		belongToTheRange ();
		numbers();
	}
	
	public static void belongToTheRange (){
		Scanner input = new Scanner(System.in);
		
		// a
		float num = 0;
		int i = 0;
		while (i < 3) {
			System.out.println("enter the number");
			num = input.nextFloat();
			if (num >= -5 && num <= 5)
				System.out.println(num + " belong to the range [-5,5]");
			else
				System.out.println(num + " dont belong to the range [-5,5]");
			i++;
		}
		input.close();
	}
	
	public static void numbers(){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the 3 numbers");
		int[] numb = { input.nextInt(), input.nextInt(), input.nextInt() };

		int min = Arrays.stream(numb).min().getAsInt();
		int max = Arrays.stream(numb).max().getAsInt();

		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
		input.close();
		
	}

}
