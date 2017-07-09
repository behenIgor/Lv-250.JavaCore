package task1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the sentence of five words.");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		in.close();
		
		
		String[] arrStr = str.split(" ");
		int j = 0;
		for (int i = 0; i < arrStr.length; i++) {
			if(arrStr[i].length() > arrStr[j].length()) { j = i; }
		}
		System.out.printf("The biggest word is [%s]",arrStr[j]);
		
		
		System.out.printf("%n[%s] has a %s letters%n",arrStr[j], arrStr[j].length());
		
		
		char[] secondWord = arrStr[1].toCharArray();
		for (int i = secondWord.length-1; i >= 0; i--) {
			System.out.print(secondWord[i]);
		}
	}
}
