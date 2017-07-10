package com.edu.homework8.task1;

import java.util.Scanner;

public class FiveWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String[] sentence = sc.nextLine().split("\\s+");
		
		String longestWord = "";
        int l = 0;
		
		for(String word: sentence) {
                if(word.length() > l) {
                		longestWord = word;
                        l = word.length();
                }
        }
		
		System.out.println("\nThe longest word in this sentence is \"" + 
				longestWord + "\"\nIt has " + longestWord.length() + " letters.");
		
		StringBuilder sb = new StringBuilder(sentence[1]);
		sb.reverse();
		sentence[1] = sb.toString();
		
		for (int i = 0; i < sentence.length; i++) {
			System.out.print(sentence[i] + " ");
		}
		
		sc.close();

	}

}
