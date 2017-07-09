package task2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter a sentence that contains the words between more than one space");
		Scanner in = new Scanner(System.in);
		String sent = in.nextLine();
		in.close();
		sent = sent.replaceAll("\\s+"," ");
		System.out.println(sent);
	}
}
