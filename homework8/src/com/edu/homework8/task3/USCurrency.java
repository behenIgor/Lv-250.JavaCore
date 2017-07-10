package com.edu.homework8.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USCurrency {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some US occurrences:");
		String[] stringToCheck = sc.nextLine().split(" ");
		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})");
		
		for (String string : stringToCheck) {
			Matcher m = p.matcher(string);
			m.find();
			if (m.matches()) {
				System.out.println(string);
			}
		}
		
		sc.close();
		
	}

}
