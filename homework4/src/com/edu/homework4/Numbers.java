package com.edu.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
	
	public enum HTTPError {
		BadRequest, Unauthorized, PaymentRequired, UnidentifiedError
		
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Enter 3 float numbers:");
		
		float floatNumber1 = Float.parseFloat(br.readLine());
		float floatNumber2 = Float.parseFloat(br.readLine());
		float floatNumber3 = Float.parseFloat(br.readLine());
		
		if ((-5.0 <= floatNumber1 && floatNumber1 <= 5.0) && 
				(-5.0 <= floatNumber2 && floatNumber2 <= 5.0) &&
				(-5.0 <= floatNumber3 && floatNumber3 <= 5.0)) {
			System.out.println("All numbers belong to the range [-5;5].");
		} else {
			System.out.println("Some or all numbers don't belong to the range [-5;5].");
		}
		
		System.out.println();
		System.out.println("Enter 3 integer numbers:");
		
		int intNumber1 = Integer.parseInt(br.readLine());
		int intNumber2 = Integer.parseInt(br.readLine());
		int intNumber3 = Integer.parseInt(br.readLine());
		
		System.out.println("Max number: " + Math.max(intNumber1, Math.max(intNumber2, intNumber3)));
		System.out.println("Min number: " + Math.min(intNumber1, Math.min(intNumber2, intNumber3)));
		
		System.out.println();
		System.out.print("Enter number of HTTP error: ");
		int numberOfHTTPError = Integer.parseInt(br.readLine());
		System.out.println("Name of this error: " + getHTTPError(numberOfHTTPError));
		
	}
	
	public static String getHTTPError(int numberOfHTTPError) {
		
		switch (numberOfHTTPError) {
		
		case 400:
			return HTTPError.BadRequest.name();
			
		case 401:
			return HTTPError.Unauthorized.name();
			
		case 402:
			return HTTPError.PaymentRequired.name();
			
		}
		return HTTPError.UnidentifiedError.name();
	}
	
}

