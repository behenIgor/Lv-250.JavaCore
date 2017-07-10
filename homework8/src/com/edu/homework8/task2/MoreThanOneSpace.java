package com.edu.homework8.task2;

public class MoreThanOneSpace {

	public static void main(String[] args) {
		
		String sentence = "And I    think    to    myself   what a  wonderful world";
		String[] sentenceSplit = sentence.split("\\s+");
		
		for (int i = 0; i < sentenceSplit.length; i++) {
			System.out.print(sentenceSplit[i] + " ");
		}

	}

}
