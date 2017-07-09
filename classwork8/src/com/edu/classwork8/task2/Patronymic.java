package com.edu.classwork8.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patronymic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter surname, name and patronymic accordingly:");
		String stringToCheck = sc.nextLine();
	    Pattern p = Pattern.compile("([A-Za-z]+)\\s+([A-Za-z]+)\\s+([A-Za-z]+)");
	    Matcher m = p.matcher(stringToCheck);
	    m.find();
	    System.out.println("\n" + m.group(1)+ " " + m.group(2).charAt(0) + "." + 
	    		m.group(3).charAt(0) + ".\n" + m.group(2) + "\n" + m.group(2) + 
	    		" " + m.group(3) + " " + m.group(1));
	    sc.close();

	}

}
