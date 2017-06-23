package first.homework;

import javax.imageio.IIOException;
import java.util.Scanner;

public class SecondTask {
	private static Scanner in;
	
	public static void main(String[] args) throws IIOException {
		in = new Scanner(System.in);
		System.out.println("What is you name?");
		String name = in.nextLine();
		System.out.println("Where are you live?");
		String address = in.nextLine();
		System.out.printf("You are %s, and you live at the address: %s",name,address);
	}
}
