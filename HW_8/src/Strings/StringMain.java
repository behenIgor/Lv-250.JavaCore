package Strings;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		// 1
		Scanner input = new Scanner(System.in);
		StringMain sm = new StringMain();
		System.out.println("Enter a line: ");
		String str = input.nextLine();

		sm.longestWord(str);
		sm.reverse(str);

		// 2
		System.out.println();
		System.out.println(str.replaceAll("[\\s]{2,}", " "));
		
		//3
        String format = "$%.2f";
        System.out.printf(format,30.120030 );

		input.close();
	}

	void longestWord(String str) {
		if (str == null)
			return;
		String lw = "";
		int l = 0;
		String[] words = str.split(" ");
		for (String word : words) {
			if (word.length() > l) {
				lw = word;
				l = word.length();
			}
		}
		System.out.println("Longest word: " + lw + " letters = " + lw.length());
	}

	void reverse(String str) {
		if (str == null)
			return;
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (i == 1) {
				String[] word = words[i].split("");
				for (int z = word.length - 1; z >= 0; z--) {
					System.out.print(word[z] + " ");
				}
			}
		}
	}
}
