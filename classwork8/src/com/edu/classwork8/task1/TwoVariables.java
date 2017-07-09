package com.edu.classwork8.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TwoVariables {

	public static void main(String[] args) {
		
		String stringOne = "London is the capital of Great Britain";
		String stringTwo = "capital";
		Pattern p = Pattern.compile(stringTwo);
		Matcher m = p.matcher(stringOne);
		System.out.println(m.find());

	}

}
