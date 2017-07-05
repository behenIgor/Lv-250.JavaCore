package task4;

import java.util.Scanner;
import javax.imageio.IIOException;

public class Main {

	public static void main(String[] args) throws IIOException {
		int num;
		int prod = 1;
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("Input integer number ");
			num = in.nextInt();
			if(num >= 0) {
				if(num%2 == 0) {
					prod *= num;
				}
			}
			else {
				break;
			}
		}
		in.close();
		System.out.println("product of all entered even numbers = "+prod);
		
	}

}
